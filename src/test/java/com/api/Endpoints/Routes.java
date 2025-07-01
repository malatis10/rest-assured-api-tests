package com.api.Endpoints;

/**
 * This class holds all API endpoint URLs used in the tests.
 * Centralizing the endpoint definitions improves maintainability and avoids duplication.
 */
public class Routes {

    // Base URL of the Swagger Petstore API
    public static final String BASE_URL = "https://petstore.swagger.io/v2";

    // Endpoint for creating a new user (POST)
    public static final String USER_POST_URL = BASE_URL + "/user";

    // Endpoint for fetching a user by username (GET)
    public static final String USER_GET_URL = BASE_URL + "/user/{username}";

    // Endpoint for updating a user by username (PUT)
    public static final String USER_PUT_URL = BASE_URL + "/user/{username}";

    // Endpoint for deleting a user by username (DELETE)
    public static final String USER_DEL_URL = BASE_URL + "/user/{username}";
}
