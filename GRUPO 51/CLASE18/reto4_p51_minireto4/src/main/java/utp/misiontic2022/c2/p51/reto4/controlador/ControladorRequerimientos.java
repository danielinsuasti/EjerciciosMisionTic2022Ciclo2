package utp.misiontic2022.c2.p51.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p51.reto4.modelo.dao.Requerimiento_4Dao;

import utp.misiontic2022.c2.p51.reto4.modelo.vo.Requerimiento_4;


public class ControladorRequerimientos {
    private Requerimiento_4Dao requerimiento_4Dao;

    public ControladorRequerimientos(){
        this.requerimiento_4Dao = new Requerimiento_4Dao();
    }
    
    public ArrayList<Requerimiento_4> consultarRequerimiento4() throws SQLException {
        return requerimiento_4Dao.requerimiento4();
    }

}
