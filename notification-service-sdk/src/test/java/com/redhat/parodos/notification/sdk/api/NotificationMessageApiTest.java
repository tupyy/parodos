/*
 * Parodos Notification Service API
 * This is the API documentation for the Parodos Notification Service. It provides operations to send out and check notification. The endpoints are secured with oAuth2/OpenID and cannot be accessed without a valid token.
 *
 * The version of the OpenAPI document: v1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.redhat.parodos.notification.sdk.api;

import com.redhat.parodos.notification.sdk.api.ApiException;
import com.redhat.parodos.notification.sdk.model.NotificationMessageCreateRequestDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationMessageApi
 */
@Ignore
public class NotificationMessageApiTest {

	private final NotificationMessageApi api = new NotificationMessageApi();

	/**
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void createTest() throws ApiException {
		NotificationMessageCreateRequestDTO notificationMessageCreateRequestDTO = null;
		api.create(notificationMessageCreateRequestDTO);
		// TODO: test validations
	}

}
