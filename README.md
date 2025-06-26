# 🌐 Tasca S4.02 - API REST amb Spring Boot

En esta tarea realizarás un CRUD (Create, Read, Update, Delete) con 3 bases de datos diferentes.

Aprenderás a usar correctamente los verbos HTTP y gestionar los códigos de respuesta.


## 🔧 Objetivos

- Practicar con verbos HTTP: `GET`, `POST`, `PUT`, `DELETE`
- Gestionar headers y códigos de estado HTTP
- Crear una API REST siguiendo el patrón MVC
- Persistencia de datos con: 
- 🔹 Base de datos H2 (nivel 1) 
- 🔹 MySQL (nivel 2) 
- 🔹 MongoDB (nivel 3)

---
## 🛠️ Tecnologías utilizadas

- Java (versión mínima 11)
- Spring Boot (última versión estable)
- Spring Web
- Spring Data JPA / Spring Data MongoDB
- H2 Database (nivel 1)
- MySQL (nivel 2)
- MongoDB (nivel 3)
- Maven (como gestor de dependencias)
- Postman (para pruebas de la API)
- PowerShell (opcional para pruebas desde terminal)

---

## ✅ Requisitos previos

Antes de ejecutar cada uno de los niveles del proyecto, asegúrate de tener lo siguiente instalado y configurado:

### 🔹 Comunes a todos los niveles:

- JDK 11 o superior
- Maven
- IDE como IntelliJ o Eclipse
- Postman (opcional pero recomendado)

## 🚀 Instrucciones de ejecucion

<details>
  <summary><strong> ✅ Nivel 1 - CRUD con H2 </strong></summary>
  

### Pruebas API Frutas con PowerShell

Estos comandos usan `Invoke-RestMethod` de PowerShell para hacer peticiones REST a tu API Spring Boot.

---

### Crear dos frutas (POST)

```powershell
Invoke-RestMethod -Method POST -Uri http://localhost:8080/fruits/add `
-ContentType "application/json" `
-Body '{"name":"Naranja","kilograms":10}'
```
```powershell
Invoke-RestMethod -Method POST -Uri http://localhost:8080/fruits/add `
-ContentType "application/json" `
-Body '{"name":"Platano","kilograms":7}'
```

---

### Actualizar fruta (PUT)

```powershell
Invoke-RestMethod -Method PUT -Uri http://localhost:8080/fruits/update `
-ContentType "application/json" `
-Body '{"id":1,"name":"Mandarina","kilograms":12}'
```

---

### Borrar fruta (DELETE)

```powershell
Invoke-RestMethod -Method DELETE -Uri http://localhost:8080/fruits/delete/1
```

---

### Obtener fruta por ID (GET)

```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getOne/2
```

---

### Obtener todas las frutas (GET)

```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getAll
```

---
### Notas

- El símbolo `` ` `` al final de línea en PowerShell indica que el comando continúa en la siguiente línea, puedes quitarlo y poner todo en una línea si quieres.
- Cambia las URLs y los datos JSON según tu API y datos.
- Si quieres usar `curl` nativo de Windows 10+, abre CMD o Git Bash para sintaxis clásica `curl`.

---
## Postman - Ejecutar pruebas desde colección

### 📝 Importar manualmente desde archivo

1. Abre Postman
2. Haz clic en **"Import"**
3. Selecciona el archivo:

S04T02N01/postman/S04_02_level1_pruebas.postman_collection.json

> Esto cargará la colección con todas las pruebas listas.

## 🧪 Ejecución desde consola H2

Puedes insertar y consultar frutas directamente desde la consola H2 de tu aplicación Spring Boot para realizar pruebas rápidas sin usar Postman o PowerShell.

---

### 1. Accede a la consola

Abre tu navegador en: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

Usa esta configuración:

- **JDBC URL:** `jdbc:h2:mem:testdb`
- **User Name:** `sa`
- **Password:** *(déjalo en blanco)*
- Pulsa **Connect**

---

### 2. Insertar frutas de prueba

```sql
INSERT INTO FRUIT (name, kilograms) VALUES ('Manzana', 5);
INSERT INTO FRUIT (name, kilograms) VALUES ('Pera', 8);
```
Haz clic en Run tras pegar las sentencias.

3. Consultar frutas
Para ver todas las frutas insertadas:

```sql
SELECT * FROM FRUIT;
```
4. Notas: 
La base de datos es en memoria, se borra al reiniciar la app.

Ideal para pruebas rápidas de tus endpoints GET.

No puedes probar POST/PUT/DELETE desde aquí, pero sí ver cómo quedan reflejadas.


  </details>

<details> 
  <summary><strong> ✅ Nivel 2 - CRUD con MySQL </strong></summary>
  
##  🛠 Crear la base de datos fruits-db en MySQL (necesario antes de ejecutar la app)
Antes de arrancar la aplicación Spring Boot, asegúrate de que la base de datos fruits-db existe en tu servidor MySQL.

### ✅ Opción 1: Usando MySQL Workbench
1. Abre **MySQL Workbench**
2. Conéctate al servidor (`localhost`, usuario `root`…)
3. Haz clic derecho en **Schemas > Create Schema...**
4. Pon como nombre: `fruits-db`
5. Haz clic en **Apply** y luego otra vez en **Apply** para confirmar

### ✅ Opción 2: Usando consola (CLI)
1. Abre una terminal
2. Accede al cliente de MySQL:

```bash
"C:\Program Files\MySQL\MySQL Server 9.2\bin\mysql.exe" -u root -p
````
3. Escribe tu contraseña cuando la pida

