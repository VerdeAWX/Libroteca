# Libroteca — Sistema de Gestión de Biblioteca Escolar

Aplicación de escritorio Java Swing + MySQL/JDBC, organizada en MVC y DAO. Requiere JDK 17+, Maven y MySQL 8+.

## Preparación de la base de datos
1. En MySQL Workbench ejecuta `database/crear_biblioteca.sql`.
2. Ejecuta después el script oficial de poblado entregado por Duoc: `PRY2203_EFT_S9_Script_poblado_tablas_biblioteca.sql`.
3. Si ya tienes las tablas oficiales, no ejecutes de nuevo el script de creación; ejecuta solo el poblado cuando corresponda y no haya registros duplicados.

## Configurar conexión
Edita `src/main/java/conexion/DatabaseConnection.java` o define variables de entorno `BIBLIOTECA_DB_URL`, `BIBLIOTECA_DB_USER` y `BIBLIOTECA_DB_PASSWORD`. Valores por defecto: `jdbc:mysql://localhost:3306/biblioteca...`, usuario `root`, contraseña vacía. Cambia esto según tu instalación. No subas credenciales reales al repositorio.

## Ejecutar en IntelliJ
1. Abre la carpeta del proyecto (la que contiene `pom.xml`) como proyecto Maven.
2. Espera que Maven descargue MySQL Connector/J.
3. Configura la conexión local en `DatabaseConnection.java` o con las variables de entorno.
4. Ejecuta la clase `Main`.

## Usuario de prueba del script entregado
Bibliotecario: correo `antonia@correo.cl`, contraseña `clave123`.
Estudiante: correo `carlos@correo.cl`, contraseña `clave123`.
El script oficial almacena contraseñas de texto plano para fines de prueba académica; en un sistema real se deben almacenar hashes seguros.

## Funcionalidades
- Login y permisos por rol.
- CRUD de libros y estudiantes (bibliotecario).
- Préstamos y devoluciones con vencimiento de 7 días.
- Registro de préstamo en `SwingWorker`, sin bloquear la interfaz.
- Sincronización de operación de préstamo y transacción SQL con actualización condicional del stock.
- Reportes: libros más prestados, historial por estudiante y préstamos pendientes.

## Empaquetado
Desde la terminal en la carpeta del proyecto: `mvn clean package`. El JAR con dependencias queda en `target/libroteca-1.0.0.jar` gracias al plugin Shade de Maven. Ejecútalo con `java -jar target/libroteca-1.0.0.jar`.
