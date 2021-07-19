package co.edu.utp.misiontic2022.c2;

public class Materia {

    //Atributos
    private String nombre;
    private double promedioAjustado;
    private double promedio;
    private String promedioCualitativo;
    private String promedioCualitativoAjustado;
    private Nota nota1; //Declaro nota, pero aún no la inicializo (null)
    private Nota nota2;
    private Nota nota3;
    private Nota nota4;
    private Nota nota5;
    private Nota notaExcluida;
    private Nota mejorNota;


    //Constructores

    Materia(){
        this.nombre = "nombre no asignado";
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


    Materia(int pNota1_100, int pNota2_100, int pNota3_100, int pNota4_100, int pNota5_100){
        this.nombre = "nombre no asignado";
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
        System.out.println("____________________MATERIA_____________________");
        System.out.println("Nombre Materia: "+ this.nombre);
        System.out.println("Notas:  ");
        this.nota1.mostrarNotasConsola();
        this.nota2.mostrarNotasConsola();
        this.nota3.mostrarNotasConsola();
        this.nota4.mostrarNotasConsola();
        this.nota5.mostrarNotasConsola();
        System.out.println("Esta es la peor nota: ");
        this.notaExcluida.mostrarNotasConsola();
        System.out.println("Esta es la mejor nota: ");
        this.mejorNota.mostrarNotasConsola();
        System.out.println("Promedio Ajustado -> " + this.promedioAjustado);
        System.out.println("Promedio sin Ayuda ->" + this.promedio);
        System.out.println("Promedio cualitativa Ajustado ->" + this.promedioCualitativoAjustado);
        System.out.println("Promedio cualitativo sin Ayuda ->" + this.promedioCualitativo);

    }


    public void calcularPeorNota(){
        //Asumimos que la primer nota es la peor nota
        this.notaExcluida = this.nota1;

        //Hacemos las comparaciones

        if(this.nota2.getEscala100() < this.notaExcluida.getEscala100()){
            this.notaExcluida=this.nota2;
        }
        if(this.nota3.getEscala100() < this.notaExcluida.getEscala100()){
            this.notaExcluida = this.nota3;
        }
        if(this.nota4.getEscala100() < this.notaExcluida.getEscala100()){
            this.notaExcluida = this.nota4;
        }
        if(this.nota5.getEscala100() < this.notaExcluida.getEscala100()){
            this.notaExcluida = this.nota5;
        }
    }


    public void calcularMejorNota(){
        //Asumimos que la primer nota es la peor nota
        this.mejorNota = this.nota1;

        //Hacemos las comparaciones

        if(this.nota2.getEscala100() > this.mejorNota.getEscala100()){
            this.mejorNota=this.nota2;
        }
        if(this.nota3.getEscala100() > this.mejorNota.getEscala100()){
            this.mejorNota = this.nota3;
        }
        if(this.nota4.getEscala100() > this.mejorNota.getEscala100()){
            this.mejorNota = this.nota4;
        }
        if(this.nota5.getEscala100() > this.mejorNota.getEscala100()){
            this.mejorNota = this.nota5;
        }
    }


    public void calcularPromedioAjustado(){

        //Tomar/Calcular/Identificar cual es la per nota
        this.calcularPeorNota();

        //Calculamos el promedio quitando la peor nota

        this.promedioAjustado = (nota1.getEscala100() + nota2.getEscala100() + nota3.getEscala100() + nota4.getEscala100() + nota5.getEscala100() - notaExcluida.getEscala100()) / 4;

        //Expresarlo en el atributo cualitativo

        Nota notaPromedioAjustado = new Nota((int)this.promedioAjustado);
        this.promedioCualitativoAjustado = notaPromedioAjustado.getCualitativa();


        //Aprovechamos el comportamiento que hicimos al promedio
        this.promedioAjustado =notaPromedioAjustado.getEscala5();
    }


    public void calcularPromedio(){      

        //Calculamos el promedio SIN quitar la peor nota

        this.promedio = (nota1.getEscala100() + nota2.getEscala100() + nota3.getEscala100() + nota4.getEscala100() + nota5.getEscala100()) / 5;

        //Expresarlo en el atributo cualitativo
        Nota notaPromedio = new Nota((int)this.promedio);
        this.promedioCualitativo = notaPromedio.getCualitativa();

        //Aprovechamos el comportamiento que hicimos al promedio
        this.promedio =notaPromedio.getEscala5();
    }


	//Getters

    public Nota getMejorNota() {
        return mejorNota;
    }

    public Nota getNotaExcluida() {
        return notaExcluida;
    }

    public double getPromedio() {
        return promedio;
    }

    public double getPromedioAjustado() {
        return promedioAjustado;
    }
    
    
	//Setters

    public void setNota1(Nota nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Nota nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(Nota nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(Nota nota4) {
        this.nota4 = nota4;
    }

    public void setNota5(Nota nota5) {
        this.nota5 = nota5;
    }



	//Main (Punto de entrada)
    
}
