
package conexion;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chris
 */
public class ConectarBD {
   
    public static java.sql.Connection conectar() {
        try {
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fixbox", "root", "12345");
            System.out.println("Conectado con Exito");
            return cn;
        } catch (SQLException e) {
            System.err.println("Error en la conexión local " + e);
        }
        return (null);
    }

}
