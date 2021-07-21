package co.edu.utp.misiontic2022.c2;

public abstract class Ficha {
    private String color;


    public Boolean comer(){
        //Si en la casilla en la que se mueve se encuentra una ficha
        //del oponente, entonces captura la ficha.
        
        return true;
    }

    public abstract Boolean mover();
    
}
