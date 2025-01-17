# Spring Boot Demo Project

This project is a simple Spring Boot application demonstrating RESTful API endpoints, service layer, aspect-oriented programming (AOP) for logging, and custom annotations.

## Project Structure

The project consists of the following main components:

1. `HomeController`: REST controller handling HTTP requests
2. `HomeService`: Service layer for business logic
3. `LoggingAspect`: AOP component for method logging
4. `Loggable`: Custom annotation for marking methods to be logged

## Features

- RESTful API endpoints for greeting users
- Exception handling demonstration
- Custom logging using AOP
- DTOs for request and response handling

## Endpoints

1. GET `/{name}`: Greets a user by name
2. GET `/error`: Demonstrates exception handling
3. POST `/hello1`: Greets a user based on JSON input
4. POST `/hello2`: Returns a user object based on JSON input

## How to Use

1. Clone the repository
2. Open the project in your preferred IDE
3. Run the application
4. Use a tool like cURL or Postman to test the endpoints

## Example Requests

### GET /{name}
```
GET http://localhost:8080/John
```

### POST /hello1
```
POST http://localhost:8080/hello1
Content-Type: application/json

{
    "name": "John Doe"
}
```

### POST /hello2
```
POST http://localhost:8080/hello2
Content-Type: application/json

{
    "name": "Jane Doe"
}
```

## Logging

The `@Loggable` annotation can be used on methods to enable detailed logging. The `LoggingAspect` will log method entry, exit, execution time, and return values for annotated methods.

## Dependencies

- Spring Boot
- Spring AOP

## Building and Running

This project uses Maven for dependency management. To build and run the project:

```
mvn clean install
mvn spring-boot:run
```

## Contributing

Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

