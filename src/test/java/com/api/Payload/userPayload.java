package com.api.Payload;

/**
 * POJO class representing the user payload structure
 * used in request and response bodies for API automation.
 */
public class userPayload {
    
    // User ID
    private int id;
    
    // Unique username of the user
    private String username;
    
    // First name of the user
    private String firstName;
    
    // Last name of the user
    private String lastName;
    
    // Password for the user account
    private String password;
    
    // Email address of the user
    private String email;
    
    // Phone number of the user
    private String phone;
    
    // Status code representing user state (e.g., active/inactive)
    private int userStatus;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }
}