4. Crea la base de datos con este comando:

```sql
CREATE DATABASE `fruits-db`;
```
5. Sal del cliente MySQL con exit


### Pruebas API Frutas con PowerShell

Estos comandos usan `Invoke-RestMethod` de PowerShell para hacer peticiones REST a tu API Spring Boot.

---

### Crear dos frutas (POST)

```powershell
Invoke-RestMethod -Method POST -Uri http://localhost:8080/fruits/add `
-ContentType "application/json" `
-Body '{"name":"Naranja","kilograms":10}'
```
```powershell
Invoke-RestMethod -Method POST -Uri http://localhost:8080/fruits/add `
-ContentType "application/json" `
-Body '{"name":"Platano","kilograms":7}'
```

---

### Actualizar fruta (PUT)

```powershell
Invoke-RestMethod -Method PUT -Uri http://localhost:8080/fruits/update `
-ContentType "application/json" `
-Body '{"id":1,"name":"Mandarina","kilograms":12}'
```

---

### Borrar fruta (DELETE)

```powershell
Invoke-RestMethod -Method DELETE -Uri http://localhost:8080/fruits/delete/1
```

---

### Obtener fruta por ID (GET)

```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getOne/2
```

---

### Obtener todas las frutas (GET)

```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getAll
```

---
### Notas

- El símbolo `` ` `` al final de línea en PowerShell indica que el comando continúa en la siguiente línea, puedes quitarlo y poner todo en una línea si quieres.
- Cambia las URLs y los datos JSON según tu API y datos.
- Si quieres usar `curl` nativo de Windows 10+, abre CMD o Git Bash para sintaxis clásica `curl`.

---
## Postman - Ejecutar pruebas desde colección

### 📝 Importar manualmente desde archivo

1. Abre Postman
2. Haz clic en **"Import"**
3. Selecciona el archivo:

S04T02N02/postman/S04_02_level2_pruebas.postman_collection.json

> Esto cargará la colección con todas las pruebas listas.


Instrucciones para probar la API en el navegador:

Ya tienes la aplicación arrancada y la base de datos lista con la tabla fruit. Ahora puedes probar los endpoints directamente en el navegador con estas URLs:

Para obtener una fruta concreta por su ID (por ejemplo, la fruta con ID 2):
http://localhost:8080/fruits/getOne/2

Para obtener todas las frutas que hay en la base de datos:
http://localhost:8080/fruits/getAll

Solo tienes que copiar y pegar estas direcciones en el navegador y verás la respuesta JSON con los datos.


  </details>

<details> <summary><strong> ✅ Nivel 3 - CRUD con MongoDB </strong></summary>
  

## 🧪 Pruebas API con PowerShell

### ➕ Añadir frutas (POST)
Una con ID predefinido:

```powershell
Invoke-RestMethod -Method POST -Uri http://localhost:8080/fruits/add `
-ContentType "application/json" `
-Body '{"id":"685bc77f4d90a14505797eed","name":"Naranja","kilograms":10}'
```
Otra con ID generado automáticamente:

```powershell
Invoke-RestMethod -Method POST -Uri http://localhost:8080/fruits/add `
-ContentType "application/json" `
-Body '{"name":"Melocoton","kilograms":6}'
```

### 📝 Actualizar fruta (PUT)
```powershell
Invoke-RestMethod -Method PUT -Uri http://localhost:8080/fruits/update `
-ContentType "application/json" `
-Body '{"id":"685bc77f4d90a14505797eed","name":"Mandarina","kilograms":12}'
```

### ❌ Borrar fruta (DELETE)
```powershell
Invoke-RestMethod -Method DELETE -Uri http://localhost:8080/fruits/delete/685bcc3b4d90a14505797ef2
```
### 🔍 Obtener fruta por ID (GET)
```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getOne/685bc77f4d90a14505797eed
```

### 📋 Obtener todas las frutas (GET)
```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getAll
```
### 🌐 Probar desde el navegador
Puedes acceder directamente desde navegador a:

Ver todas las frutas:
http://localhost:8080/fruits/getAll

Ver una fruta concreta:
http://localhost:8080/fruits/getOne/685bc77f4d90a14505797eed

Recuerda usar IDs válidos existentes

---
## 📦 Postman - Ejecutar pruebas desde colección

### 📝 Importar manualmente desde archivo

1. Abre Postman
2. Haz clic en **"Import"**
3. Selecciona el archivo:

S04T02N02/postman/S04_02_level3_pruebas.postman_collection.json

> Esto cargará la colección con todas las pruebas listas.


</details>

