// DO NOT EDIT.  Make changes to com.as.model.Project.java instead.
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
public abstract class _Project extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Project";

  // Attribute Keys
  public static final ERXKey<Boolean> COMPLETE = new ERXKey<Boolean>("complete");
  public static final ERXKey<String> JOB_DESCRIPTION = new ERXKey<String>("jobDescription");
  public static final ERXKey<String> JOB_NUMBER = new ERXKey<String>("jobNumber");
  public static final ERXKey<NSTimestamp> PROJECT_DUE_DATE = new ERXKey<NSTimestamp>("projectDueDate");
  // Relationship Keys
  public static final ERXKey<com.as.model.Client> CLIENT = new ERXKey<com.as.model.Client>("client");
  public static final ERXKey<com.as.model.ProjectStep> PROJECT_STEPS = new ERXKey<com.as.model.ProjectStep>("projectSteps");

  // Attributes
  public static final String COMPLETE_KEY = COMPLETE.key();
  public static final String JOB_DESCRIPTION_KEY = JOB_DESCRIPTION.key();
  public static final String JOB_NUMBER_KEY = JOB_NUMBER.key();
  public static final String PROJECT_DUE_DATE_KEY = PROJECT_DUE_DATE.key();
  // Relationships
  public static final String CLIENT_KEY = CLIENT.key();
  public static final String PROJECT_STEPS_KEY = PROJECT_STEPS.key();

  private static Logger LOG = Logger.getLogger(_Project.class);

  public com.as.model.Project localInstanceIn(EOEditingContext editingContext) {
    com.as.model.Project localInstance = (com.as.model.Project)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Boolean complete() {
    return (Boolean) storedValueForKey(_Project.COMPLETE_KEY);
  }

  public void setComplete(Boolean value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating complete from " + complete() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.COMPLETE_KEY);
  }

  public String jobDescription() {
    return (String) storedValueForKey(_Project.JOB_DESCRIPTION_KEY);
  }

  public void setJobDescription(String value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating jobDescription from " + jobDescription() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.JOB_DESCRIPTION_KEY);
  }

  public String jobNumber() {
    return (String) storedValueForKey(_Project.JOB_NUMBER_KEY);
  }

  public void setJobNumber(String value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating jobNumber from " + jobNumber() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.JOB_NUMBER_KEY);
  }

  public NSTimestamp projectDueDate() {
    return (NSTimestamp) storedValueForKey(_Project.PROJECT_DUE_DATE_KEY);
  }

  public void setProjectDueDate(NSTimestamp value) {
    if (_Project.LOG.isDebugEnabled()) {
    	_Project.LOG.debug( "updating projectDueDate from " + projectDueDate() + " to " + value);
    }
    takeStoredValueForKey(value, _Project.PROJECT_DUE_DATE_KEY);
  }

  public com.as.model.Client client() {
    return (com.as.model.Client)storedValueForKey(_Project.CLIENT_KEY);
  }
  
  public void setClient(com.as.model.Client value) {
    takeStoredValueForKey(value, _Project.CLIENT_KEY);
  }

  public void setClientRelationship(com.as.model.Client value) {
    if (_Project.LOG.isDebugEnabled()) {
      _Project.LOG.debug("updating client from " + client() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setClient(value);
    }
    else if (value == null) {
    	com.as.model.Client oldValue = client();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Project.CLIENT_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _Project.CLIENT_KEY);
    }
  }
  
  public NSArray<com.as.model.ProjectStep> projectSteps() {
    return (NSArray<com.as.model.ProjectStep>)storedValueForKey(_Project.PROJECT_STEPS_KEY);
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.ProjectStep.PROJECT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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
    includeObjectIntoPropertyWithKey(object, _Project.PROJECT_STEPS_KEY);
  }

  public void removeFromProjectSteps(com.as.model.ProjectStep object) {
    excludeObjectFromPropertyWithKey(object, _Project.PROJECT_STEPS_KEY);
  }

  public void addToProjectStepsRelationship(com.as.model.ProjectStep object) {
    if (_Project.LOG.isDebugEnabled()) {
      _Project.LOG.debug("adding " + object + " to projectSteps relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProjectSteps(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Project.PROJECT_STEPS_KEY);
    }
  }

  public void removeFromProjectStepsRelationship(com.as.model.ProjectStep object) {
    if (_Project.LOG.isDebugEnabled()) {
      _Project.LOG.debug("removing " + object + " from projectSteps relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProjectSteps(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Project.PROJECT_STEPS_KEY);
    }
  }

  public com.as.model.ProjectStep createProjectStepsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.ProjectStep.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Project.PROJECT_STEPS_KEY);
    return (com.as.model.ProjectStep) eo;
  }

  public void deleteProjectStepsRelationship(com.as.model.ProjectStep object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Project.PROJECT_STEPS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProjectStepsRelationships() {
    Enumeration<com.as.model.ProjectStep> objects = projectSteps().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProjectStepsRelationship(objects.nextElement());
    }
  }


  public static com.as.model.Project createProject(EOEditingContext editingContext, Boolean complete
, String jobDescription
, String jobNumber
, NSTimestamp projectDueDate
, com.as.model.Client client) {
    com.as.model.Project eo = (com.as.model.Project) EOUtilities.createAndInsertInstance(editingContext, _Project.ENTITY_NAME);    
		eo.setComplete(complete);
		eo.setJobDescription(jobDescription);
		eo.setJobNumber(jobNumber);
		eo.setProjectDueDate(projectDueDate);
    eo.setClientRelationship(client);
    return eo;
  }

  public static ERXFetchSpecification<com.as.model.Project> fetchSpec() {
    return new ERXFetchSpecification<com.as.model.Project>(_Project.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.as.model.Project> fetchAllProjects(EOEditingContext editingContext) {
    return _Project.fetchAllProjects(editingContext, null);
  }

  public static NSArray<com.as.model.Project> fetchAllProjects(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Project.fetchProjects(editingContext, null, sortOrderings);
  }

  public static NSArray<com.as.model.Project> fetchProjects(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.as.model.Project> fetchSpec = new ERXFetchSpecification<com.as.model.Project>(_Project.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.as.model.Project> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.as.model.Project fetchProject(EOEditingContext editingContext, String keyName, Object value) {
    return _Project.fetchProject(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Project fetchProject(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.as.model.Project> eoObjects = _Project.fetchProjects(editingContext, qualifier, null);
    com.as.model.Project eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Project that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Project fetchRequiredProject(EOEditingContext editingContext, String keyName, Object value) {
    return _Project.fetchRequiredProject(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Project fetchRequiredProject(EOEditingContext editingContext, EOQualifier qualifier) {
    com.as.model.Project eoObject = _Project.fetchProject(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Project that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Project localInstanceIn(EOEditingContext editingContext, com.as.model.Project eo) {
    com.as.model.Project localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
