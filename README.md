# RestfulBanker

**RestfulBanker** is a simple Java Spring Boot application that provides a REST API for managing bank-related operations with a MySQL database. This project uses Spring Boot to create a scalable and secure backend, and leverages Spring Data JPA for Object-Relational Mapping (ORM) to simplify database interactions.

### Technologies Used
-   **Java**
-   **Spring Boot**
-   **Spring Data JPA**
-   **Hibernate ORM**
-   **MySQL**


## Features

-   RESTful API endpoints for performing **CRUD operations** (Create, Read, Update, Delete) via standard HTTP methods (GET, POST, PUT, DELETE).
-   Integration with MySQL for persistent data storage.
-   Built with Java Spring Boot and Spring Data JPA.

**   The application runs on **default port 8080**.

## Installation

1.  Clone the repository:
    ```
    git clone https://github.com/freezin-fire/RestfulBanker.git
    ``` 
    
2.  Navigate to the project directory:
    
    `cd RestfulBanker` 
    
3.  Configure your MySQL database connection in 				

 	`/src/main/resources/application.properties`
5.  Build and run the application using Maven:
    
    `mvn spring-boot:run` 
    

## API Usage

1.  **Get all accounts:**
    
    -   **Method:** GET
    -   **URL:** `http://localhost:8080/api/accounts`
2.  **Get details of a specific account by ID:**
    
    -   **Method:** GET
    -   **URL:** `http://localhost:8080/api/accounts/{id_number}`
3.  **Create a new account:**
    
    -   **Method:** POST
    -   **URL:** `http://localhost:8080/api/accounts`
    -   **Body (JSON):**
        
        ```
        {
          "accountHolderName": "<account_holder_name>",
          "balance": <balance_value>
        }
        ``` 
        
4.  **Deposit amount to a specific account:**
    
    -   **Method:** PUT
    -   **URL:** `http://localhost:8080/api/accounts/{id_number}/deposit`
    -   **Body (JSON):**
        
        ```
        {
          "amount": <deposit_amount>
        }
        ``` 
        
5.  **Withdraw amount from a specific account:**
    
    -   **Method:** PUT
    -   **URL:** `http://localhost:8080/api/accounts/{id_number}/withdraw`
    -   **Body (JSON):**
    
        ```
        {
          "amount": <withdraw_amount>
        }
        ``` 
        
6.  **Delete an account by ID:**
    
    -   **Method:** DELETE
    -   **URL:** `http://localhost:8080/api/accounts/{id_number}`




## License

This project is licensed under the MIT License.
