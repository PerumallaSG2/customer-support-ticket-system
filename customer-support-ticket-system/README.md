## 🎟️ Customer Support Ticket System

This repository contains a **full-stack web application** for managing customer support tickets.  
It allows users to create, update, view, and delete tickets via an **Angular frontend** connected to a **Spring Boot REST API** with **MySQL** persistence.  

---

## ✨ Features
- **Spring Boot Backend**: Exposes REST APIs for ticket management.  
- **Angular Frontend**: User-friendly interface to raise and track issues.  
- **MySQL Database**: Stores all ticket data with persistence.  
- **Cross-Origin Support**: Frontend and backend communicate seamlessly.  
- **CRUD Operations**: Full lifecycle management of support tickets.  
- **Extensible Architecture**: Easy to add authentication, roles, and notifications later.  

---

## 📂 Project Structure

```plaintext
customer-support-ticket-system/
│
├── backend/                         # Spring Boot App
│   ├── pom.xml                      # Maven config (dependencies)
│   ├── src/main/java/com/example/ticketing/
│   │   ├── CustomerSupportTicketSystemApplication.java
│   │   ├── controller/              # REST Controllers
│   │   │   └── TicketController.java
│   │   ├── model/                   # JPA Entities
│   │   │   └── Ticket.java
│   │   ├── repository/              # Repositories
│   │   │   └── TicketRepository.java
│   │   └── service/                 # Service Layer
│   │       └── TicketService.java
│   ├── src/main/resources/
│   │   ├── application.properties   # Database config
│   │   └── data.sql                 # Sample seed data (optional)
│   └── .gitignore
│
├── frontend/                        # Angular App
│   ├── package.json
│   ├── angular.json
│   ├── src/app/
│   │   ├── app.module.ts
│   │   ├── app.component.ts
│   │   ├── app.component.html
│   │   ├── services/
│   │   │   └── ticket.service.ts
│   │   └── components/
│   │       └── ticket-list.component.ts
│   └── .gitignore
│
├── database/
│   └── schema.sql                   # SQL schema for tickets table
│
└── README.md
```
---

##  🧩 Prerequisites

- Java 17+
- Maven 3.8+
-	Node.js v16+ and Angular CLI
-	MySQL Server
-	Git


---

## ⚙️ Setup Instructions
1️⃣ Clone the Repository
```
git clone https://github.com/PerumallaSG2/customer-support-ticket-system.git
cd customer-support-ticket-system
```
2️⃣ Configure the Database

Edit backend/src/main/resources/application.properties with your MySQL credentials:
```
spring.datasource.url=jdbc:mysql://localhost:3306/ticketdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Create the database:
```
CREATE DATABASE ticketdb;
```
3️⃣ Run the Backend
```
cd backend
mvn clean install
mvn spring-boot:run
```

Backend runs on: http://localhost:8080

4️⃣ Run the Frontend
```
cd frontend
npm install
ng serve --open
```

Frontend runs on: http://localhost:4200

---
## 🗄️ API Endpoints
| Method | Endpoint            | Description         |
| ------ | ------------------- | ------------------- |
| GET    | `/api/tickets`      | Fetch all tickets   |
| GET    | `/api/tickets/{id}` | Fetch ticket by ID  |
| POST   | `/api/tickets`      | Create a new ticket |
| PUT    | `/api/tickets/{id}` | Update a ticket     |
| DELETE | `/api/tickets/{id}` | Delete a ticket     |


---
## 🧠 Database Schema
| Column      | Type         | Description                 |
| ----------- | ------------ | --------------------------- |
| id          | BIGINT (PK)  | Unique Ticket ID            |
| title       | VARCHAR(100) | Short issue title           |
| description | TEXT         | Issue details               |
| priority    | VARCHAR(20)  | LOW / MEDIUM / HIGH         |
| status      | VARCHAR(20)  | OPEN / IN_PROGRESS / CLOSED |
| created_at  | TIMESTAMP    | Created timestamp           |

---

## 🔧 Future Enhancements

-	JWT Authentication & Role-based Access
-	Email notifications for ticket updates
-	Docker Compose setup for local deployment
-	Advanced search and filters


---
## 👨‍💻 Author
**Gopi Krishna Perumalla**  
Java Full Stack Developer  
📧 gopi.perumalla18@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/gopikrishnaperumalla)  
