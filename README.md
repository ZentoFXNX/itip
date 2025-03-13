# Java Labs - Information Technology and Programming (ITiP)

## Overview
This repository contains laboratory assignments for the course **Information Technology and Programming (ITiP)**. The labs focus on Java development, covering essential topics such as build tools and frameworks used in modern software engineering.

## Technologies and Tools
- **Java 17** - The latest LTS version of Java for efficient and secure application development.
- **Maven** - A powerful build automation tool used for dependency management and project configuration.
- **Spring Boot** - A framework for building enterprise-level Java applications with ease and efficiency.
- **Docker** - A containerization platform to package applications and their dependencies.
- **NGINX** - A web server used for load balancing and reverse proxying.

## Lab Topics
1. **Java Basics and OOP Principles**
   - Working with Java classes, objects, inheritance, and polymorphism.
2. **Maven and Project Management**
   - Dependency management, project structure, and build lifecycle.
3. **Spring Boot Basics**
   - Creating RESTful APIs, dependency injection, and application configuration.
4. **Database Integration**
   - Connecting Spring Boot applications with relational databases using JPA/Hibernate.
5. **Dockerizing Java Applications**
   - Creating Docker images and running containers for Java applications.
6. **Deploying Applications with NGINX**
   - Setting up NGINX as a reverse proxy for Java applications.

## How to Run the Labs
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo/java-labs.git
   cd java-labs
   ```
2. Build and run a Maven project:
   ```sh
   mvn clean install exec:java
   mvn spring-boot:run
   ```
3. Run with Docker:
   ```sh
   docker build -t java-lab-app .
   docker run -p 8080:8080 java-lab-app
   ```

## Contribution
Contributions and improvements are welcome. Please follow the standard Git workflow:
1. Fork the repository.
2. Create a new branch.
3. Implement changes and commit them.
4. Open a pull request.

## License
This project is distributed under the MIT License.
