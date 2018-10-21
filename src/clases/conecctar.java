/*
 * Esta clase se usa para poder conectarnos con la base de datos
 * del museoxela...
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Francisco
 */
public class conecctar {
    private static Connection conect;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/museoxela";

    public Connection conexion() {
        conect = null;
        try{
           Class.forName(driver); 
           conect = DriverManager.getConnection(url, user, password);
           if(conect != null){
               System.out.println("Se Conecto a la Base de Datos Exitosamente");
           }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("No se puede Conecatar ala Base de Datos" + e);
             
        }
        return null;
    }
    
    //Este metodo sirve para retornarnos la conexion
    public Connection getConnection(){
        return conect; 
    }
    
    //Metodo que sierve para desconecatar la base de datos
    public void desconectar(){
        conect = null;
        if(conect == null){
            System.out.println("La Conexion se ha Terminado");
        }
    }
    
}
