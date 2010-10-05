package jowambi.consumer.impl;

import jowambi.service.ISimpleService;

public class SimpleConsumer {
	@SuppressWarnings("unused")
	private ISimpleService service;
	
	public void setService(ISimpleService service) {
		this.service = service;
	}
}
