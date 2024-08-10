
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.net.URLEncoder;
import java.sql.SQLException;



public class conectaDAO {
    
    public Connection connectDB() {
        Connection conn = null;
        String password = "@C3ss0!2#4%6";
        String databaseName = "loja"; // Nome do banco de dados
        
        try {
            String encodedPassword = URLEncoder.encode(password, "UTF-8");
            String url = "jdbc:mysql://localhost/" + databaseName + "?user=root&password=" + encodedPassword + "&useSSL=false";
            conn = DriverManager.getConnection(url);
        } catch (SQLException | UnsupportedEncodingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO: " + e.getMessage());
        }
        
        return conn;
    }
}

