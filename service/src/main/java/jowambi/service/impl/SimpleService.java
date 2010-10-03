package jowambi.service.impl;

import java.util.Dictionary;
import java.util.Enumeration;

import jowambi.service.ISimpleService;

import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;

public class SimpleService implements ISimpleService, ManagedService {

	@SuppressWarnings("rawtypes")
	@Override
	public void updated(Dictionary properties) throws ConfigurationException {
		Enumeration keys = properties.keys();
		while(keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String val = (String) properties.get(key);
			System.out.println("updated: " + key + " = " + val);
		}
	}

}
