# 🎮 Gaming Club Management System

A Spring Boot–based backend application designed to manage gaming club operations — including member registration, game details, wallet recharges, and transaction tracking. The project follows a clean **MVC architecture** with clear separation of concerns using **Controllers**, **Services**, **Repositories**, and **Entities**.

---

## 🚀 Features
- Member registration and management  
- Game information management  
- Recharge system for wallet or credits  
- Transaction tracking and history  
- RESTful API endpoints for CRUD operations  
- Data persistence using Spring Data JPA  
- DTO pattern for request/response handling  

---

## 🧱 Project Structure
```
Gaming_Club/
│
├── GamingClubApplication.java       # Main entry point (Spring Boot)
│
├── controllers/                     # REST controllers for APIs
│   ├── GameController.java
│   ├── MemberController.java
│   ├── RechargeController.java
│   └── TransactionController.java
│
├── services/                        # Business logic layer
│   ├── GameService.java
│   ├── MemberService.java
│   ├── RechargeService.java
│   └── TransactionService.java
│
├── Repository/                      # Spring Data JPA repositories
│   ├── GameRepository.java
│   ├── MemberRepository.java
│   ├── RechargeRepository.java
│   └── TransactionRepository.java
│
├── entiity/                         # Database entities
│   ├── Game.java
│   ├── Member.java
│   ├── Recharge.java
│   ├── Transaction.java
│   └── Collection.java
│
└── Dto/                             # Data Transfer Objects
    ├── MembershipDto.java
    ├── DoRechargeDto.java
    └── TransactionDto.java
```

---

## ⚙️ Tech Stack
- **Language:** Java 17+
- **Framework:** Spring Boot
- **Database:** MySQL / H2 (configurable)
- **ORM:** Spring Data JPA, Hibernate
- **Build Tool:** Maven / Gradle
- **API Format:** REST (JSON)
- **IDE Recommended:** IntelliJ IDEA / Eclipse / VS Code

---

## 🧩 API Overview
| Controller | Purpose | Example Endpoint |
|-------------|----------|------------------|
| `MemberController` | Manage members (add, update, view) | `/api/members` |
| `GameController` | Manage games | `/api/games` |
| `RechargeController` | Handle wallet or game credit recharges | `/api/recharge` |
| `TransactionController` | Manage transaction records | `/api/transactions` |

---

## 📊 Entity Model Summary
| Entity | Description |
|---------|-------------|
| **Member** | Stores member details (name, ID, balance, etc.) |
| **Game** | Represents game information available in the club |
| **Recharge** | Handles recharge details per member |
| **Transaction** | Tracks payments, gameplay charges, etc. |
| **Collection** | (Optional) Aggregated collection details for admin overview |

---

## 🛠️ Installation & Setup
1. **Clone this repository**
   ```bash
   git clone https://github.com/KeerthiGowda06/Gaming_Club.git
   cd Gaming_Club
   ```
2. **Open in your IDE** (IntelliJ / Eclipse)
3. **Configure Database**
   - Update `application.properties` with your database credentials.
4. **Build and Run**
   ```bash
   mvn spring-boot:run
   ```
5. **Access the API**
   - Default: `http://localhost:8080`

---

## 📈 Future Enhancements
- Implement JWT authentication for secure access  
- Add leaderboard and gameplay tracking modules  
- Integrate email/SMS notifications for members  
- Add frontend dashboard (React or Angular)  

---

## 👨‍💻 Author
Developed by **Keerthi G L**  
🎯 Passionate about AI, backend development, and secure system design.

**GitHub Repository:** [https://github.com/KeerthiGowda06/Gaming_Club.git](https://github.com/KeerthiGowda06/Gaming_Club.git)

---

## 🪪 License
This project is licensed under the **MIT License** — feel free to modify and distribute.

---
> “Built for managing fun — powered by clean code.”
