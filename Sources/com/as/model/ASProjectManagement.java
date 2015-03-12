package com.as.model;

import org.apache.log4j.Logger;


import er.corebl.ERCoreBL;
import er.extensions.ERXFrameworkPrincipal;

public class ASProjectManagement extends ERXFrameworkPrincipal {


	public static final Logger log = Logger.getLogger(ASProjectManagement.class);

	/** holds the shared instance reference */
	protected static ASProjectManagement sharedInstance;

	public final static Class<?> REQUIRES[] = new Class[] {  ERCoreBL.class };

	// Registers the class as the framework principal
	static {
		setUpFrameworkPrincipalClass(ASProjectManagement.class);
	}

	public static ASProjectManagement sharedInstance() {
		if (sharedInstance == null) {
			synchronized (ASProjectManagement.class) {
				if (sharedInstance == null) {
					sharedInstance = sharedInstance(ASProjectManagement.class);
				}
			}
		}
		return sharedInstance;
	}

	public void initialize() {
		// code during startup
	}

	public void finishInitialization() {

	}

}
