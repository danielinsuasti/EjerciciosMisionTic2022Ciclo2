package co.edu.utp.misiontic2022.c2;

public class Empleado extends Persona {

    //Atributes
    private String idEmpleado;
    private String tituloEmpleado;


    //Constructor
    public Empleado(){
        super("nombre");
        System.out.println("Este es el constructor de empleado");
    }




    //getters and Setters
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
