METHOD

ENDPOINT

HEADERS / PARAMS

BODY

FUNCTION

POST

/api/auth/signup

–

{ "name": "tonystark", "email": "tonystark@gmail.com", "password": "P@ssword" }

Register a new user

POST

/api/auth/login

–

{ "email": "admin@test.com", "password": "admin" }

Login and receive JWT

POST

/api/admin/task

Authorization: Bearer <admin_token>

{ "employeeId": 1, "title": "Task Title", "description": "Task Description", "dueDate": "2025-06-17", "priority": "MEDIUM" }

Assign task to employee

GET

/api/admin/users

Authorization: Bearer <admin_token>

–

Get all employees

GET

/api/admin/tasks

Authorization: Bearer <admin_token>

–

Get all tasks

GET

/api/admin/task/{taskId}

Authorization: Bearer <admin_token>

–

Get task by ID

PUT

/api/admin/task/{taskId}

Authorization: Bearer <admin_token>

{ "employeeId": 2, "title": "Updated Title", "description": "Updated Description", "dueDate": "2025-06-20", "priority": "HIGH", "taskStatus": "INPROGRESS" }

Update task by ID

DELETE

/api/admin/task/{taskId}

Authorization: Bearer <admin_token>

–

Delete task by ID

GET

/api/admin/tasks/search?title={value}

Authorization: Bearer <admin_token>

–

Search tasks by title

POST

/api/admin/task/comment/{taskId}?content={value}

Authorization: Bearer <admin_token>

–

Add comment to task

GET

/api/admin/comments/{taskId}

Authorization: Bearer <admin_token>

–

Get task comments

GET

/api/employee/tasks

Authorization: Bearer <employee_token>

–

Get current user tasks

GET

/api/employee/task/{taskId}/{taskStatus}

–

–

Update task status by employee

POST

/api/employee/task/comment/{taskId}?content={value}

Authorization: Bearer <employee_token>

–

Add comment by employee

GET

/api/employee/comments/{taskId}

Authorization: Bearer <employee_token>

–

Get employee task comments
