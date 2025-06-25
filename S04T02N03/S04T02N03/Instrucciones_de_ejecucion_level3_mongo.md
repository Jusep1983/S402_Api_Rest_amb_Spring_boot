
🧪 Pruebas API con PowerShell
➕ Añadir frutas (POST)
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

📝 Actualizar fruta (PUT)
```powershell
Invoke-RestMethod -Method PUT -Uri http://localhost:8080/fruits/update `
-ContentType "application/json" `
-Body '{"id":"685bc77f4d90a14505797eed","name":"Mandarina","kilograms":12}'
```

❌ Borrar fruta (DELETE)
```powershell
Invoke-RestMethod -Method DELETE -Uri http://localhost:8080/fruits/delete/685bcc3b4d90a14505797ef2
```
🔍 Obtener fruta por ID (GET)
```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getOne/685bc77f4d90a14505797eed
```

📋 Obtener todas las frutas (GET)
```powershell
Invoke-RestMethod -Uri http://localhost:8080/fruits/getAll
```
🌐 Probar desde el navegador
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
