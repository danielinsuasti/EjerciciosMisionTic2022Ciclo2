package co.edu.utp.misiontic2022.c2;

public class Persona {

    //Attributes
    private String nombre;
    private int edad;
    private String genero;

    //Constructores

    public Persona(){
        System.out.println("Yo estoy en el constructor de PERSONA");
    }

    public Persona(String nombre){
        System.out.println("Este es el segundo constructor con nombre");
    }


    // Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    

}
