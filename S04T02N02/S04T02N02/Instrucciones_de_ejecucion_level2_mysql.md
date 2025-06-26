🛠 Crear la base de datos fruits-db en MySQL (necesario antes de ejecutar la app)
Antes de arrancar la aplicación Spring Boot, asegúrate de que la base de datos fruits-db existe en tu servidor MySQL.

✅ Opción 1: Usando MySQL Workbench
1. Abre **MySQL Workbench**
2. Conéctate al servidor (`localhost`, usuario `root`…)
3. Haz clic derecho en **Schemas > Create Schema...**
4. Pon como nombre: `fruits-db`
5. Haz clic en **Apply** y luego otra vez en **Apply** para confirmar

✅ Opción 2: Usando consola (CLI)
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


# Pruebas API Frutas con PowerShell

Estos comandos usan `Invoke-RestMethod` de PowerShell para hacer peticiones REST a tu API Spring Boot.

---

## Crear dos frutas (POST)

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

## Actualizar fruta (PUT)

```powershell
Invoke-RestMethod -Method PUT -Uri http://localhost:8080/fruits/update `
-ContentType "application/json" `
-Body '{"id":1,"name":"Mandarina","kilograms":12}'
```

---

## Borrar fruta (DELETE)

```powershell
Invoke-RestMethod -Method DELETE -Uri http://localhost:8080/fruits/delete/1
```

---

## Obtener fruta por ID (GET)

```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getOne/2
```

---

## Obtener todas las frutas (GET)

```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getAll
```

---
## Notas

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