package com.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITest {
	
static String domain ="https://dummy.restapiexample.com";
	
	@Test
	public void getMethod() {
		RequestSpecification httpRequest=RestAssured.given();
		Response response =httpRequest.request(Method.GET, domain + "/api/v1/employees");
		
		String responeBody = response.getBody().asString();
		System.out.println(responeBody);

		
	}

	

}
