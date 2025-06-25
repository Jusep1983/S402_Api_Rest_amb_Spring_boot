# 🌐 Tasca S4.02 - API REST amb Spring Boot

## 🔧 Objectius

- Practicar amb verbs HTTP: `GET`, `POST`, `PUT`, `DELETE`
- Gestionar headers i codis d'estat HTTP
- Crear una API REST seguint el patró MVC
- Persistència de dades amb:
  - 🔹 Base de dades H2 (nivell 1)
  - 🔹 MySQL (nivell 2)
  - 🔹 MongoDB (nivell 3)

---

<details><summary><strong> ✅ Nivell 1 - CRUD amb H2
  
🔨 Configuració
BD embeguda H2

No cal cap instal·lació externa

🔌 Endpoints
bash
Copiar
Editar
POST    /fruita/add
PUT     /fruita/update
DELETE  /fruita/delete/{id}
GET     /fruita/getOne/{id}
GET     /fruita/getAll
🛠 Dependències
Spring Web

Spring Data JPA

H2 Database

Spring Boot DevTools

</details>

<details> <summary><strong> ✅ Nivell 2 - CRUD amb MySQL
  
    🧱 Configuració de MySQL
    Crear la base de dades fruits-db
    
    sql
    Copiar
    Editar
    CREATE DATABASE `fruits-db`;
    Configura application.properties:
    
    properties
    Copiar
    Editar
    spring.datasource.url=jdbc:mysql://localhost:3306/fruits-db?useSSL=false&serverTimezone=UTC
    spring.datasource.username=root
    spring.datasource.password=TU_CONTRASENYA
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    📦 Dependències
    Spring Web
    
    Spring Data JPA
    
    MySQL Driver
    
    Spring Boot DevTools

</details>

<details> <summary><strong> ✅ Nivell 3 - CRUD amb MongoDB
  
⚙️ Configuració Mongo
No cal crear la base de dades prèviament. Mongo la crea automàticament quan s'insereix el primer document.

application.properties:

properties
Copiar
Editar
spring.data.mongodb.database=fruitsDB
spring.data.mongodb.port=27017
Opcional:

properties
Copiar
Editar
spring.data.mongodb.uri=mongodb://localhost:27017/fruitsDB
📦 Dependències
Spring Web

Spring Data MongoDB

Spring Boot DevTools

📬 Exemple de Peticions amb PowerShell
powershell
Copiar
Editar
 POST
Invoke-RestMethod -Method POST -Uri http://localhost:8080/fruita/add `
-ContentType "application/json" `
-Body '{"nom":"Poma","quantitatQuilos":5}'

 GET
Invoke-RestMethod http://localhost:8080/fruita/getAll

</details>
