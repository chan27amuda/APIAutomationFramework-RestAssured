package com.api.base;

import com.api.models.request.Swift_ProfileUpdateRequest;

import io.restassured.response.Response;

public class Swift_UserProfileManagementService extends BaseService {

	private static final String BASE_PATH = "/api/users";

	public Response getProfile(String token) {
		setAuthToken(token);
		return getRequest(BASE_PATH + "/profile");
	}

	public Response updateProfile(Swift_ProfileUpdateRequest payload, String token) {
		setAuthToken(token);
		return putRequest(payload, BASE_PATH + "/profile");
	}

}
