// DO NOT EDIT.  Make changes to com.as.model.Person.java instead.
package com.as.model.gen;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import java.math.*;
import java.util.*;
import org.apache.log4j.Logger;

import er.extensions.eof.*;
import er.extensions.foundation.*;

@SuppressWarnings("all")
public abstract class _Person extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Person";

  // Attribute Keys
  public static final ERXKey<String> EMAIL_ADDRESS = new ERXKey<String>("emailAddress");
  public static final ERXKey<String> FIRST_NAME = new ERXKey<String>("firstName");
  public static final ERXKey<Boolean> IS_ACCOUNT_EXEC = new ERXKey<Boolean>("isAccountExec");
  public static final ERXKey<Boolean> IS_ACTIVE = new ERXKey<Boolean>("isActive");
  public static final ERXKey<String> LAST_NAME = new ERXKey<String>("lastName");
  public static final ERXKey<String> LOGIN_NAME = new ERXKey<String>("loginName");
  public static final ERXKey<String> PASSWORD = new ERXKey<String>("password");
  // Relationship Keys
  public static final ERXKey<com.as.model.Client> CLIENTS = new ERXKey<com.as.model.Client>("clients");
  public static final ERXKey<com.as.model.ProjectStep> PROJECT_STEPS = new ERXKey<com.as.model.ProjectStep>("projectSteps");

  // Attributes
  public static final String EMAIL_ADDRESS_KEY = EMAIL_ADDRESS.key();
  public static final String FIRST_NAME_KEY = FIRST_NAME.key();
  public static final String IS_ACCOUNT_EXEC_KEY = IS_ACCOUNT_EXEC.key();
  public static final String IS_ACTIVE_KEY = IS_ACTIVE.key();
  public static final String LAST_NAME_KEY = LAST_NAME.key();
  public static final String LOGIN_NAME_KEY = LOGIN_NAME.key();
  public static final String PASSWORD_KEY = PASSWORD.key();
  // Relationships
  public static final String CLIENTS_KEY = CLIENTS.key();
  public static final String PROJECT_STEPS_KEY = PROJECT_STEPS.key();

  private static Logger LOG = Logger.getLogger(_Person.class);

  public com.as.model.Person localInstanceIn(EOEditingContext editingContext) {
    com.as.model.Person localInstance = (com.as.model.Person)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String emailAddress() {
    return (String) storedValueForKey(_Person.EMAIL_ADDRESS_KEY);
  }

  public void setEmailAddress(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating emailAddress from " + emailAddress() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.EMAIL_ADDRESS_KEY);
  }

  public String firstName() {
    return (String) storedValueForKey(_Person.FIRST_NAME_KEY);
  }

  public void setFirstName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating firstName from " + firstName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.FIRST_NAME_KEY);
  }

  public Boolean isAccountExec() {
    return (Boolean) storedValueForKey(_Person.IS_ACCOUNT_EXEC_KEY);
  }

  public void setIsAccountExec(Boolean value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating isAccountExec from " + isAccountExec() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.IS_ACCOUNT_EXEC_KEY);
  }

  public Boolean isActive() {
    return (Boolean) storedValueForKey(_Person.IS_ACTIVE_KEY);
  }

  public void setIsActive(Boolean value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating isActive from " + isActive() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.IS_ACTIVE_KEY);
  }

  public String lastName() {
    return (String) storedValueForKey(_Person.LAST_NAME_KEY);
  }

  public void setLastName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating lastName from " + lastName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.LAST_NAME_KEY);
  }

  public String loginName() {
    return (String) storedValueForKey(_Person.LOGIN_NAME_KEY);
  }

  public void setLoginName(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating loginName from " + loginName() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.LOGIN_NAME_KEY);
  }

  public String password() {
    return (String) storedValueForKey(_Person.PASSWORD_KEY);
  }

  public void setPassword(String value) {
    if (_Person.LOG.isDebugEnabled()) {
    	_Person.LOG.debug( "updating password from " + password() + " to " + value);
    }
    takeStoredValueForKey(value, _Person.PASSWORD_KEY);
  }

  public NSArray<com.as.model.Client> clients() {
    return (NSArray<com.as.model.Client>)storedValueForKey(_Person.CLIENTS_KEY);
  }

  public NSArray<com.as.model.Client> clients(EOQualifier qualifier) {
    return clients(qualifier, null, false);
  }

  public NSArray<com.as.model.Client> clients(EOQualifier qualifier, boolean fetch) {
    return clients(qualifier, null, fetch);
  }

  public NSArray<com.as.model.Client> clients(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.Client> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.Client.ACCOUNT_EXEC_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.Client.fetchClients(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = clients();
      if (qualifier != null) {
        results = (NSArray<com.as.model.Client>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.Client>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToClients(com.as.model.Client object) {
    includeObjectIntoPropertyWithKey(object, _Person.CLIENTS_KEY);
  }

  public void removeFromClients(com.as.model.Client object) {
    excludeObjectFromPropertyWithKey(object, _Person.CLIENTS_KEY);
  }

  public void addToClientsRelationship(com.as.model.Client object) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("adding " + object + " to clients relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToClients(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Person.CLIENTS_KEY);
    }
  }

  public void removeFromClientsRelationship(com.as.model.Client object) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("removing " + object + " from clients relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromClients(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Person.CLIENTS_KEY);
    }
  }

  public com.as.model.Client createClientsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.Client.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Person.CLIENTS_KEY);
    return (com.as.model.Client) eo;
  }

  public void deleteClientsRelationship(com.as.model.Client object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Person.CLIENTS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllClientsRelationships() {
    Enumeration<com.as.model.Client> objects = clients().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteClientsRelationship(objects.nextElement());
    }
  }

  public NSArray<com.as.model.ProjectStep> projectSteps() {
    return (NSArray<com.as.model.ProjectStep>)storedValueForKey(_Person.PROJECT_STEPS_KEY);
  }

  public NSArray<com.as.model.ProjectStep> projectSteps(EOQualifier qualifier) {
    return projectSteps(qualifier, null, false);
  }

  public NSArray<com.as.model.ProjectStep> projectSteps(EOQualifier qualifier, boolean fetch) {
    return projectSteps(qualifier, null, fetch);
  }

  public NSArray<com.as.model.ProjectStep> projectSteps(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.ProjectStep> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.ProjectStep.STEP_ASSIGNED_TO_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.ProjectStep.fetchProjectSteps(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = projectSteps();
      if (qualifier != null) {
        results = (NSArray<com.as.model.ProjectStep>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.ProjectStep>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToProjectSteps(com.as.model.ProjectStep object) {
    includeObjectIntoPropertyWithKey(object, _Person.PROJECT_STEPS_KEY);
  }

  public void removeFromProjectSteps(com.as.model.ProjectStep object) {
    excludeObjectFromPropertyWithKey(object, _Person.PROJECT_STEPS_KEY);
  }

  public void addToProjectStepsRelationship(com.as.model.ProjectStep object) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("adding " + object + " to projectSteps relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProjectSteps(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Person.PROJECT_STEPS_KEY);
    }
  }

  public void removeFromProjectStepsRelationship(com.as.model.ProjectStep object) {
    if (_Person.LOG.isDebugEnabled()) {
      _Person.LOG.debug("removing " + object + " from projectSteps relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProjectSteps(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Person.PROJECT_STEPS_KEY);
    }
  }

  public com.as.model.ProjectStep createProjectStepsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.ProjectStep.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Person.PROJECT_STEPS_KEY);
    return (com.as.model.ProjectStep) eo;
  }

  public void deleteProjectStepsRelationship(com.as.model.ProjectStep object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Person.PROJECT_STEPS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProjectStepsRelationships() {
    Enumeration<com.as.model.ProjectStep> objects = projectSteps().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProjectStepsRelationship(objects.nextElement());
    }
  }


  public static com.as.model.Person createPerson(EOEditingContext editingContext, String firstName
, Boolean isAccountExec
, Boolean isActive
, String lastName
, String loginName
, String password
) {
    com.as.model.Person eo = (com.as.model.Person) EOUtilities.createAndInsertInstance(editingContext, _Person.ENTITY_NAME);    
		eo.setFirstName(firstName);
		eo.setIsAccountExec(isAccountExec);
		eo.setIsActive(isActive);
		eo.setLastName(lastName);
		eo.setLoginName(loginName);
		eo.setPassword(password);
    return eo;
  }

  public static ERXFetchSpecification<com.as.model.Person> fetchSpec() {
    return new ERXFetchSpecification<com.as.model.Person>(_Person.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.as.model.Person> fetchAllPersons(EOEditingContext editingContext) {
    return _Person.fetchAllPersons(editingContext, null);
  }

  public static NSArray<com.as.model.Person> fetchAllPersons(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Person.fetchPersons(editingContext, null, sortOrderings);
  }

  public static NSArray<com.as.model.Person> fetchPersons(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.as.model.Person> fetchSpec = new ERXFetchSpecification<com.as.model.Person>(_Person.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.as.model.Person> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.as.model.Person fetchPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _Person.fetchPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Person fetchPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.as.model.Person> eoObjects = _Person.fetchPersons(editingContext, qualifier, null);
    com.as.model.Person eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Person that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Person fetchRequiredPerson(EOEditingContext editingContext, String keyName, Object value) {
    return _Person.fetchRequiredPerson(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Person fetchRequiredPerson(EOEditingContext editingContext, EOQualifier qualifier) {
    com.as.model.Person eoObject = _Person.fetchPerson(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Person that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Person localInstanceIn(EOEditingContext editingContext, com.as.model.Person eo) {
    com.as.model.Person localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }
  public static NSArray<com.as.model.Person> fetchActivePeople(EOEditingContext editingContext, NSDictionary<String, Object> bindings) {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("activePeople", _Person.ENTITY_NAME);
    fetchSpec = fetchSpec.fetchSpecificationWithQualifierBindings(bindings);
    return (NSArray<com.as.model.Person>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  
  public static NSArray<com.as.model.Person> fetchActivePeople(EOEditingContext editingContext)
  {
    EOFetchSpecification fetchSpec = EOFetchSpecification.fetchSpecificationNamed("activePeople", _Person.ENTITY_NAME);
    return (NSArray<com.as.model.Person>)editingContext.objectsWithFetchSpecification(fetchSpec);
  }
  

}
