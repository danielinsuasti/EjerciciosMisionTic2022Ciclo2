package co.edu.utp.misiontic2022.c2;

public class Nota {
    //1)Atributos, variables que antes estaban sueltas
    private int escala100;
    private double escala5;
    private String cualitativa;
    private String nombre; //Evaluación, taller, o reto correspondiente
    private static final int NUMERO_NOTAS = 5;

    Nota(){
        this.escala100 = 0;
        this.escala5 =0;
        this.cualitativa = "";
    }

    Nota(int pEscala100){
        this.escala100 = pEscala100;
        this.escala5 = pEscala100 /20;
        if(pEscala100 >=60){
            this.cualitativa = "Aprobado";
        } else{
            this.cualitativa = "Reprobado";
        }
    }

    Nota(double pEscala5){
        this.escala5 =pEscala5;
        this.escala100 = (int)pEscala5*20;
        if(pEscala5 >=2.95){
            this.cualitativa = "Aprobado";
        }else{
            this.cualitativa= "Reprobado";
        }
    }

    Nota(double pEscala5, int pEscala100, String pCualitativo){
        this.escala100 = pEscala100;
        this.escala5 = pEscala5;
        this.cualitativa = pCualitativo;
    }


    
    
}
