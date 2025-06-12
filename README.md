# API Endpoints Summary

---

## 🔐 Auth Endpoints

### POST `/api/auth/signup`
- **Body**: `{ name, email, password }`
- **Response**: `{ id, name, email, password: null, userRole: EMPLOYEE }`
- **Purpose**: Sign up a new user

### POST `/api/auth/login`
- **Body**: `{ email, password }`
- **Response**: `{ jwt, userId, userRole }`
- **Purpose**: Authenticate user

---

## 🛠️ Admin Endpoints

### GET `/api/admin/users`
- **Header**: `Authorization: <admin_token>`
- **Response**: List of all users
- **Purpose**: View employees

### POST `/api/admin/task`
- **Header**: `Authorization: <admin_token>`
- **Body**: `{ employeeId, title, description, dueDate, priority }`
- **Purpose**: Assign a task

### GET `/api/admin/tasks`
- **Header**: `Authorization: <admin_token>`
- **Response**: List of all tasks

### GET `/api/admin/task/{taskId}`
- **Header**: `Authorization: <admin_token>`
- **Purpose**: View single task

### PUT `/api/admin/task/{taskId}`
- **Header**: `Authorization: <admin_token>`
- **Body**: Update task details
- **Purpose**: Edit a task

### DELETE `/api/admin/task/{taskId}`
- **Purpose**: Delete a task

### GET `/api/admin/tasks/search?title=...`
- **Purpose**: Search tasks by title

### POST `/api/admin/task/comment/{taskId}?content=...`
- **Purpose**: Comment on a task

### GET `/api/admin/comments/{taskId}`
- **Purpose**: View all comments on a task

---

## 👷 Employee Endpoints

### GET `/api/employee/tasks`
- **Header**: `Authorization: <employee_token>`
- **Purpose**: View all tasks assigned to the employee

### GET `/api/employee/task/{taskId}/{taskStatus}`
- **Purpose**: Update task status

### POST `/api/employee/task/comment/{taskId}?content=...`
- **Purpose**: Add comment to a task

### GET `/api/employee/comments/{taskId}`
- **Purpose**: View task comments
