// DO NOT EDIT.  Make changes to com.as.model.ProjectStep.java instead.
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
public abstract class _ProjectStep extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "ProjectStep";

  // Attribute Keys
  public static final ERXKey<Boolean> COMPLETE = new ERXKey<Boolean>("complete");
  public static final ERXKey<NSTimestamp> DUE_DATE = new ERXKey<NSTimestamp>("dueDate");
  public static final ERXKey<Boolean> IS_HOT = new ERXKey<Boolean>("isHot");
  public static final ERXKey<String> STEP_TEXT = new ERXKey<String>("stepText");
  // Relationship Keys
  public static final ERXKey<com.as.model.Project> PROJECT = new ERXKey<com.as.model.Project>("project");
  public static final ERXKey<com.as.model.Person> STEP_ASSIGNED_TO = new ERXKey<com.as.model.Person>("stepAssignedTo");

  // Attributes
  public static final String COMPLETE_KEY = COMPLETE.key();
  public static final String DUE_DATE_KEY = DUE_DATE.key();
  public static final String IS_HOT_KEY = IS_HOT.key();
  public static final String STEP_TEXT_KEY = STEP_TEXT.key();
  // Relationships
  public static final String PROJECT_KEY = PROJECT.key();
  public static final String STEP_ASSIGNED_TO_KEY = STEP_ASSIGNED_TO.key();

  private static Logger LOG = Logger.getLogger(_ProjectStep.class);

  public com.as.model.ProjectStep localInstanceIn(EOEditingContext editingContext) {
    com.as.model.ProjectStep localInstance = (com.as.model.ProjectStep)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public Boolean complete() {
    return (Boolean) storedValueForKey(_ProjectStep.COMPLETE_KEY);
  }

  public void setComplete(Boolean value) {
    if (_ProjectStep.LOG.isDebugEnabled()) {
    	_ProjectStep.LOG.debug( "updating complete from " + complete() + " to " + value);
    }
    takeStoredValueForKey(value, _ProjectStep.COMPLETE_KEY);
  }

  public NSTimestamp dueDate() {
    return (NSTimestamp) storedValueForKey(_ProjectStep.DUE_DATE_KEY);
  }

  public void setDueDate(NSTimestamp value) {
    if (_ProjectStep.LOG.isDebugEnabled()) {
    	_ProjectStep.LOG.debug( "updating dueDate from " + dueDate() + " to " + value);
    }
    takeStoredValueForKey(value, _ProjectStep.DUE_DATE_KEY);
  }

  public Boolean isHot() {
    return (Boolean) storedValueForKey(_ProjectStep.IS_HOT_KEY);
  }

  public void setIsHot(Boolean value) {
    if (_ProjectStep.LOG.isDebugEnabled()) {
    	_ProjectStep.LOG.debug( "updating isHot from " + isHot() + " to " + value);
    }
    takeStoredValueForKey(value, _ProjectStep.IS_HOT_KEY);
  }

  public String stepText() {
    return (String) storedValueForKey(_ProjectStep.STEP_TEXT_KEY);
  }

  public void setStepText(String value) {
    if (_ProjectStep.LOG.isDebugEnabled()) {
    	_ProjectStep.LOG.debug( "updating stepText from " + stepText() + " to " + value);
    }
    takeStoredValueForKey(value, _ProjectStep.STEP_TEXT_KEY);
  }

  public com.as.model.Project project() {
    return (com.as.model.Project)storedValueForKey(_ProjectStep.PROJECT_KEY);
  }
  
  public void setProject(com.as.model.Project value) {
    takeStoredValueForKey(value, _ProjectStep.PROJECT_KEY);
  }

  public void setProjectRelationship(com.as.model.Project value) {
    if (_ProjectStep.LOG.isDebugEnabled()) {
      _ProjectStep.LOG.debug("updating project from " + project() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setProject(value);
    }
    else if (value == null) {
    	com.as.model.Project oldValue = project();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _ProjectStep.PROJECT_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _ProjectStep.PROJECT_KEY);
    }
  }
  
  public com.as.model.Person stepAssignedTo() {
    return (com.as.model.Person)storedValueForKey(_ProjectStep.STEP_ASSIGNED_TO_KEY);
  }
  
  public void setStepAssignedTo(com.as.model.Person value) {
    takeStoredValueForKey(value, _ProjectStep.STEP_ASSIGNED_TO_KEY);
  }

  public void setStepAssignedToRelationship(com.as.model.Person value) {
    if (_ProjectStep.LOG.isDebugEnabled()) {
      _ProjectStep.LOG.debug("updating stepAssignedTo from " + stepAssignedTo() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setStepAssignedTo(value);
    }
    else if (value == null) {
    	com.as.model.Person oldValue = stepAssignedTo();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _ProjectStep.STEP_ASSIGNED_TO_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _ProjectStep.STEP_ASSIGNED_TO_KEY);
    }
  }
  

  public static com.as.model.ProjectStep createProjectStep(EOEditingContext editingContext, Boolean complete
, NSTimestamp dueDate
, Boolean isHot
, String stepText
, com.as.model.Project project, com.as.model.Person stepAssignedTo) {
    com.as.model.ProjectStep eo = (com.as.model.ProjectStep) EOUtilities.createAndInsertInstance(editingContext, _ProjectStep.ENTITY_NAME);    
		eo.setComplete(complete);
		eo.setDueDate(dueDate);
		eo.setIsHot(isHot);
		eo.setStepText(stepText);
    eo.setProjectRelationship(project);
    eo.setStepAssignedToRelationship(stepAssignedTo);
    return eo;
  }

  public static ERXFetchSpecification<com.as.model.ProjectStep> fetchSpec() {
    return new ERXFetchSpecification<com.as.model.ProjectStep>(_ProjectStep.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.as.model.ProjectStep> fetchAllProjectSteps(EOEditingContext editingContext) {
    return _ProjectStep.fetchAllProjectSteps(editingContext, null);
  }

  public static NSArray<com.as.model.ProjectStep> fetchAllProjectSteps(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _ProjectStep.fetchProjectSteps(editingContext, null, sortOrderings);
  }

  public static NSArray<com.as.model.ProjectStep> fetchProjectSteps(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.as.model.ProjectStep> fetchSpec = new ERXFetchSpecification<com.as.model.ProjectStep>(_ProjectStep.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.as.model.ProjectStep> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.as.model.ProjectStep fetchProjectStep(EOEditingContext editingContext, String keyName, Object value) {
    return _ProjectStep.fetchProjectStep(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.ProjectStep fetchProjectStep(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.as.model.ProjectStep> eoObjects = _ProjectStep.fetchProjectSteps(editingContext, qualifier, null);
    com.as.model.ProjectStep eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one ProjectStep that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.ProjectStep fetchRequiredProjectStep(EOEditingContext editingContext, String keyName, Object value) {
    return _ProjectStep.fetchRequiredProjectStep(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.ProjectStep fetchRequiredProjectStep(EOEditingContext editingContext, EOQualifier qualifier) {
    com.as.model.ProjectStep eoObject = _ProjectStep.fetchProjectStep(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no ProjectStep that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.ProjectStep localInstanceIn(EOEditingContext editingContext, com.as.model.ProjectStep eo) {
    com.as.model.ProjectStep localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
