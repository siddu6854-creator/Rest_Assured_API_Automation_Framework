package com.api.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;
public class Login {

	@Test(description="Verify if login API is Working...")
	public void loginTest() {
		
		LoginRequest loginrequest=new LoginRequest("Siddu456@gmail.com", "Siddu@7760");
		AuthenticationService authService =new AuthenticationService();
		Response response = authService.login(loginrequest); //login is expecting String but we are passing object for this we need to add jeskon dependency

//		System.out.println(response.asPrettyString());
		
		LoginResponse loginResponse=response.as(LoginResponse.class);
		//perpose of as method(as(LoginResponse.class)) is to convert json object into java object of loginresponce type
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		System.out.println(loginResponse.getEmail());
		System.out.println(loginResponse.getId());
		
		Assert.assertTrue(loginResponse.getToken() !=null);
		Assert.assertEquals(loginResponse.getEmail(),"Siddu456@gmail.com");
		Assert.assertEquals(loginResponse.getId(),2867);
		
		
		
	}
	
	}


