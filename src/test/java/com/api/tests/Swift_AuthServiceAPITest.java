package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.base.Swift_AuthService;
import com.api.models.request.Swift_LoginRequest;
import com.api.models.response.Swift_LoginResponse;

import io.restassured.response.Response;

public class Swift_AuthServiceAPITest {

	Swift_AuthService authService = new Swift_AuthService();

	@Test(description = "Verify if Swift Login API is working...")
	public void loginTest() {

		Swift_LoginRequest loginRequest = new Swift_LoginRequest("Sam1235", "Sam1235");
		Response response = authService.login(loginRequest);
		System.out.println(response.asPrettyString());
		Swift_LoginResponse loginResponse = response.as(Swift_LoginResponse.class);

		System.out.println(response.asPrettyString());
		System.out.println("Token: " + loginResponse.getToken());
		System.out.println("eMail: " + loginResponse.getEmail());
		System.out.println("ID: " + loginResponse.getId());

		Assert.assertTrue(loginResponse.getToken() != null);
		Assert.assertEquals(loginResponse.getId(), 34);

	}

}
