package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.Swift_AuthService;
import com.api.models.request.Swift_SignUpRequest;

import io.restassured.response.Response;

public class Swift_AccountCreationTest {

	Swift_AuthService authService = new Swift_AuthService();

	@Test(description = "Verify if Swift Account Creation API is working...")
	public void createAccountTest() {

		Swift_SignUpRequest signUpRequest = new Swift_SignUpRequest.Builder().userName("Sam1235")
				.email("samuel1@gmail.com").firstName("Samuel").lastName("Sammy").mobileNumber("9876123405")
				.password("Sam1235").build();

		Response response = authService.signUp(signUpRequest);
		System.out.println(response.asPrettyString());
		Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		Assert.assertEquals(response.statusCode(), 200);
	}

}
