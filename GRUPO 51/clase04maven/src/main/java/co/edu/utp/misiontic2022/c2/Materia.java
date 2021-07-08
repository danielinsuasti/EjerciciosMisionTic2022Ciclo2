package co.edu.utp.misiontic2022.c2;

public class Materia {

    //1)Atributos
    private String nombre;
    private double promedioAjustado;
    private double promedio;
    private String promedioCualitativo;
    private String promedioCualitativoAjustado;
    private Nota nota1; //Declaradas, no estan inicializadas (null)
    private Nota nota2;
    private Nota nota3;
    private Nota nota4;
    private Nota nota5;
    private Nota notaExcluida; //Peor Nota
    private Nota mejorNota;
    //2)Metodos Constructores
    Materia(){
        this.nombre="Sin Nombre";
        this.promedioAjustado = 0.0;
        this.promedio = 0.0;
        this.promedioCualitativo = "";
        this.promedioCualitativoAjustado = "";
        this.nota1 = new Nota();
        this.nota2 = new Nota();
        this.nota3 = new Nota();
        this.nota4 = new Nota();
        this.nota5 = new Nota();
        this.notaExcluida = new Nota();
        this.mejorNota = new Nota();

    }

    public Materia(int pNota1_100, int pNota2_100, int pNota3_100, int pNota4_100, int pNota5_100) {
        this.nombre="Sin Nombre";
        this.promedioAjustado = 0.0;
        this.promedio = 0.0;
        this.promedioCualitativo = "";
        this.promedioCualitativoAjustado = "";
        this.nota1 = new Nota(pNota1_100);
        this.nota2 = new Nota(pNota2_100);
        this.nota3 = new Nota(pNota3_100);
        this.nota4 = new Nota(pNota4_100);
        this.nota5 = new Nota(pNota5_100);
        this.notaExcluida = new Nota();
        this.mejorNota = new Nota();
    }   

    //Metodos Generales

    public void mostrarMateria(){
        System.out.println("*********************MATERIA*************************");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Notas: " );
        this.nota1.mostrarNotasConsola();
        this.nota2.mostrarNotasConsola();
        this.nota3.mostrarNotasConsola();
        this.nota4.mostrarNotasConsola();
        this.nota5.mostrarNotasConsola();
        System.out.println("Peor Nota: " );

        
    }


    







    
}
