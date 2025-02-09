package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.Swift_AuthService;
import com.api.base.Swift_UserProfileManagementService;
import com.api.models.request.Swift_LoginRequest;
import com.api.models.request.Swift_ProfileUpdateRequest;
import com.api.models.response.Swift_LoginResponse;
import com.api.models.response.Swift_UserProfileResponse;

import io.restassured.response.Response;

public class Swift_UpdateProfileTest {

	@Test(description = "Verify if Swift Profile Update API is working...")
	public void updateProfile() {

		Swift_AuthService authService = new Swift_AuthService();
		Response response = authService.login(new Swift_LoginRequest("Sam1235", "Sam1235"));
		Swift_LoginResponse loginResponse = response.as(Swift_LoginResponse.class);
		System.out.println(response.asPrettyString());

		System.out.println("-------------------------------------------------------------------------------------");

		Swift_UserProfileManagementService userProfileManagementService = new Swift_UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		Swift_UserProfileResponse userProfileResponse = response.as(Swift_UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "Sam1235");

		System.out.println("---------------------------------------------------------------------------------------");

		Swift_ProfileUpdateRequest profileUpdateRequest = new Swift_ProfileUpdateRequest.Builder().firstName("Sam")
				.lastName("Samnuel").email("samuel2@gmail.com").mobileNumber("2345610987").build();

		response = userProfileManagementService.updateProfile(profileUpdateRequest, loginResponse.getToken());
		System.out.println(response.asPrettyString());

	}

}
