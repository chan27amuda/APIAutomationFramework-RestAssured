package com.api.base;

import java.util.HashMap;

import com.api.models.request.Swift_LoginRequest;
import com.api.models.request.Swift_SignUpRequest;

import io.restassured.response.Response;

public class Swift_AuthService extends BaseService {
	private static final String BASE_PATH = "/api/auth/";

	public Response login(Swift_LoginRequest payload) {
		return postRequest(payload, BASE_PATH + "login");
	}

	public Response signUp(Swift_SignUpRequest payload) {
		return postRequest(payload, BASE_PATH + "signup");
	}

	public Response forgotPassword(String emailAddress) {
		HashMap<String, String> payload = new HashMap<String, String>();
		payload.put("email", emailAddress);
		return postRequest(payload, BASE_PATH + "forgot-password");
	}

}
