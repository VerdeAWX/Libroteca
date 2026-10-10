package dao;
import conexion.DatabaseConnection;import modelo.Usuario;import java.sql.*;
public class UsuarioDAO {
 public Usuario autenticar(String correo,String clave) throws SQLException {String sql="SELECT id,nombre,rut,correo,rol FROM usuarios WHERE correo=? AND `contraseña`=?";try(Connection c=DatabaseConnection.getInstance().getConnection();PreparedStatement p=c.prepareStatement(sql)){p.setString(1,correo);p.setString(2,clave);try(ResultSet r=p.executeQuery()){if(r.next())return new Usuario(r.getInt("id"),r.getString("nombre"),r.getString("rut"),r.getString("correo"),r.getString("rol"));return null;}}}
}