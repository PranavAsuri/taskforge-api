# 📌 TaskForge API

![Spring Boot](https://img.shields.io/badge/Backend-SpringBoot-green)
![Postgres](https://img.shields.io/badge/Database-Postgres-blue)
![Docker](https://img.shields.io/badge/Docker-ready-blue)
![Java](https://img.shields.io/badge/Java-21-orange)

A **Spring Boot + PostgreSQL REST API** for managing users, projects, tasks, and comments.  
Includes validation, global error handling, and containerized Postgres with Docker.

---

## 🚀 Features
- User registration & login with validation
- CRUD operations for Users, Projects, Tasks, Comments
- Global error handling (400/409 responses instead of 500s)
- Dockerized Postgres for reproducible local dev
- CI pipeline with GitHub Actions (build + test)

---

## 🛠️ Tech Stack
- **Backend:** Java 21, Spring Boot, JPA/Hibernate  
- **Database:** PostgreSQL (Dockerized)  
- **Tools:** Maven, GitHub Actions, Postman  

---

## ⚡ Quickstart

```bash
# 1. Clone repo
git clone https://github.com/PranavAsuri/taskforge-api.git
cd taskforge-api

# 2. Start Postgres (Docker)
docker run --name taskforge-db \
  -e POSTGRES_USER=app \
  -e POSTGRES_PASSWORD=app \
  -e POSTGRES_DB=taskforge \
  -p 5432:5432 -d postgres:16

# 3. Run the app
./mvnw spring-boot:run
