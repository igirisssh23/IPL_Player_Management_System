# 🏏 IPL Player Management System (JDBC)

A console-based Java application that performs CRUD (Create, Read, Update, Delete) operations on IPL player records using **Java, JDBC, and MySQL**.

## 📌 Features

- ➕ Add a new player
- 📋 View all players
- 🔍 Search players by team
- ✏️ Update player details
- ❌ Delete a player
- 🗂️ Menu-driven console application

---

## 🛠️ Tech Stack

- Java
- JDBC
- MySQL
- Eclipse IDE

---

## 📂 Project Structure

```
src/
├── com.tka.controller
│   ├── Client.java
│   └── IPLController.java
│
├── com.tka.service
│   └── IPLService.java
│
├── com.tka.dao
│   └── IPLDao.java
│
└── com.tka.entity
    └── Player.java
```

---

## 🗃️ Database

### Database Name

```
ipl_project_db
```

### Table Name

```
player
```

### Table Structure

| Column | Type |
|---------|------|
| pid | INT (Primary Key) |
| pname | VARCHAR(45) |
| age | INT |
| teamName | VARCHAR(20) |
| role | VARCHAR(20) |

---

## 📋 Menu

```
======================
IPL PLAYER MANAGEMENT SYSTEM
======================

1. Add Player
2. View All Players
3. View Players By Team
4. Update Player
5. Delete Player
6. Exit
```

---

## 🚀 How to Run

1. Clone the repository

```bash
https://github.com/igirisssh23/IPL_Player_Management_System.git
```

2. Open the project in Eclipse.

3. Create the MySQL database and `player` table.

4. Update the database URL, username, and password in the DAO class if required.

5. Add the MySQL JDBC Driver to the project.

6. Run `Client.java`.

---

## 📚 Concepts Used

- Java OOP
- PreparedStatement
- ResultSet
- MySQL Database
- Exception Handling
- Collections (`ArrayList`)
- Layered Architecture (Controller → Service → DAO(repository) → Database)

---

## 📷 Sample Output

```
======================
IPL PLAYER MANAGEMENT SYSTEM
======================

1. Add Player
2. View All Players
3. View Players By Team
4. Update Player
5. Delete Player
6. Exit

Enter your choice:
```

---

## 🎯 Future Enhancements

- Search Player by ID
- Search Player by Role
- Sort Players
- Pagination
- Spring Framework
- Spring Boot
- REST APIs
- Hibernate/JPA
- Maven Integration

---

## 👨‍💻 Author

**Girish Charpe**

GitHub: https://github.com/igirisssh23
