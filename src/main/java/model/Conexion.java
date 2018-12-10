package model;

import com.mysql.jdbc.Connection;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexion {

    private static String mode = "";
    private static String urlServidor = "";
    private static String puerto = "";
    private static String BD = "";
    private static String server = "";
    private static String user = "";
    private static String pass = "";
    private static String driver = "com.mysql.jdbc.Driver";
    private static Connection conexion;

    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Conexion c = new Conexion();
        c.conexion();
    }
    
    public String lecturaDatosConfiguracion() {
        Properties prop = new Properties();

        try {
            prop.load(new FileReader(System.getProperty("user.dir") + "\\config.properties"));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        this.mode = prop.getProperty("conexion.mode");
        this.urlServidor = prop.getProperty("conexion.servidor");
        this.puerto = prop.getProperty("conexion.puerto");
        this.BD = prop.getProperty("conexion.bd");
        this.user = prop.getProperty("conexion.user");
        this.pass = prop.getProperty("conexion.pass");
        this.server = mode + "://" + urlServidor + ":" + puerto + "/" + BD;
        return server;
    }

    public Connection conexion() throws SQLException, ClassNotFoundException {
        Connection estado = null;
        try {
            Class.forName(driver);//iniciando driver
            conexion = (Connection) DriverManager.getConnection(lecturaDatosConfiguracion(), user, pass);//establecer conexion
            System.out.println("Conexion exitosa");//Prueba de conexion
            estado = conexion;// define el estado de la conexion
        } catch (SQLException e) {
            System.out.println("Error en la conexion " + e);
        } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
        }
        return estado;// retorna el estado de la conexion   
    }

    public void closeConection(Connection conexion) throws SQLException {
        conexion.close();// cierra la conexion
    }
    

}
