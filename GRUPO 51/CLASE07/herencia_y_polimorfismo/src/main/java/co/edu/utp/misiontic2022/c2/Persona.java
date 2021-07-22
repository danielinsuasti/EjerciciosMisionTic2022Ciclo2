package co.edu.utp.misiontic2022.c2;

public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private String genero;
    //constructores
    Persona(){
        System.out.println("Yo estoy en el primer constructor Persona");
    }

    Persona(String nombre){
        System.out.println("Estes es el segundo constructor con nombre " + nombre);
    }


    //getters and setters

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
