package com.task;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonParsing {
	
	
	
	//print no of employees return api
	//print totalsalary
	//print name of first employee
	//print experience of john
	
	
	@Test
	private void parsing() {
		
		JsonPath js = new JsonPath(Payload.employeedetail());
		
		int noOfEmpl = js.getInt("employeeDetails.size()");
		System.out.println(noOfEmpl);
		
		
		int totalsalary = js.getInt("dashBoard.totalSalary");
		System.out.println(totalsalary);
		
		Object object = js.get("employeeDetails.name[0]");
		System.out.println(object);
		
		int  exp = js.getInt("employeeDetails.exp[1]");
		System.out.println(exp);
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
