# Rest Assured API Automation Framework

A robust API automation framework built using Java, Rest Assured, and TestNG. This framework enables automated testing of RESTful APIs with clear structure, reusable components, and easy extensibility.

## Features
- TestNG-based test execution and reporting
- Rest Assured for fluent API testing
- Modular design with service and model layers
- Easy to add new API tests and endpoints
- Maven-based build and dependency management

## Prerequisites
- Java JDK 8 or above
- Maven 3.x
- Git
- (Optional) IDE such as IntelliJ IDEA or Eclipse

## Project Structure
```
Rest_Assured_API_Automation_Framework/
├── pom.xml                  # Maven configuration and dependencies
├── src/
│   └── test/
│       └── java/
│           └── com/api/
│               ├── base/   # Base and service classes (e.g., AuthenticationService)
│               ├── models/ # Request/response POJOs
│               └── tests/  # Test classes (e.g., LoginResetPassword.java)
├── test-output/             # TestNG output reports
└── README.md                # Project documentation
```

## Setup Instructions
1. **Clone the repository:**
   ```sh
   git clone <your-repo-url>
   cd Rest_Assured_API_Automation_Framework
   ```
2. **Import the project into your IDE** (as a Maven project) or continue in terminal.
3. **Install dependencies:**
   Maven will automatically download dependencies on first build/test run.

## Running the Tests
- **From terminal:**
  ```sh
  mvn test
  ```
- **From IDE:**
  - Right-click the test class or method and select 'Run'.

Test reports will be generated in the `test-output/` directory (e.g., `emailable-report.html`).

## Adding New Tests
1. Create a new Java class in `src/test/java/com/api/tests/`.
2. Extend or use service classes from `com.api.base` for API calls.
3. Use model classes from `com.api.models` for request/response payloads.
4. Annotate test methods with `@Test` (TestNG).

## Extending the Framework
- **Add new endpoints:** Create new service methods in `com.api.base`.
- **Add new request/response models:** Add POJOs in `com.api.models`.
- **Reuse authentication and utility methods as needed.**

## Troubleshooting
- Ensure correct Java and Maven versions are installed.
- If dependencies fail to resolve, run `mvn clean install`.
- Check API endpoints and credentials in test/service classes.
- Review `test-output/` for detailed test reports and errors.

## License
This project is for educational and demonstration purposes.
