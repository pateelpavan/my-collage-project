# Server port
server.port=8080

# Database configuration (example for PostgreSQL)
spring.datasource.url=jdbc:postgresql://localhost:5432/sign2text
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=org.postgresql.Driver

# Hibernate properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect