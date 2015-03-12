package com.as.model;

import org.apache.log4j.Logger;

import com.as.model.Person;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;

import er.corebl.model.ERCPreference;
import er.corebl.preferences.ERCoreUserInterface;


public class Person extends com.as.model.gen._Person implements ERCoreUserInterface {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(Person.class);
	public static final String PreferencesKey = "preferences";
	
	@Override
	protected void init(EOEditingContext ec) {
		// TODO Auto-generated method stub
		super.init(ec);

		setIsActive(true);
		setIsAccountExec(false);


	}

	public String fullName() {
		return firstName() + " " + lastName();
	}

	public static Person validateLogin(EOEditingContext editingContext, String username, String password) {
		EOQualifier qual = Person.LOGIN_NAME.eq(username).and(Person.PASSWORD.eq(password));
		Person user = Person.fetchRequiredPerson(editingContext, qual);
		//NSLog.out.appendln("The user is " + user);
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public NSArray<ERCPreference> preferences() {
		return (NSArray<ERCPreference>) storedValueForKey(PreferencesKey);
	}

	@Override
	public void setPreferences(NSArray<ERCPreference> array) {
		takeStoredValueForKey(array.mutableClone(), PreferencesKey);
	}

	@Override
	public void newPreference(ERCPreference pref) {
		addObjectToBothSidesOfRelationshipWithKey(pref, PreferencesKey);
	}

}
