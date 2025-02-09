package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.Swift_AuthService;

import io.restassured.response.Response;

public class Swift_ForgotPasswordTest {

	Swift_AuthService authService = new Swift_AuthService();

	@Test(description = "Verify if Swift Forgot Password API is working...")
	public void forgotPasswordTest() {

		Response response = authService.forgotPassword("amuda.chandrakanth@gmail.com");
		System.out.println(response.asPrettyString());
	}

}
