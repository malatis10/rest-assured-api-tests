package com.api.Endpoints;

import com.api.Payload.userPayload;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

/**
 * This class contains reusable methods to interact with the User endpoints.
 * Each method corresponds to a REST operation (CRUD) using Rest Assured.
 */
public class userEndPoints {

    /**
     * Sends a POST request to create a new user.
     * @param userpayload The user details to be sent in the request body.
     * @return Response from the API.
     */
    public static Response createUser(userPayload userpayload) {
        return given()
                .contentType("application/json")
                .body(userpayload)
                .when()
                .post(Routes.USER_POST_URL);
    }

    /**
     * Sends a GET request to retrieve user details by username.
     * @param userName The username of the user to fetch.
     * @return Response from the API.
     */
    public static Response getUser(String userName) {
        return given()
                .pathParam("username", userName)
                .when()
                .get(Routes.USER_GET_URL);
    }

    /**
     * Sends a PUT request to update user details by username.
     * @param userName The username of the user to update.
     * @param userpayload The updated user details.
     * @return Response from the API.
     */
    public static Response updateUser(String userName, userPayload userpayload) {
        return given()
                .pathParam("username", userName)
                .contentType("application/json")
                .body(userpayload)
                .when()
                .put(Routes.USER_PUT_URL);
    }

    /**
     * Sends a DELETE request to remove a user by username.
     * @param userName The username of the user to delete.
     * @return Response from the API.
     */
    public static Response deleteUser(String userName) {
        return given()
                .pathParam("username", userName)
                .when()
                .delete(Routes.USER_DEL_URL);
    }
}
