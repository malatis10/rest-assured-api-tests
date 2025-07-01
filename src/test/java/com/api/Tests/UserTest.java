package com.api.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.api.Endpoints.userEndPoints;
import com.api.Payload.userPayload;
import com.github.javafaker.Faker;

import io.restassured.response.Response;
import junit.framework.Assert;

public class userTest {
    
    // Object to hold user data
    userPayload userpayload;
    
    // Faker library instance to generate fake test data
    Faker faker;

    // This method runs once before any test. It generates fake user data.
    @BeforeClass
    public void generateData() {
        userpayload = new userPayload();
        faker = new Faker();

        // Populate the userPayload object with fake data
        userpayload.setId(faker.idNumber().hashCode());
        userpayload.setFirstName(faker.name().firstName());
        userpayload.setLastName(faker.name().lastName());
        userpayload.setUsername(faker.name().username());
        userpayload.setEmail(faker.internet().emailAddress());
        userpayload.setPassword(faker.internet().password());
        userpayload.setPhone(faker.phoneNumber().cellPhone());
        userpayload.setUserStatus(0); // Status 0 indicates default
    }

    // Test to create a new user using the POST request
    @Test(priority = 1)
    public void createUserTest() {
        System.out.println("Create user data");
        System.out.println("Created user with username: " + userpayload.getUsername());

        // Send POST request to create user
        Response res = userEndPoints.createUser(userpayload);
        res.then().log().all(); // Log the response details

        // Validate response status code
        Assert.assertEquals(res.getStatusCode(), 200);
    }

    // Test to fetch the created user using GET request
    @Test(priority = 2)
    public void getUserTest() {
        try {
            Thread.sleep(4500);  // Wait to ensure the user is available on the server
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("this username " + this.userpayload.getUsername());

        // Send GET request using the username
        Response res = userEndPoints.getUser(this.userpayload.getUsername());
        System.out.println("Get user data");
        res.then().log().all();

        // Validate response status code
        Thread.sleep(5000);  // wait 2 seconds before checking
        Assert.assertEquals(res.getStatusCode(), 200);
    }

    // Test to update the user’s first name using PUT request
    @Test(priority = 3)
    public void updateUserTest() {
        // Modify first name for update
        userpayload.setFirstName(faker.name().firstName());

        System.out.println("Update user data");

        // Send PUT request to update user info
        Response res = userEndPoints.updateUser(this.userpayload.getUsername(), userpayload);
        res.then().log().all();

        // Validate response status code
        Assert.assertEquals(res.getStatusCode(), 200);
    }

    // Test to delete the user using DELETE request
    @Test(priority = 4)
    public void deleteUserTest() throws InterruptedException {
        System.out.println("Deleting user: " + this.userpayload.getUsername().trim());

        // Wait to ensure previous operations are settled
        Thread.sleep(4000);

        // Send DELETE request
        Response res = userEndPoints.deleteUser(this.userpayload.getUsername().trim());
        res.then().log().all();

        // Validate response status code
        Assert.assertEquals(res.getStatusCode(), 200);
    }
}
