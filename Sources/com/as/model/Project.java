package com.as.model;

import org.apache.log4j.Logger;

import com.as.model.Person;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;

import er.extensions.eof.ERXEC;
import er.extensions.eof.ERXQ;
import er.extensions.foundation.ERXThreadStorage;

public class Project extends com.as.model.gen._Project {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(Project.class);

	@Override
	protected void init(EOEditingContext ec) {
		// TODO Auto-generated method stub
		super.init(ec);

		this.setComplete(false);

		//		Person localPerson = ((Person) ERXThreadStorage.valueForKey("currentUser")).localInstanceIn(ec);
		//        setPersonRelationship(localPerson);
	}
	
	public ProjectStep currentProjectStep() {
		
		EOQualifier qual = ERXQ.and(ProjectStep.PROJECT.eq(this), ProjectStep.COMPLETE.eq(false));
		
		NSArray<ProjectStep> projectSteps = ProjectStep.fetchProjectSteps(this.editingContext(), qual, ProjectStep.DUE_DATE.ascs());
		if (projectSteps.count() > 0) {
			return projectSteps.objectAtIndex(0);
		}
		return null;
	}
	
	public ProjectStep nextProjectStep() {
		
		EOQualifier qual = ERXQ.and(ProjectStep.PROJECT.eq(this), ProjectStep.COMPLETE.eq(false));
		
		NSArray<ProjectStep> projectSteps = ProjectStep.fetchProjectSteps(this.editingContext(), qual, ProjectStep.DUE_DATE.ascs());
		if (projectSteps.count() > 1) {
			return projectSteps.objectAtIndex(1);
		}
		return null;
	}

}
