# 📘 Task Management API Documentation

| METHOD | ENDPOINT | HEADERS / PARAMS | BODY | FUNCTION |
|--------|----------|------------------|------|--------------|
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
