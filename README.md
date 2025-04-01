# Aplicación CRUD con Spring Boot y PostgreSQL

Sistema de gestión de datos que implementa operaciones **CRUD** (Crear, Leer, Actualizar, Eliminar) utilizando **Spring Boot 3** y **PostgreSQL**.

## Características Principales  
- **Persistencia de datos**: Usa Spring Data JPA/Hibernate para interactuar con PostgreSQL.    
- **Utiliza el formato JSON**: Se puede realizar pruebas a traves de Postman o cURL.

## Tecnologías  
- **Backend**: Spring Boot 3.4.4 (Java 21)
- **Base de datos**: PostgreSQL
- **Herramientas**: Maven

## Ejecutar
- **Limpiar y compilar**: mvn clean install
- **Ejecutar**: java -jar target/crud-estudiantes-0.0.1-SNAPSHOT.jar  
- **Visualizar**: http://localhost:8083/api/estudiantes  (para otras operaciones realizar en postman)
