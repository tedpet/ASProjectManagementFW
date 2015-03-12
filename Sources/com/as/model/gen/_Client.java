// DO NOT EDIT.  Make changes to com.as.model.Client.java instead.
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
public abstract class _Client extends  ERXGenericRecord {
  public static final String ENTITY_NAME = "Client";

  // Attribute Keys
  public static final ERXKey<String> CLIENT_CONTACT = new ERXKey<String>("clientContact");
  public static final ERXKey<String> CLIENT_NAME = new ERXKey<String>("clientName");
  public static final ERXKey<Boolean> IS_ACTIVE = new ERXKey<Boolean>("isActive");
  // Relationship Keys
  public static final ERXKey<com.as.model.Person> ACCOUNT_EXEC = new ERXKey<com.as.model.Person>("accountExec");
  public static final ERXKey<com.as.model.Project> PROJECTS = new ERXKey<com.as.model.Project>("projects");

  // Attributes
  public static final String CLIENT_CONTACT_KEY = CLIENT_CONTACT.key();
  public static final String CLIENT_NAME_KEY = CLIENT_NAME.key();
  public static final String IS_ACTIVE_KEY = IS_ACTIVE.key();
  // Relationships
  public static final String ACCOUNT_EXEC_KEY = ACCOUNT_EXEC.key();
  public static final String PROJECTS_KEY = PROJECTS.key();

  private static Logger LOG = Logger.getLogger(_Client.class);

  public com.as.model.Client localInstanceIn(EOEditingContext editingContext) {
    com.as.model.Client localInstance = (com.as.model.Client)EOUtilities.localInstanceOfObject(editingContext, this);
    if (localInstance == null) {
      throw new IllegalStateException("You attempted to localInstance " + this + ", which has not yet committed.");
    }
    return localInstance;
  }

  public String clientContact() {
    return (String) storedValueForKey(_Client.CLIENT_CONTACT_KEY);
  }

  public void setClientContact(String value) {
    if (_Client.LOG.isDebugEnabled()) {
    	_Client.LOG.debug( "updating clientContact from " + clientContact() + " to " + value);
    }
    takeStoredValueForKey(value, _Client.CLIENT_CONTACT_KEY);
  }

  public String clientName() {
    return (String) storedValueForKey(_Client.CLIENT_NAME_KEY);
  }

  public void setClientName(String value) {
    if (_Client.LOG.isDebugEnabled()) {
    	_Client.LOG.debug( "updating clientName from " + clientName() + " to " + value);
    }
    takeStoredValueForKey(value, _Client.CLIENT_NAME_KEY);
  }

  public Boolean isActive() {
    return (Boolean) storedValueForKey(_Client.IS_ACTIVE_KEY);
  }

  public void setIsActive(Boolean value) {
    if (_Client.LOG.isDebugEnabled()) {
    	_Client.LOG.debug( "updating isActive from " + isActive() + " to " + value);
    }
    takeStoredValueForKey(value, _Client.IS_ACTIVE_KEY);
  }

  public com.as.model.Person accountExec() {
    return (com.as.model.Person)storedValueForKey(_Client.ACCOUNT_EXEC_KEY);
  }
  
  public void setAccountExec(com.as.model.Person value) {
    takeStoredValueForKey(value, _Client.ACCOUNT_EXEC_KEY);
  }

