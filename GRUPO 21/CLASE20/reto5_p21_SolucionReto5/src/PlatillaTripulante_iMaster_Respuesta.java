/*
 * Pueda usar esta plantilla para la carga del reto a iMaster
 * Copie las clases de los paquetes Modelo, Vista, Controlador y Util
 * No incluya los import de los archivos .java solo las clases
 */
// Importaciones necesarias en iMaster
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

// Util (No modificar)
class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}

// Remplace en adelante por las clases de sus archivos .java

// Vista
public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            var requerimiento_1s = controlador.consultarRequerimiento1();

            for(Requerimiento_1 requerimiento_1 : requerimiento_1s ){
                System.out.printf("%s %d %n",requerimiento_1.getNombreMaterial(), requerimiento_1.getPrecioUnidad());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> requerimiento_2s = controlador.consultarRequerimiento2();
            //var requerimiento_2s = controlador.consultarRequerimiento2();


            for(Requerimiento_2 requerimiento_2 : requerimiento_2s ){
                System.out.printf("%s %s %n",requerimiento_2.getConstructora(), requerimiento_2.getCiudad());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            //ArrayList<Requerimiento_2> requerimiento_2s = controlador.consultarRequerimiento2();
            var requerimiento_3s = controlador.consultarRequerimiento3();

            for(Requerimiento_3 requerimiento_3 : requerimiento_3s ){
                System.out.printf("%s %s %s %d %d %n",
                                requerimiento_3.getProveedor(), 
                                requerimiento_3.getNombreMaterial(), 
                                requerimiento_3.getImportado(), 
                                requerimiento_3.getPrecioUnidad(), 
                                requerimiento_3.getCantidad());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

// Controlador
public class ControladorRequerimientos {
    private Requerimiento_1Dao requerimiento_1Dao;
    private Requerimiento_2Dao requerimiento_2Dao;
    private Requerimiento_3Dao requerimiento_3Dao;


    public ControladorRequerimientos(){
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
    }
    
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        return requerimiento_1Dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return requerimiento_3Dao.requerimiento3();
    }
}


// Modelo
// VO
public class Requerimiento_1 {
    private String nombreMaterial;
    private Integer precioUnidad;

    //setters and getters
    public String getNombreMaterial() {
        return nombreMaterial;
    }
    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
    public Integer getPrecioUnidad() {
        return precioUnidad;
    }
    public void setPrecioUnidad(Integer precioUnidad) {
        this.precioUnidad = precioUnidad;
    }


    
}


public class Requerimiento_2 {
    private String constructora;
    private String ciudad;


    //getters and setters 

    
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
}


public class Requerimiento_3 {
    private String proveedor;
    private String nombreMaterial;
    private String importado;
    private Integer precioUnidad;
    private Integer cantidad;

    //getters and setters

    
    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    public String getNombreMaterial() {
        return nombreMaterial;
    }
    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
    public String getImportado() {
        return importado;
    }
    public void setImportado(String importado) {
        this.importado = importado;
    }
    public Integer getPrecioUnidad() {
        return precioUnidad;
    }
    public void setPrecioUnidad(Integer precioUnidad) {
        this.precioUnidad = precioUnidad;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
}


// DAO
public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        
        var response = new ArrayList<Requerimiento_1>();

        String consulta = "SELECT Nombre_Material , Precio_Unidad" 
                            + " FROM MaterialConstruccion mc"
                            + " WHERE Importado = 'Si'"
                            + " ORDER BY Precio_Unidad DESC;";

        try(var connection = JDBCUtilities.getConnection(); 
            var statement = connection.prepareStatement(consulta);
            var rset = statement.executeQuery();) {

                while(rset.next()){
                    var requerimiento_1VO = new Requerimiento_1();
                    requerimiento_1VO.setNombreMaterial(rset.getString("Nombre_Material"));
                    requerimiento_1VO.setPrecioUnidad(rset.getInt("Precio_Unidad"));

                    response.add(requerimiento_1VO);
                }
        }
        return response;

    }
}

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {

        
        var response = new ArrayList<Requerimiento_2>();
        String consulta = "SELECT DISTINCT p.Constructora, p.Ciudad"
                            +" FROM Proyecto p" 
                            +" WHERE p.Ciudad LIKE 'B%'"
                            +" ORDER BY p.Ciudad;";

        try(var connection = JDBCUtilities.getConnection(); 
            var statement = connection.prepareStatement(consulta);
            var rset = statement.executeQuery();) {

                while(rset.next()){
                    var requerimiento_2VO = new Requerimiento_2();
                    requerimiento_2VO.setConstructora(rset.getString("Constructora"));
                    requerimiento_2VO.setCiudad(rset.getString("Ciudad"));

                    response.add(requerimiento_2VO);

                }
        }
        return response;
    }
}

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        var response = new ArrayList<Requerimiento_3>();
        String consulta = "SELECT c.Proveedor, mc.Nombre_Material, mc.Importado, mc.Precio_Unidad, SUM(c.Cantidad ) as Cantidad"
                        + " FROM MaterialConstruccion mc "
                        + " JOIN Compra c ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion" 
                        + " WHERE mc.Importado = 'Si'AND c.Proveedor = 'Homecenter'"
                        + " GROUP BY c.Proveedor , mc.Nombre_Material"
                        + " HAVING SUM(c.Cantidad) > 100"
                        + " ORDER BY c.Proveedor, mc.Nombre_Material;";

        try(var connection = JDBCUtilities.getConnection(); 
            var statement = connection.prepareStatement(consulta);
            var rset = statement.executeQuery();) {

                while(rset.next()){
                    var requerimiento_3VO = new Requerimiento_3();
                    requerimiento_3VO.setProveedor(rset.getString("Proveedor"));
                    requerimiento_3VO.setNombreMaterial(rset.getString("Nombre_Material"));
                    requerimiento_3VO.setImportado(rset.getString("Importado"));
                    requerimiento_3VO.setPrecioUnidad(rset.getInt("Precio_Unidad"));
                    requerimiento_3VO.setCantidad(rset.getInt("Cantidad"));

                    response.add(requerimiento_3VO);

                }
        }
        return response;
    }
}