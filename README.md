# API REST de Usuarios con Spring Boot

Este proyecto es una API REST básica desarrollada con **Spring Boot** que permite realizar operaciones CRUD sobre una entidad `Usuario`. Incluye endpoints para crear, leer, consultar por prioridad, y eliminar usuarios.

---

## 🔧 Tecnologías utilizadas

- Java 21
- Spring Boot 3.5.3
- Spring Web
- Spring Data JPA
- MySQL 8
- Maven
- POSTMAN

---

## 📦 Estructura del proyecto

api_rest/

├── Usuario.java # Entidad JPA

├── UsuarioRepository.java # Interfaz JPARepository

├── UsuarioService.java # Lógica de negocio

└── UsuarioController.java # Controlador REST



---

## ⚙️ Configuración

En el archivo `application.properties`, se define la conexión a la base de datos:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/springdb
spring.datasource.username=springuser
spring.datasource.password=springpass
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect


📮 Endpoints disponibles
✅ Obtener todos los usuarios
bash

GET /usuario
✅ Crear un nuevo usuario
bash

POST /usuario
Cuerpo JSON de ejemplo:

json
{
  "nombre": "Ana",
  "email": "ana@email.com",
  "prioridad": 1
}
✅ Obtener usuario por ID
bash

GET /usuario/{id}
✅ Consultar usuarios por prioridad
bash

GET /usuario/query?prioridad=1
✅ Eliminar usuario por ID
bash

DELETE /usuario/{id}
🧪 Probar con Postman
Puedes probar todos los endpoints usando Postman.
Recuerda iniciar tu aplicación en http://localhost:8080 o el puerto que hayas definido.

📌 Notas
La aplicación se conecta a una base de datos MySQL local.

Hibernate genera automáticamente la tabla usuario si no existe.

Se usa @RestController, @RequestMapping, @RequestBody, @PathVariable y @RequestParam.

🧑‍💻 Autor
Munir EM – Proyecto de ejemplo con Spring Boot para prácticas CRUD REST.
