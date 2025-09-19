# 📌 TaskForge API

![Build](https://img.shields.io/github/actions/workflow/status/PranavAsuri/taskforge-api/ci.yml?branch=main)
![License](https://img.shields.io/badge/license-MIT-blue.svg)
![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![Postgres](https://img.shields.io/badge/Postgres-16-blue)
![Docker](https://img.shields.io/badge/Docker-ready-blue)

A **Spring Boot + PostgreSQL REST API** for managing users, projects, tasks, and comments with JWT authentication, validation, and global error handling.

---

## 🚀 Features
- Secure authentication with **JWT** + BCrypt passwords
- Role-based access (USER / ADMIN)
- CRUD for Users, Projects, Tasks, Comments
- Pagination, sorting, validation, and global error handling
- Containerized Postgres with Docker
- CI pipeline with GitHub Actions

---

## 🛠️ Tech Stack
- **Backend:** Java 21, Spring Boot, JPA/Hibernate  
- **Database:** PostgreSQL (Dockerized)  
- **Tools:** Maven, GitHub Actions, Postman, Docker  

---

## ⚡ Quickstart (Local Dev)

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