  public void setAccountExecRelationship(com.as.model.Person value) {
    if (_Client.LOG.isDebugEnabled()) {
      _Client.LOG.debug("updating accountExec from " + accountExec() + " to " + value);
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	setAccountExec(value);
    }
    else if (value == null) {
    	com.as.model.Person oldValue = accountExec();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, _Client.ACCOUNT_EXEC_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, _Client.ACCOUNT_EXEC_KEY);
    }
  }
  
  public NSArray<com.as.model.Project> projects() {
    return (NSArray<com.as.model.Project>)storedValueForKey(_Client.PROJECTS_KEY);
  }

  public NSArray<com.as.model.Project> projects(EOQualifier qualifier) {
    return projects(qualifier, null, false);
  }

  public NSArray<com.as.model.Project> projects(EOQualifier qualifier, boolean fetch) {
    return projects(qualifier, null, fetch);
  }

  public NSArray<com.as.model.Project> projects(EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings, boolean fetch) {
    NSArray<com.as.model.Project> results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(com.as.model.Project.CLIENT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray<EOQualifier> qualifiers = new NSMutableArray<EOQualifier>();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = com.as.model.Project.fetchProjects(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = projects();
      if (qualifier != null) {
        results = (NSArray<com.as.model.Project>)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray<com.as.model.Project>)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToProjects(com.as.model.Project object) {
    includeObjectIntoPropertyWithKey(object, _Client.PROJECTS_KEY);
  }

  public void removeFromProjects(com.as.model.Project object) {
    excludeObjectFromPropertyWithKey(object, _Client.PROJECTS_KEY);
  }

  public void addToProjectsRelationship(com.as.model.Project object) {
    if (_Client.LOG.isDebugEnabled()) {
      _Client.LOG.debug("adding " + object + " to projects relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	addToProjects(object);
    }
    else {
    	addObjectToBothSidesOfRelationshipWithKey(object, _Client.PROJECTS_KEY);
    }
  }

  public void removeFromProjectsRelationship(com.as.model.Project object) {
    if (_Client.LOG.isDebugEnabled()) {
      _Client.LOG.debug("removing " + object + " from projects relationship");
    }
    if (er.extensions.eof.ERXGenericRecord.InverseRelationshipUpdater.updateInverseRelationships()) {
    	removeFromProjects(object);
    }
    else {
    	removeObjectFromBothSidesOfRelationshipWithKey(object, _Client.PROJECTS_KEY);
    }
  }

  public com.as.model.Project createProjectsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName( com.as.model.Project.ENTITY_NAME );
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, _Client.PROJECTS_KEY);
    return (com.as.model.Project) eo;
  }

  public void deleteProjectsRelationship(com.as.model.Project object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, _Client.PROJECTS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllProjectsRelationships() {
    Enumeration<com.as.model.Project> objects = projects().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteProjectsRelationship(objects.nextElement());
    }
  }


  public static com.as.model.Client createClient(EOEditingContext editingContext, String clientContact
, String clientName
, Boolean isActive
) {
    com.as.model.Client eo = (com.as.model.Client) EOUtilities.createAndInsertInstance(editingContext, _Client.ENTITY_NAME);    
		eo.setClientContact(clientContact);
		eo.setClientName(clientName);
		eo.setIsActive(isActive);
    return eo;
  }

  public static ERXFetchSpecification<com.as.model.Client> fetchSpec() {
    return new ERXFetchSpecification<com.as.model.Client>(_Client.ENTITY_NAME, null, null, false, true, null);
  }

  public static NSArray<com.as.model.Client> fetchAllClients(EOEditingContext editingContext) {
    return _Client.fetchAllClients(editingContext, null);
  }

  public static NSArray<com.as.model.Client> fetchAllClients(EOEditingContext editingContext, NSArray<EOSortOrdering> sortOrderings) {
    return _Client.fetchClients(editingContext, null, sortOrderings);
  }

  public static NSArray<com.as.model.Client> fetchClients(EOEditingContext editingContext, EOQualifier qualifier, NSArray<EOSortOrdering> sortOrderings) {
    ERXFetchSpecification<com.as.model.Client> fetchSpec = new ERXFetchSpecification<com.as.model.Client>(_Client.ENTITY_NAME, qualifier, sortOrderings);
    fetchSpec.setIsDeep(true);
    NSArray<com.as.model.Client> eoObjects = fetchSpec.fetchObjects(editingContext);
    return eoObjects;
  }

  public static com.as.model.Client fetchClient(EOEditingContext editingContext, String keyName, Object value) {
    return _Client.fetchClient(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Client fetchClient(EOEditingContext editingContext, EOQualifier qualifier) {
    NSArray<com.as.model.Client> eoObjects = _Client.fetchClients(editingContext, qualifier, null);
    com.as.model.Client eoObject;
    int count = eoObjects.count();
    if (count == 0) {
      eoObject = null;
    }
    else if (count == 1) {
      eoObject = eoObjects.objectAtIndex(0);
    }
    else {
      throw new IllegalStateException("There was more than one Client that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Client fetchRequiredClient(EOEditingContext editingContext, String keyName, Object value) {
    return _Client.fetchRequiredClient(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
  }

  public static com.as.model.Client fetchRequiredClient(EOEditingContext editingContext, EOQualifier qualifier) {
    com.as.model.Client eoObject = _Client.fetchClient(editingContext, qualifier);
    if (eoObject == null) {
      throw new NoSuchElementException("There was no Client that matched the qualifier '" + qualifier + "'.");
    }
    return eoObject;
  }

  public static com.as.model.Client localInstanceIn(EOEditingContext editingContext, com.as.model.Client eo) {
    com.as.model.Client localInstance = (eo == null) ? null : ERXEOControlUtilities.localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

}
