# 🗳️ Votezy – Smart Online Voting System

> A full-stack online voting platform designed to simplify voter registration, candidate management, vote casting, election result declaration, and analytics through an interactive dashboard.

🌐 **Frontend Live Demo:** https://votezy-voting-rxaa.vercel.app


💻 **GitHub Repository:** https://github.com/paridhi-turkar3/Votezy_Voting

---

## ✨ Key Highlights

✅ Secure Vote Casting (One Voter → One Vote)

✅ Candidate & Voter Management

✅ Real-Time Election Analytics Dashboard

✅ Vote Distribution Visualization using Chart.js

✅ Winner Tracking & Election Result Declaration

✅ REST API-based Backend Architecture

✅ Responsive User Interface

---

## 📸 Application Modules

### 👤 Voter Management

* Register new voters
* View registered voters
* Delete voter records
* Prevent duplicate voting

### 🏛️ Candidate Management

* Add candidates
* Update candidate details
* Delete candidates
* View all candidates

### 🗳️ Voting System

* Cast votes securely
* Validate voter and candidate records
* Restrict multiple voting attempts

### 📊 Dashboard Analytics

* Total Voters
* Total Candidates
* Total Votes
* Vote Distribution Bar Chart
* Candidate Vote Statistics
* Current Election Leader Card

### 🏆 Election Results

* Display election winner
* Show total votes received
* Candidate-wise vote analysis

---

## 🛠️ Tech Stack

### Frontend

* HTML5
* CSS3
* Bootstrap 5
* JavaScript (ES6)
* Chart.js

### Backend

* Java
* Spring Boot
* Spring Data JPA
* REST APIs
* Maven

### Database

* Oracle XE

### Tools & Platforms

* Git & GitHub
* VS Code
* Thunder Client
* Vercel

---

## 🏗️ System Architecture

```text
Frontend (HTML/CSS/JS)
        │
        ▼
REST APIs (Spring Boot)
        │
        ▼
Oracle XE Database
```

---

## 📂 Project Structure

```text
Votezy
│
├── votezy-frontend
│   ├── assets
│   │   ├── css
│   │   └── js
│   ├── dashboard.html
│   ├── voters.html
│   ├── candidates.html
│   ├── voting.html
│   └── results.html
│
└── votezy-backend
    ├── controller
    ├── entity
    ├── repository
    ├── dto
    └── resources
```

---

## 🚀 Features Implemented

| Feature                       | Status |
| ----------------------------- | ------ |
| Voter Registration            | ✅      |
| Candidate Management          | ✅      |
| Vote Casting                  | ✅      |
| One Vote Per Voter Validation | ✅      |
| Election Result Declaration   | ✅      |
| Dashboard Analytics           | ✅      |
| Vote Distribution Chart       | ✅      |
| Winner Tracking               | ✅      |
| REST API Integration          | ✅      |

---

## ▶️ Run Locally

### Backend

```bash
cd votezy-backend
./mvnw spring-boot:run
```

### Frontend

Open `index.html` using Live Server in VS Code.

---

## 🔮 Future Enhancements

* User Authentication & Authorization
* Admin Login Panel
* Email Notifications
* Cloud Database Integration
* Backend Deployment on Render
* Real-Time Election Monitoring
* Pie Charts & Advanced Analytics

---

## 👩‍💻 Developer

**Paridhi Turkar**
B.Tech – Computer Science & Engineering (AI & ML)
Oriental Institute of Science and Technology, Bhopal

GitHub: https://github.com/paridhi-turkar3

---

### ⭐ If you found this project interesting, don't forget to star the repository!
