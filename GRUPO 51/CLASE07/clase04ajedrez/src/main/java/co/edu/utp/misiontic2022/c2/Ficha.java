package co.edu.utp.misiontic2022.c2;


public abstract class Ficha implements Dibujable, ElementoMovil
{
    private Color color;//Blanco, BLANCO, BLANCo


  

    public Boolean comer(){
        //Si en la  casilla en la que semueve se encuentra una ficha
        //del oponente, entonces captura la ficha
        return true;
    }

    public abstract Boolean mover();

    
    
}
