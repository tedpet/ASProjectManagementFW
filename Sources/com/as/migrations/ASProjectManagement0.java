package com.as.migrations;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;

import er.extensions.jdbc.ERXJDBCUtilities;
import er.extensions.migration.ERXMigrationDatabase;
import er.extensions.migration.ERXMigrationDatabase.Migration;
import er.extensions.migration.ERXMigrationTable;
import er.extensions.migration.ERXModelVersion;

public class ASProjectManagement0 extends Migration {

	@Override
	public void downgrade(EOEditingContext editingContext,
			ERXMigrationDatabase database) throws Throwable {
		// TODO Auto-generated method stub

	}
	
	@Override
	 public NSArray<ERXModelVersion> modelDependencies() {
	       return new NSArray<ERXModelVersion>(new ERXModelVersion("ERCoreBL", 0));
	 }


	@Override
	public void upgrade(EOEditingContext editingContext, ERXMigrationDatabase database) throws Throwable {
		
		ERXMigrationTable clientTable = database.newTableNamed("client");
		clientTable.newLargeStringColumn("clientcontact", false);
		clientTable.newLargeStringColumn("clientname", false);
		clientTable.newIntegerColumn("id", false);
		clientTable.newFlagBooleanColumn("isactive", false);
		clientTable.newIntegerColumn("personid", true);
		clientTable.create();
	 	clientTable.setPrimaryKey("id");

		ERXMigrationTable personTable = database.newTableNamed("person");
		personTable.newLargeStringColumn("emailaddress", true);
		personTable.newLargeStringColumn("firstname", false);
		personTable.newIntegerColumn("id", false);
		personTable.newFlagBooleanColumn("isaccountexec", false);
		personTable.newFlagBooleanColumn("isactive", false);
		personTable.newLargeStringColumn("lastname", false);
		personTable.newLargeStringColumn("loginname", false);
		personTable.newLargeStringColumn("password", false);
		personTable.create();
	 	personTable.setPrimaryKey("id");

		ERXMigrationTable projectTable = database.newTableNamed("project");
		projectTable.newIntegerColumn("clientid", false);
		projectTable.newFlagBooleanColumn("complete", false);
		projectTable.newIntegerColumn("id", false);
		projectTable.newLargeStringColumn("jobdescription", false);
		projectTable.newLargeStringColumn("jobnumber", false);
		projectTable.newTimestampColumn("projectduedate", false);
		projectTable.create();
	 	projectTable.setPrimaryKey("id");

		ERXMigrationTable projectStepTable = database.newTableNamed("projectstep");
		projectStepTable.newFlagBooleanColumn("complete", false);
		projectStepTable.newTimestampColumn("duedate", false);
		projectStepTable.newIntegerColumn("id", false);
		projectStepTable.newFlagBooleanColumn("ishot", false);
		projectStepTable.newIntegerColumn("personid", false);
		projectStepTable.newIntegerColumn("projectid", false);
		projectStepTable.newLargeStringColumn("steptext", false);
		projectStepTable.create();
	 	projectStepTable.setPrimaryKey("id");

		clientTable.addForeignKey("personid", "person", "id");
		projectTable.addForeignKey("clientid", "client", "id");
		projectStepTable.addForeignKey("projectid", "project", "id");
		projectStepTable.addForeignKey("personid", "person", "id");

		/*
		 * insert the basic sql data then use the UPDATE to encrypt the password
		 * for the admin
		 */
		ERXJDBCUtilities.executeUpdateScriptFromResourceNamed(database.adaptorChannel(),
						"Startup-" + ERXJDBCUtilities.databaseProductName(database.adaptorChannel()) + ".sql", "ASProjectManagementFW");


	}

}
