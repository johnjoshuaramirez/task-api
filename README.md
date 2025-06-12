# Task App [Full Stack Application]

| METHOD | ENDPOINT     | REQUEST                  | RESPONSE                 | FUNCTION              |
|--------|--------------|--------------------------|--------------------------|------------------------|
|POST|/api/auth/signup|{ name, email, password }|User|Sign Up User|
| POST   | /users       | JSON with user data      | 201 Created, user object | Create a new user      |
| GET    | /users/{id}  | URL param: user ID       | 200 OK, user object      | Retrieve single user   |
| PUT    | /users/{id}  | JSON with updated data   | 200 OK, updated user     | Update user by ID      |
| DELETE | /users/{id}  | URL param: user ID       | 204 No Content           | Delete user by ID      |
