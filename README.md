🏛️ Court Hearing Scheduling System
📌 Project Description

The Court Hearing Scheduling System is a Java-based console application designed to manage court cases, judges, courtrooms, and hearing schedules efficiently.
It helps automate the process of scheduling hearings, avoiding conflicts, and managing cancellations in a structured manner.

🚀 Features

📂 Manage court cases
👨‍⚖️ Assign judges to hearings
🏢 Allocate courtrooms
⏰ Schedule hearings with date & time
❌ Cancel scheduled hearings
⚠️ Handle scheduling conflicts using custom exceptions
🧱 Follows layered architecture (Entity, Service, Utility, Main)

🛠️ Technologies Used

Java (JDK 22)
Eclipse IDE
Collections Framework
Exception Handling
Object-Oriented Programming (OOP)

📁 Project Structure

COURTHEARINGSCHEDULINGSYSTEM
│
├── src
│   ├── com.wipro.chs.entity
│   │   ├── Case.java
│   │   ├── Judge.java
│   │   ├── Courtroom.java
│   │   ├── Hearing.java
│   │
│   ├── com.wipro.chs.service
│   │   └── SchedulingService.java
│   │
│   ├── com.wipro.chs.util
│   │   └── CustomExceptions.java
│   │
│   └── com.wipro.chs.main
│       └── Main.java
