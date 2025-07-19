# Spring Learn Application

## Overview
The Spring Learn Application is a Spring Boot project designed to demonstrate various features of Spring, including dependency injection, bean configuration, and logging. This application serves as a learning tool for understanding the fundamentals of Spring Boot and Spring Core.

## Project Structure
```
spring-learn
├── 1.springresthandson
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── cognizant
│   │   │   │           └── springlearn
│   │   │   │               ├── SpringLearnApplication.java
│   │   │   │               └── Country.java
│   │   │   └── resources
│   │   │       ├── application.properties
│   │   │       ├── date-format.xml
│   │   │       └── country.xml
│   │   └── test
│   │       └── java
│   │           └── com
│   │               └── cognizant
│   │                   └── springlearn
│   │                       └── SpringLearnApplicationTests.java
│   ├── pom.xml
│   └── README.md
```

## Setup Instructions
1. **Clone the Repository**: Clone this repository to your local machine.
2. **Navigate to the Project Directory**: Open a terminal and navigate to the `spring-learn` directory.
3. **Build the Project**: Use Maven to build the project by running the following command:
   ```
   mvn clean package
   ```
4. **Run the Application**: Execute the main class `SpringLearnApplication` to start the Spring Boot application.

## Features
- **Spring Boot Application**: The application is built using Spring Boot, which simplifies the setup and configuration of Spring applications.
- **Country Management**: The application manages country data, including ISO codes and names, through Spring's dependency injection and XML configuration.
- **Logging**: Integrated logging using SLF4J to track application behavior and debug information.

## Dependencies
The project uses Maven for dependency management. The `pom.xml` file includes necessary dependencies for Spring Boot and other libraries.

## Testing
Unit tests are provided in the `SpringLearnApplicationTests.java` file to ensure the application functions as expected.

## Conclusion
This project serves as a practical example of using Spring Boot and Spring Core features. It is designed for educational purposes to help developers understand the core concepts of Spring framework.