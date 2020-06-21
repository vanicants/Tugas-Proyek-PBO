import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
class connection {
  
public class koneksiDB {
    private Connection mysqlconfig;
    public  Connection konekDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/Data_Pegawai"; //url database
            String user="root"; //user database
            String pass=""; //password database
           DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (SQLException e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }  
}
}

  
