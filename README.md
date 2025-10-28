Customer Support Ticket System

This repository contains a full-stack web application designed to manage customer support tickets efficiently.
It allows users to create, update, view, and delete support tickets through a modern Angular UI connected to a Spring Boot REST API with MySQL database integration.

Features

Spring Boot REST API: Provides CRUD operations for managing support tickets.
Angular Frontend: Interactive UI for users to raise and track issues.
MySQL Database: Persistent storage for all ticket-related data.
Cross-Origin Integration: Smooth communication between frontend and backend.
Error Handling & Validation: Ensures reliable and secure data transactions.
Container Ready: Can be Dockerized for scalable deployment (optional).
Prerequisites Before running the project, ensure the following are installed:

Java 17 or later
Maven 3.8+
Node.js (v16+) and Angular CLI
MySQL Server
Git
Setup Instructions

Clone the Repository
git clone https://github.com/PerumallaSG2/customer-support-ticket-system.git
cd customer-support-ticket-system
Configure the Database Edit the backend configuration file backend/src/main/resources/application.properties to match your MySQL setup:
spring.datasource.url=jdbc:mysql://localhost:3306/ticketdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Create the database: CREATE DATABASE ticketdb;

Build and Run the Backend cd backend mvn clean install mvn spring-boot:run
Backend will start at: http://localhost:8080

Build and Run the Frontend cd frontend npm install ng serve --open
Frontend will start at: http://localhost:4200

API Endpoints

Method	Endpoint	Description
GET	/api/tickets	Fetch all tickets
GET	/api/tickets/{id}	Fetch a ticket by ID
POST	/api/tickets	Create a new ticket
PUT	/api/tickets/{id}	Update a ticket
DELETE	/api/tickets/{id}	Delete a ticket
Database Schema

Column	Type	Description
id	BIGINT (PK)	Unique Ticket ID
title	VARCHAR(100)	Short issue title
description	TEXT	Issue details
priority	VARCHAR(20)	LOW / MEDIUM / HIGH
status	VARCHAR(20)	OPEN / IN_PROGRESS / CLOSED
created_at	TIMESTAMP	Created date
Testing the APIs You can use Postman or curl to test the backend endpoints.

Example: POST http://localhost:8080/api/tickets Content-Type: application/json

{ "title": "Login Issue", "description": "User unable to log in", "priority": "HIGH", "status": "OPEN" }

Troubleshooting

Port conflicts: Ensure ports 8080 (backend) and 4200 (frontend) are available.
Database errors: Verify MySQL credentials and schema creation.
CORS issues: Confirm @CrossOrigin annotation in TicketController.
Build errors: Run mvn clean install to clear old builds.
Future Enhancements

JWT Authentication (Spring Security)
Email notifications for ticket updates
Role-based access (Admin/Agent/User)
Docker Compose setup for local deployment
Contributing Contributions are welcome!

Fork this repository
Create a new branch: git checkout -b feature-name
Commit your changes: git commit -m "Add feature-name"
Push and open a pull request.
Author Gopi Krishna Perumalla Java Full Stack Developer
📧 gopi.perumalla18@gmail.com
🔗 LinkedIn
