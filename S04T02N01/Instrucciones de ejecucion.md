
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

markdown
Copiar
Editar

> Esto cargará la colección con todas las pruebas listas.

# 🧪 Ejecución desde consola H2

Puedes insertar y consultar frutas directamente desde la consola H2 de tu aplicación Spring Boot para realizar pruebas rápidas sin usar Postman o PowerShell.

---

## 1. Accede a la consola

Abre tu navegador en: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

Usa esta configuración:

- **JDBC URL:** `jdbc:h2:mem:testdb`
- **User Name:** `sa`
- **Password:** *(déjalo en blanco)*
- Pulsa **Connect**

---

## 2. Insertar frutas de prueba

```sql
INSERT INTO FRUIT (name, kilograms) VALUES ('Manzana', 5);
INSERT INTO FRUIT (name, kilograms) VALUES ('Pera', 8);
```
Haz clic en Run tras pegar las sentencias.

3. Consultar frutas
Para ver todas las frutas insertadas:

```sql
Copiar
Editar
SELECT * FROM FRUIT;
```
4. Notas: 
La base de datos es en memoria, se borra al reiniciar la app.

Ideal para pruebas rápidas de tus endpoints GET.

No puedes probar POST/PUT/DELETE desde aquí, pero sí ver cómo quedan reflejadas.