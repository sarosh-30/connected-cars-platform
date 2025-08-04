# Connected Cars Platform 🚗⚡

This is a microservices-based project that simulates a Connected Cars Platform using Spring Boot.

## 🔧 Technologies Used
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- REST APIs

## 📁 Microservices

### 1️⃣ car/
This microservice is responsible for:
- Creating, retrieving, and managing **user** data.
- Exposes REST APIs for user operations.

**Key Components:**
- `UserController.java`
- `UserServiceImpl.java`
- `UserRepository.java`
- `user.java` (Entity)

---

### 2️⃣ car-spark/
This microservice:
- Consumes or interacts with `car` service.
- Handles additional operations like DTO mapping.

**Key Components:**
- `CarSparkController.java`
- `UserDTO.java`
- `CarSparkApplication.java`

---

## 🚀 How to Run
Make sure you have Java and Maven installed.

To run each service:
```bash
cd car
mvn spring-boot:run

cd ../car-spark
mvn spring-boot:run
