package com.api.base;

import com.api.models.request.Swift_LoginRequest;

import io.restassured.response.Response;

public class Swift_AuthService extends BaseService {
	private static final String BASE_PATH = "/api/auth/";

	public Response login(Swift_LoginRequest payload) {
		return postRequest(payload, BASE_PATH + "login");
	}
}
