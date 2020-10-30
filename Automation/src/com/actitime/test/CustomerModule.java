package com.actitime.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;


@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass{

	@Test
	public void CreateCustomer() throws InterruptedException {
	Reporter.log("CreateCustomer",true);
	Assert.fail();
	}	
	
	
	}

