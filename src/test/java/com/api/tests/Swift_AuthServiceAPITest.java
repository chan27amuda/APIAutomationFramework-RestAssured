package com.api.tests;

import org.testng.annotations.Test;
import com.api.base.Swift_AuthService;
import com.api.models.request.Swift_LoginRequest;

import io.restassured.response.Response;

public class Swift_AuthServiceAPITest {

	Swift_AuthService authService = new Swift_AuthService();

	@Test(description = "Verify if Swift Login API is working...")
	public void loginTest() {

		Swift_LoginRequest loginRequest = new Swift_LoginRequest("uday1234", "uday1234");

		Response response = authService.login(loginRequest);
		System.out.println(response.asPrettyString());

	}

}
