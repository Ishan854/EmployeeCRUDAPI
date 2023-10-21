# Spring Boot REST API CRUD Project

This is a sample Spring Boot project that demonstrates the implementation of a RESTful API for CRUD (Create, Read, Update, Delete) operations using JPA and MySQL.

## Features

- Create, read, update, and delete records through RESTful API endpoints.
- Data persistence using JPA and MySQL database.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed (recommended JDK 8 or later).
- MySQL database server installed and running.
- Postman or any API testing tool for testing the API endpoints.

## Getting Started

Follow these steps to set up and run the project on your local machine:

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/spring-boot-crud-api.git

2. Configure the MySQL database settings in src/main/resources/application.properties.
   
   Build the project:

   ```bash
   ./mvnw clean install
3. Run the application:

   ```bash
   ./mvnw spring-boot:run
   ```
4. Access the API using Postman or any API client at 'http://localhost:8080/api/employees' where resource represents the entity you want to interact with.

## API Endpoints

  * POST /api/employees - Create a new employees.
  * GET /api/employees - Retrieve all employees.
  * GET /api/employees/{id} - Retrieve an employees by ID.
  * PUT /api/employees/{id} - Update an employees by ID.
  * DELETE /api/employees/{id} - Delete an employees by ID.
  * DELETE /api/employees/ - Delete an employees by ID.

## Usage
1. Use Postman or any API client to send HTTP requests to the provided endpoints.

2. Examples of requests:

* Create a new employees:
  POST /api/employees
  ```bash
    Body:
    {
      "emp_name":"Alex",
      "emp_salary":4000.00,
      "emp_age":15,
      "emp_city":"Ranchi"
    }
  ```
* Update a employees:
  PUT /api/employees/{id}
  ```bash
    Body:
    {
      "emp_name":"Rahul",
      "emp_salary":4000.00,
      "emp_age":15,
      "emp_city":"Ranchi"
    }
  ```
  * Delete a employees:
  ```bash
    DELETE /api/employees/{id}
  ```

 3. Review the response to verify the success or failure of each operation.

## License
This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledgments
* This project is based on the Spring Boot framework and uses MySQL as a database.



 
 
 


   
