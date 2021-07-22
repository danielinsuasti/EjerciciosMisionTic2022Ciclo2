package co.edu.utp.misiontic2022.c2;

public class Empleado extends Persona {
    //atributos

    private String idEmpleado;
    private String tituloEmpleado;
    //constructores

    public Empleado(){
        super("angie");
        //System.out.println("Estes es el constructor de EMPLEADO");
        
    }


    //getters and setters


    public String getIdEmpleado() {
        return idEmpleado;
    }
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public String getTituloEmpleado() {
        return tituloEmpleado;
    }
    public void setTituloEmpleado(String tituloEmpleado) {
        this.tituloEmpleado = tituloEmpleado;
    }

    
    
}
