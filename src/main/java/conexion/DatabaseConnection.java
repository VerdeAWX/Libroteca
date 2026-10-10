package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Singleton proveedor de conexiones JDBC. Cada operación obtiene su propia conexión. */
public final class DatabaseConnection {
    private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    private final String url, user, password;
    private DatabaseConnection() {
        url = env("BIBLIOTECA_DB_URL", "jdbc:mysql://localhost:3306/biblioteca?useSSL=false&serverTimezone=America/Santiago&allowPublicKeyRetrieval=true");
        user = env("BIBLIOTECA_DB_USER", "root");
        password = env("BIBLIOTECA_DB_PASSWORD", "123456.");
        try { Class.forName("com.mysql.cj.jdbc.Driver"); }
        catch (ClassNotFoundException e) { throw new IllegalStateException("No se encontró MySQL Connector/J. Revisa las dependencias Maven.", e); }
    }
    private static String env(String key, String fallback) { String value=System.getenv(key); return value==null ? fallback : value; }
    public static DatabaseConnection getInstance() { return INSTANCE; }
    public Connection getConnection() throws SQLException { return DriverManager.getConnection(url,user,password); }
}