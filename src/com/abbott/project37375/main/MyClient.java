package com.abbott.project37375.main;

import org.junit.Assert;

import com.experitest.client.Client;

public class MyClient extends Client {
	
	public MyClient(String host, int port) {
		super(host,port,true);
	}
	
	public void assertJUnitAndSeeTestReport(boolean condition, String messageIfTrue, String messageIfFalse) {
		if (condition) {
			this.report(messageIfTrue, true);
		} 
		else {
			this.report(messageIfFalse, false);
		}
		Assert.assertTrue(messageIfFalse, condition);
	}
	
}
