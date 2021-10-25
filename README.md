# SpringBoot-Crafting
## Description
  A web app exposing basic REST APIs to create, get, update, and delete users stored in database.

## Usage
  Install Docker and Docker Compose.
  
  On terminal, change directory to */examination* directory of the project. Type the following command to start the app.
  
  ```script
	docker-compose up
  ```

## Features and APIs
* **Create new user**
  
  POST localhost:8080/users
    
  Request body:
      
    ```json
    {
        "personName": "Person D"
    }
    ```


* **Get all users**
  
  GET localhost:8080/users
  
  
* **Get user by user Id**

  GET localhost:8080/user?userId=1


* **Update username**

  PUT localhost:8080/users/1

  Request body:

    ```json
    {
        "personName": "Person X"
    }
    ```

* **Delete user**

  DELETE localhost:8080/user?userId=1
