# camel-sample
A demonstration project showcasing Apache Camel integration capabilities. This project implements a simple route that fetches data from JSONPlaceholder's REST API, processes the response,


## Features

- REST API integration with JSONPlaceholder
- JSON data processing with Jackson
- Random data selection
- Data transformation and manipulation
- Logging and monitoring

## Technologies

- Java
- Apache Camel
- Maven
- Lombok
- Jackson for JSON processing


## Getting Started

### Prerequisites
- Java 11+
- Maven

### Running the application

- mvn clean install
- mvn camel:run


## Project Structure

The main route demonstrates a typical integration flow:
- Timer-based triggering
- HTTP requests to external APIs
- Data unmarshalling
- Data transformation
- Logging
