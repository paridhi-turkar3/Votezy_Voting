# 🗳️ Votezy – Smart Online Voting System

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Poppins&size=28&pause=1000&color=E63946&center=true&vCenter=true&width=700&lines=Smart+Online+Voting+System;Built+with+Spring+Boot+%26+Oracle+XE;Full+Stack+Web+Application;Secure+%7C+Fast+%7C+Interactive" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/Oracle-XE-red?style=for-the-badge&logo=oracle" />
  <img src="https://img.shields.io/badge/Vercel-Deployed-black?style=for-the-badge&logo=vercel" />
</p>

<p align="center">
  <b>A full-stack election management platform for voter registration, candidate management, vote casting, result declaration, and election analytics.</b>
</p>

---

## 🚀 Live Demo

🌐 **Frontend:** https://votezy-voting-rxaa.vercel.app/

📂 **Repository:** https://github.com/paridhi-turkar3/Votezy_Voting

---

## ✨ Features

✅ Voter Registration & Management

✅ Candidate Management

✅ Secure Vote Casting

✅ Real-Time Vote Counting

✅ Winner Declaration

✅ Interactive Dashboard

✅ Election Reset System

✅ REST API Integration

---

## 🛠️ Tech Stack

| Layer           | Technology            |
| --------------- | --------------------- |
| Frontend        | HTML, CSS, JavaScript |
| Backend         | Spring Boot, Java 17  |
| Database        | Oracle XE             |
| Charts          | Chart.js              |
| Deployment      | Vercel                |
| Version Control | Git & GitHub          |

---

## 🏗️ System Architecture

```text
Frontend (HTML/CSS/JS)
        │
        ▼
Spring Boot REST APIs
        │
        ▼
      Oracle XE
```

---

## 🚀 Run Locally

### Clone Repository

```bash
git clone https://github.com/paridhi-turkar3/Votezy_Voting.git
cd Votezy_Voting
```

### Configure Oracle XE

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
spring.datasource.username=votezy
spring.datasource.password=votezy123
```

### Run Backend

```bash
cd votezy-backend
.\mvnw.cmd spring-boot:run
```

Backend:

```text
http://localhost:8080
```

### Run Frontend

Open `index.html` with Live Server.

```text
http://127.0.0.1:5501
```

---

## 📡 REST APIs

| Method | Endpoint                         |
| ------ | -------------------------------- |
| GET    | /api/candidates                  |
| POST   | /api/candidates/add              |
| GET    | /api/voters                      |
| POST   | /api/voters/add                  |
| POST   | /api/votes/cast                  |
| GET    | /api/dashboard/winner            |
| GET    | /api/dashboard/vote-distribution |

---

## 📸 Project Preview

### 🏠 Home Page

<img width="1918" height="1020" alt="image" src="https://github.com/user-attachments/assets/102a0877-bfc4-42b6-89ab-5e0afd99859f" />


### 📊 Dashboard

<img width="1918" height="1022" alt="image" src="https://github.com/user-attachments/assets/b6f11e89-e33e-43a7-a856-d39148c20f21" />

<img width="1918" height="1015" alt="image" src="https://github.com/user-attachments/assets/9d4748aa-d780-4b33-8ad2-ab45f9ed4831" />


### 🏆 Candidate Management

<img width="1918" height="1020" alt="image" src="https://github.com/user-attachments/assets/c311daed-b0fd-4454-bccc-1f1cb3618885" />


### 🗳️ Voting Page

<img width="1918" height="1011" alt="image" src="https://github.com/user-attachments/assets/1133bb71-c725-4370-840e-bd4b9f0ec159" />


### 📈 Results

<img width="1917" height="1017" alt="image" src="https://github.com/user-attachments/assets/9e093cee-2a1b-4b20-bf38-a7057e22f6d6" />


---

## 🎯 Learning Outcomes

* Full Stack Development
* REST API Design
* Spring Boot Architecture
* Oracle Database Integration
* CRUD Operations
* Frontend–Backend Communication
* Deployment & Version Control

---

## 👩‍💻 Developer

**Paridhi Turkar**

🎓 B.Tech CSE (AI & ML)

🏫 Oriental Institute of Science & Technology, Bhopal

💻 Passionate about Full Stack Development & AI/ML

---

<p align="center">
  ⭐ If you found this project interesting, don't forget to star the repository!
</p>

<p align="center">
  Made with ❤️ using Spring Boot, Oracle XE & JavaScript
</p>

