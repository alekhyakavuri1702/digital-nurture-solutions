# Employee Management System

## Overview
The Employee Management System is a Spring Boot application designed to manage employee data, departments, and their relationships. It provides a RESTful API for performing CRUD operations on employees and departments, utilizing an H2 in-memory database for data storage.

## Features
- Manage employee records with fields such as ID, name, email, and department.
- Manage department records with fields such as ID and name.
- One-to-many relationship between departments and employees.
- RESTful endpoints for creating, reading, updating, and deleting employees and departments.
- Pagination and sorting capabilities for employee searches.
- Entity auditing to track creation and modification of records.
- Projections to fetch specific data subsets from entities.

## Technologies Used
- Spring Boot
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## Setup Instructions
1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd EmployeeManagementSystem
   ```

2. **Build the Project**
   Use Maven to build the project:
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   You can run the application using the following command:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**
   The application will be available at `http://localhost:8080`. You can use tools like Postman or curl to interact with the API.

## API Endpoints
- **Employee Endpoints**
  - `POST /employees` - Create a new employee
  - `GET /employees` - Retrieve all employees
  - `GET /employees/{id}` - Retrieve an employee by ID
  - `PUT /employees/{id}` - Update an employee
  - `DELETE /employees/{id}` - Delete an employee

- **Department Endpoints**
  - `POST /departments` - Create a new department
  - `GET /departments` - Retrieve all departments
  - `GET /departments/{id}` - Retrieve a department by ID
  - `PUT /departments/{id}` - Update a department
  - `DELETE /departments/{id}` - Delete a department

## Database Initialization
The application can be initialized with sample data using the `data.sql` file located in the `src/main/resources` directory.

## Testing
The application includes test cases to ensure that the application context loads correctly and that CRUD operations function as expected. You can run the tests using:
```bash
mvn test
```

## License
This project is licensed under the MIT License.