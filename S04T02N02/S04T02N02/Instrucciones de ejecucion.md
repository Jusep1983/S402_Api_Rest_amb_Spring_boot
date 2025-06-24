
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

S04T02N01/postman/S04_02_level1_pruebas.postman_collection.json

> Esto cargará la colección con todas las pruebas listas.


Instrucciones para probar la API en el navegador:

Ya tienes la aplicación arrancada y la base de datos lista con la tabla fruit. Ahora puedes probar los endpoints directamente en el navegador con estas URLs:

Para obtener una fruta concreta por su ID (por ejemplo, la fruta con ID 1):
http://localhost:8080/fruits/getOne/1

Para obtener todas las frutas que hay en la base de datos:
http://localhost:8080/fruits/getAll

Solo tienes que copiar y pegar estas direcciones en el navegador y verás la respuesta JSON con los datos.