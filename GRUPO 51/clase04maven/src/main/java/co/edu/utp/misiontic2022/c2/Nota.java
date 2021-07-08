package co.edu.utp.misiontic2022.c2;

public class Nota {
    //1) atributos(antes las variables estaban sueltas)
    private int escala100;
    private double escala5;
    private String cualitativa;
    private String nombre; //Evaluacion, taller, o reto correspondiente
    //Constructores
    Nota(){
        this.escala100 = 0;
        this.escala5 = 0;
        this.cualitativa = "";
    }

    Nota(int pEscala100){
        this.escala100 = pEscala100;
        this.escala5 = pEscala100 /20;

        if(pEscala100 >= 60){
            this.cualitativa = "Aprobado";
        }else{
            this.cualitativa = "Reprobado";
        }

    }

    Nota(double pEscala5){
        this.escala5 = pEscala5;
        this.escala100 = (int)pEscala5 * 20;

        if(pEscala5 >= 2.95){
            this.cualitativa = "Aprobado";
        }else{
            this.cualitativa = "Reprobado";
        }

    }

    Nota(double pEscala5, int pEscala100, String pCualitativo){
        this.escala5 = pEscala5;
        this.escala100 = pEscala100;
        this.cualitativa = pCualitativo;
    }

    //3)metodos-Comportamiento

    //Forma especficia de mostrar información

    public void mostrarNotasConsola(){
        System.out.println("--------------------");
        System.out.println("------Info Nota-----");
        System.out.println("Valor Escala 5 -> " + this.escala5);
        System.out.println("Valor Escala 100 -> " + this.escala100);
        System.out.println("Valor Escala Cualitativa -> " + this.cualitativa);

    }
    
    //4 Getters

    public int getEscala100(){
        return escala100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEscala5(){
        return escala5;
    }

    public String getCualitativa(){
        return cualitativa;
    }

    //5 Setters


    public void setEscala100(int nuevaEscala100){
        this.escala100 = nuevaEscala100;
    }

    public void setEscala5(double nuevaEscala5){
        this.escala5 = nuevaEscala5;
    }

    public void setCualitativa(String nuevaCualitativa){
        this.cualitativa = nuevaCualitativa;
    }
    
    
}
