docker run --name Postgres-Docker -e POSTGRES_PASSWORD=heslo123 -p 5432:5432 -d postgres

Host: localhost
Port: 5432
Database: postgres
Username: postgres
Password: heslo123

# Docker Commands
- `docker run --name Postgres-Docker -e POSTGRES_PASSWORD=heslo123 -p 5432:5432 -d postgres` - Run a new PostgreSQL container with the specified name, password, and port mapping.
- `docker stop Postgres-Docker` - Stop the running PostgreSQL container.
- `docker start Postgres-Docker` - Start the stopped PostgreSQL container.
- `docker rm Postgres-Docker` - Remove the PostgreSQL container (make sure to stop it first).
- `docker logs Postgres-Docker` - View the logs of the PostgreSQL container.
- `docker exec -it Postgres-Docker psql -U postgres` - Access the PostgreSQL command line interface inside the container.
- `docker ps` - List all running containers.
- `docker ps -a` - List all containers, including stopped ones.


# Software Architecture:
- Server: PostgreSQL database server running in a Docker container.
- Client: Any PostgreSQL client (e.g., pgAdmin, psql) that can connect to the database server using the specified host, port, username, and password.
- Spring Boot Application: A Java application that connects to the PostgreSQL database using JDBC or an ORM framework like Hibernate. The application can perform CRUD operations on the database and serve as a backend for a web application or API.
- Network: The Docker container is configured to allow connections from the host machine, enabling communication between the Spring Boot application and the PostgreSQL database server.
- Data Persistence: The PostgreSQL database will store data persistently, and the Docker container can be configured to use a volume for data storage to ensure that data is not lost when the container is stopped or removed.

# Note: Make sure to replace `heslo123` with a strong password in a production environment.



