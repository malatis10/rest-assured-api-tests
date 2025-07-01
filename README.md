
User API Automation Project

This project demonstrates API automation testing using Java, Rest Assured, TestNG, and Faker library. It covers basic CRUD operations on the Swagger Petstore User API.

Project Overview
API under test: Swagger Petstore User API (https://petstore.swagger.io/)

Operations automated: Create user, Get user, Update user, Delete user

Tools used:

Java

Rest Assured

TestNG

Faker (for generating test data)

Project Structure
com.api.Payload - Contains POJO classes representing request payloads

com.api.Endpoints - Contains endpoint URLs and methods to call API endpoints

com.api.Tests - Contains TestNG test classes to validate API functionality

How to Run
Clone the repository:
git clone <your-repo-url>

Navigate to the project directory:
cd Project

Run tests using Maven:
mvn clean test

Sample Test Flow
Generate random user data

Create user via POST API

Verify user creation by fetching via GET API

Update user details via PUT API

Delete user via DELETE API

Notes
CI/CD pipeline integration is already configured to run tests automatically on commits.

Tests include assertions on HTTP status codes

Thread.sleep is used between tests to allow server processing

Faker library generates unique test data for each test run

Future Enhancements
Data-driven testing using Excel/JSON

Reporting integration (Allure or ExtentReports)

Add authentication and negative test scenarios

Author
Malati Sanganagoudra

