# DB Design Practice

## 📌 Overview
This repository contains database design exercises focused on building strong fundamentals in:
- Entity-Relationship (ER) modeling  
- Relational schema design  
- Real-world data modeling  

Each project represents a different problem scenario and is designed to simulate practical backend system requirements.

---

## 🎯 Goal
The objective of this repo is to:
- Improve database design thinking  
- Understand relationships and constraints  
- Practice converting real-world problems into structured schemas  
- Avoid common design mistakes (like incorrect relationships or poor normalization)

---

## 📂 Projects

### 1. Thrift Store DB Design

Design of a database for an Instagram-based store selling:
- Thrifted (unique) items  
- Handmade (multi-quantity) products  

**Key Concepts Practiced:**
- Handling many-to-many relationships using junction tables  
- Separating order-level and item-level data  
- Inventory and stock tracking  

#### ER Diagram
![ER Diagram](./THRIFT%20STORE%20DB%20DESIGN/diagram-export-4-6-2026-9_45_25-PM.png)

---
### 2. Fitness Coaching Platform DB Design

Database for a fitness influencer platform where:
- Clients subscribe to training plans  
- Trainers manage multiple clients  
- Progress, payments, and consultations are tracked  

**Core Features Modeled:**
- Plan subscription lifecycle (active, expired, cancelled)  
- Client progress tracking over time  
- Weekly check-ins for accountability  
- Payment tracking per subscription  
- Consultation scheduling system  

**Key Concepts Practiced:**
- Multi-entity relationships (client–trainer–plan)  
- Subscription-based architecture  
- Temporal data handling (progress, check-ins, appointments)  
- Use of enums for controlled states  
- Separation of payments, subscriptions, and scheduling  

#### ER Diagram
![ER Diagram](./Fitness%20Coaching%20DB%20DESIGN/diagram-export-4-7-2026-9_19_25-PM.png)

---
### 3. Clinic Management Platform DB Design

Database for a clinic system where:
- Patients book appointments based on required specialization  
- Doctors are assigned during consultations  
- Diagnostic tests are prescribed and reports are generated  
- Payments are handled per consultation  

**Core Features Modeled:**
- Appointment vs consultation separation (intent vs actual visit)  
- Doctor assignment based on specialization  
- Diagnostic test lifecycle (prescription → execution → report)  
- Payment handling for complete consultation (including tests)  
- Feedback system for consultations  

**Key Concepts Practiced:**
- Ownership-based relationship design  
- Avoiding redundant foreign keys using derivation  
- Normalization using separate specialization table  
- Modeling real-world flow of a clinic system  
- Handling derived data (total billing via consultation + tests)  

#### ER Diagram  
![ER Diagram](./Clinic%20management%20platform%20DB%20DESIGN/diagram-export-4-8-2026-11_44_01-PM.png)

---

### 4. Parking Management System DB Design

Database design for a large-scale event parking system (e.g., Comic-Con) where:
- Vehicles enter and exit across multiple days  
- Parking is organized into zones and levels  
- Spots are assigned dynamically based on availability and category  
- Payments are processed per parking session  

**Core Features Modeled:**
- Vehicle entry and exit tracking using parking sessions  
- Dynamic parking spot allocation  
- Multi-zone and multi-level parking structure  
- Reserved parking categories (VIP, EV, staff, creators, etc.)  
- Payment tracking per session  
- Ticket generation for each parking entry  

**Key Concepts Practiced:**
- Separation of static vs dynamic entities (spots vs sessions)  
- Lifecycle modeling (entry → parking → exit → payment)  
- Normalization using category tables (vehicle type, spot type)  
- Avoiding derived data storage (availability from active sessions)  
- Reusability of parking spots across multiple sessions  
- Role-based abstraction (visitor and staff under user)  

#### ER Diagram  
![ER Diagram](./Parking%20Management%20System%20DB%20DESIGN/diagram-export-4-9-2026-8_41_21-PM.png)

---
## 🧠 Concepts Covered

- Primary Keys (PK) & Foreign Keys (FK)  
- One-to-Many and Many-to-Many relationships  
- Junction tables (e.g., order_items)  
- Data normalization  
- Basic constraints and validation  

---

## ⚙️ Tools Used

- ER diagram tools (e.g., Eraser)  
- Git & GitHub for version control  

---

## 📈 Learning Approach

For each problem:
1. Understand the real-world system  
2. Identify entities and relationships  
3. Design ER model  
4. Convert to relational schema  
5. Refine based on edge cases  

---
