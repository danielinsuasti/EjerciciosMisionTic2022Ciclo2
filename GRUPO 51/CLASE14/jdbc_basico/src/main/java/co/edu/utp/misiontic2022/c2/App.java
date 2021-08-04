package co.edu.utp.misiontic2022.c2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
        ResultSet rs= null;

        try {
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM jobs");

            while(rs.next()){
                int id_job = rs.getInt("job_id");
                String title_job = rs.getString("job_title");
                int salario_min = rs.getInt("min_salary");
                int salario_max = rs.getInt("max_salary");                
                //Hacer lo que quiera con los datos leidos
                System.out.println( "Id_Trabajo= " + id_job + 
                                    " Nombre Trabajo = "+ title_job + 
                                    " Salario Maximo = "+ salario_max);

            }

        } catch (SQLException e) {
            // Manejo de los errores
        }finally {
            try {
            if (rs != null){
            rs.close();
            }
            if (stmt != null) {
            stmt.close();
            }
            if (conn != null){
            conn.close();
            }
            } catch (SQLException e) {
            }
    }
}
}
