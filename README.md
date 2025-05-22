# Global Payment Router MVP

## Overview
This Spring Boot application simulates a cross-border payment system, processing payments with currency conversion to CAD and storing transactions in AWS DynamoDB (local setup). It demonstrates scalable API design, AWS integration, and unit testing, tailored for fintech applications like those at Remitly.

## Features
- REST API to process payment requests
- Currency conversion to CAD (supports USD, EUR, CAD)
- Transaction storage in DynamoDB
- Input validation for payment details
- Unit tests with JUnit and Mockito

## Technologies
- Java 17 (Amazon Corretto recommended)
- Spring Boot 3.3.11
- Gradle 8.13
- AWS SDK for DynamoDB
- H2 Database (for testing)
- JUnit 5, Mockito

## Setup Instructions
1. **Prerequisites**:
   - Java 17
   - Gradle
   - AWS CLI (optional for DynamoDB Local setup)
   - IntelliJ IDEA (recommended)
   - DynamoDB Local (included in project directory as `DynamoDBLocal.jar` and `DynamoDBLocal_lib`)

2. **Clone the Repository**:
   ```bash
   git clone global-payment-router-mvp

   cd global-payment-router-mvp
