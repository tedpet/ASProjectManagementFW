package com.as.model;

import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;

public class ProjectStep extends com.as.model.gen._ProjectStep {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(ProjectStep.class);
	
	@Override
	protected void init(EOEditingContext ec) {
		// TODO Auto-generated method stub
		super.init(ec);
	
		//when we create a step, it is not complete
		this.setComplete(false);
	}
}
