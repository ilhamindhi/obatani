package Koneksi_DB;
import java.sql.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HM
 */
public class koneksinya {
    private static Connection koneksi;
    
    public static Connection GetConnection() throws SQLException{
        if(koneksi==null){
            new Driver();
            koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/obatani", "root", "");
        }
        return koneksi;
    }
}