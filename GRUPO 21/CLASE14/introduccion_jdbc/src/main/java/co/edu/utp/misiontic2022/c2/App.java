package co.edu.utp.misiontic2022.c2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:hr.db";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM jobs");
            while (rs.next()) {
                int job_id = rs.getInt("job_id");
                String job_title = rs.getString("job_title");
                // Hacer algo con los datos leidos
                System.out.println("Trabajo No. = " + job_id + "  Ocupacion = " + job_title);
            }

        } catch (SQLException e) {
            // Manejo de los errores
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
    }
}
