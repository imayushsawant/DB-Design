### 5. Smart Elevator Control System DB Design

Database design for a multi-building elevator management system used in large infrastructures (corporate towers, malls, airports) where:
- Multiple elevators operate within a building  
- Elevators serve different sets of floors  
- Ride requests are generated dynamically from floors  
- Elevators are assigned based on availability and movement  
- Maintenance and usage are tracked over time  

**Core Features Modeled:**
- Multi-building and multi-elevator architecture  
- Floor-to-elevator mapping (which elevator serves which floors)  
- Request lifecycle (pending → assigned → completed)  
- Ride execution tracking per request  
- Elevator status management (idle, moving, maintenance)  
- Maintenance scheduling and history tracking  

**Key Concepts Practiced:**
- Modeling system flow (request → assignment → ride)  
- Many-to-many relationships (elevator ↔ floors)  
- Separation of intent vs execution (requests vs rides)  
- Avoiding redundant data through normalization  
- Handling state using enums  
- Designing for scalability across multiple buildings  

#### ER Diagram  
![ER Diagram](/Elevator%20management%20system%20DB%20DESIGN/diagram-export-4-10-2026-11_06_26-PM.png)
