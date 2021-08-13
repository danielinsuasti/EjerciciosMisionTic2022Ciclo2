package utp.misiontic2022.c2.p51.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p51.reto4.modelo.vo.Requerimiento_4;
import utp.misiontic2022.c2.p51.reto4.util.JDBCUtilities;

public class Requerimiento_4Dao {

    public ArrayList<Requerimiento_4> requerimiento4() throws SQLException {
        
        var connection = JDBCUtilities.getConnection();

        var respuesta = new ArrayList<Requerimiento_4>();

        var consulta = "SELECT c.Proveedor, mc.Nombre_Material, mc.Importado, mc.Precio_Unidad, SUM(c.Cantidad ) as Cantidad"
                        + " FROM MaterialConstruccion mc" 
                        + " JOIN Compra c ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion" 
                        + " WHERE mc.Importado = 'Si'AND c.Proveedor = 'Homecenter'"
                        + " GROUP BY c.Proveedor , mc.Nombre_Material"
                        + " ORDER BY c.Proveedor, mc.Nombre_Material";

        PreparedStatement stmt = null;
        ResultSet rset = null;

        try{
            stmt = connection.prepareStatement(consulta);
            rset = stmt.executeQuery();

            while(rset.next()){
                var requerimiento4VO = new Requerimiento_4();
                requerimiento4VO.setProveedor(rset.getString("Proveedor"));
                requerimiento4VO.setNombreMaterial(rset.getString("Nombre_Material"));
                requerimiento4VO.setImportado(rset.getString("Importado"));
                requerimiento4VO.setPrecioUnidad(rset.getInt("Precio_Unidad"));
                requerimiento4VO.setCantidad(rset.getInt("Cantidad"));

                respuesta.add(requerimiento4VO);
            }
        }finally{
            if(rset != null){
                rset.close();
            }
            if(stmt != null){
                stmt.close();
            }
            if(connection != null){
                connection.close();
            }
        }

        return respuesta;       
        
    }
}