package com.api.base;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

	/*
	 * This Class is going to be responsible for handling the 1. Base URi 2.
	 * Creating the REQUEST 3. Handling the RESPONSE
	 */

	private static final String SWIFT_BASE_URL = "http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;

	public BaseService() {
		requestSpecification = given().baseUri(SWIFT_BASE_URL);
	}

	protected Response postRequest(Object payload, String endPoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);

	}

}
