package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthenticationService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ResetLoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginResetPassword {
	
	@Test(description="Verify if ReSetPassword API is Working...")
	public void ReSetPasswordTest() {
	 
		AuthenticationService auth=new AuthenticationService();
		Response response = auth.login(new LoginRequest("Siddu456@gmail.com", "Siddu@7760"));
		LoginResponse loginResponse=response.as(LoginResponse.class);
		String token=loginResponse.getToken();
		System.out.println(token);
		
		ResetLoginRequest req=new ResetLoginRequest(token,"Siddu123", "Siddu123");
		Response response1 =auth.ResetPassword(req);
		System.out.println(response1.asPrettyString());
	}

}
