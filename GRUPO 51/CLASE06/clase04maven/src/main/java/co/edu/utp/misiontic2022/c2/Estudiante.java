package co.edu.utp.misiontic2022.c2;

public class Estudiante {
    //Atributos

    private int codigo;
    private String nombres;
    private String apellidos;
    private int semestreActual;
    private String genero;

	//Constructores
    Estudiante(int pCodigo, String pNombres, String pApellidos, int pSemestreActual, String pGenero){
        this.codigo = pCodigo;
        this.nombres = pNombres;
        this.apellidos = pApellidos;
        this.semestreActual = pSemestreActual;
        this.genero = pGenero;
    }

	//Metodos Generales

    public void mostrarEstudiante(){
        System.out.println("_______Datos del estudiante_______");
        System.out.println("Codigo = " + this.codigo  );
        System.out.println("Nombres = " + this.nombres);
        System.out.println("Apellidos = " + this.apellidos);
        System.out.println("Semestre Actual = "+ this.semestreActual);
        System.out.println("Genero = "+ this.genero);

    }


    //Getters y Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

	//Main (Punto de entrada)
    
}
