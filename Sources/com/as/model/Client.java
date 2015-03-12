package com.as.model;

import org.apache.log4j.Logger;

import com.webobjects.eocontrol.EOEditingContext;

public class Client extends com.as.model.gen._Client {
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger(Client.class);
	
	@Override
	protected void init(EOEditingContext ec) {
		// TODO Auto-generated method stub
		super.init(ec);
		this.setIsActive(true);
	}
}
