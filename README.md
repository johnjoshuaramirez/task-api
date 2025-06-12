You can check the application here: https://task-rszt.onrender.com/

The Task (API) streamlines employee task assignments and progress tracking within. Designed to support both admin and employee workflows, it provides a secure and efficient way to create, manage, and monitor tasks. The system leverages a robust backend built with Spring Boot and integrates JWT-based authentication for secure access and data is persisted in a relational database.

🔑 Key Features:
- Admin and Employee roles with JWT-secured authentication

- User registration and login with role assignment

- Task assignment by admins to employees

- Task filtering, searching, and status updates

- Role-based comment system on tasks

- Clean and responsive API

- Secure password handling

📦 Technologies:
- Spring Boot (RESTful Web Services)

- Spring Security + JWT (Authentication & Authorization)

- MySQL (Relational Database)

- Lombok, JPA, Hibernate (Productive Java coding)

- Docker (Containerized Deployment)

✅ Design & Architecture:
- Modular layered architecture

- Separation of concerns via interfaces and service implementations

- Repository pattern for database interaction

- DTOs and mappers for clean data transfer

### 1. Layered Architecture
This divides the system into horizontal layers, each with a specific responsibility:

- Controller Layer (Presentation): Handles HTTP requests/responses, often using Spring's @RestController.

- Service Layer (Business Logic): Contains core logic, validations, and coordinates between components.

- Repository Layer (Persistence): Interacts with the database using interfaces and ORM tools like JPA.

- Model/DTO Layer: Represents the data objects transferred between layers.

### 2. Modular Architecture
This divides the system into independent feature-based modules, such as:

- auth/ → everything related to login, signup

- admin/ → everything related to admin

- employee/ → everything related to employee

| METHOD | ENDPOINT | HEADERS / PARAMS | REQUEST BODY | FUNCTION |
| --- | --- | --- | --- | --- |
| POST | /signup | – | `{ "name": "tonystark", "email": "tonystark@gmail.com", "password": "P@ssword" }` | Register a new user |
| POST | /login | – | `{ "email": "admin@test.com", "password": "admin" }` | Login and receive JWT |
| POST | /admin/task | Auth: Bearer <admin_token> | `{ "employeeId": 1, "title": "Task Title", "description": "Task Description", "dueDate": "2025-06-17", "priority": "MEDIUM" }` | Assign task to employee |
| GET | /admin/users | Auth: Bearer <admin_token> | – | Get all employees |
| GET | /admin/tasks | Auth: Bearer <admin_token> | – | Get all tasks |
| GET | /admin/task/{id} | Auth: Bearer <admin_token> | – | Get task by ID |
| PUT | /admin/task/{id} | Auth: Bearer <admin_token> | `{ "employeeId": 2, "title": "Updated Title", "description": "Updated Description", "dueDate": "2025-06-20", "priority": "HIGH", "taskStatus": "INPROGRESS" }` | Update task by ID |
| DELETE | /admin/task/{id} | Auth: Bearer <admin_token> | – | Delete task by ID |
| GET | /admin/tasks/search | Auth: Bearer <admin_token>, ?title={value} | – | Search tasks by title |
| POST | /admin/task/comment/{id} | Auth: Bearer <admin_token>, ?content={value} | – | Add task comment by admin |
| GET | /admin/comments/{id} | Auth: Bearer <admin_token> | – | Get task comments |
| GET | /employee/tasks | Auth: Bearer <employee_token> | – | Get current user tasks |
| GET | /employee/task/{id}/{status} | – | – | Update task status by employee |
| POST | /employee/task/comment/{id} | Auth: Bearer <employee_token>, ?content={value} | – | Add task comment by employee |
| GET | /employee/comments/{id} | Auth: Bearer <employee_token> | – | Get employee task comments |

UI: https://github.com/johnjoshuaramirez/task
