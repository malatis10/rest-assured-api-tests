# User API Automation Project

This project demonstrates API automation testing using Java, Rest Assured, TestNG, and Faker library. It covers basic CRUD operations on the Swagger Petstore User API.

---

## Project Overview

- **API under test:** Swagger Petstore User API ([https://petstore.swagger.io/](https://petstore.swagger.io/))
- **Operations automated:** Create user, Get user, Update user, Delete user
- **Tools used:**  
  - Java  
  - Rest Assured  
  - TestNG  
  - Faker (for generating test data)

---

## Project Structure

- `com.api.Payload` - Contains POJO classes representing request payloads  
- `com.api.Endpoints` - Contains endpoint URLs and methods to call API endpoints  
- `com.api.Tests` - Contains TestNG test classes to validate API functionality

---

## How to Run

1. Clone the repository:  
   `git clone <your-repo-url>`

2. Navigate to the project directory:  
   `cd Project`

3. Run tests using Maven:  
   `mvn clean test`

---

## Sample Test Flow

- Generate random user data  
- Create user via POST API  
- Verify user creation by fetching via GET API  
- Update user details via PUT API  
- Delete user via DELETE API  

---

## Notes

- Tests are designed with proper assertions on HTTP status codes  
- Thread.sleep is used between tests to ensure server processing  
- Faker library helps create unique test data for each test run

---

## CI/CD Status

- Continuous Integration and Deployment (CI/CD) pipeline is already set up and integrated with this project.

---

## Future Enhancements

- Implement data-driven testing using Excel/JSON  
- Integrate reporting with Allure or ExtentReports  
- Add authentication and negative test scenarios  

---

## Author

Malati Sanganagoudra

---

Feel free to reach out if you want help or improvements for this project!
