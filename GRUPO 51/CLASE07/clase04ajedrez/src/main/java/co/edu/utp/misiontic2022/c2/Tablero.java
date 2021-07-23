package co.edu.utp.misiontic2022.c2;


public class Tablero
{
    //Atributos
    private Casilla[] casillas;// = new Casilla[64];

    //Constructor
    public Tablero(){
        casillas = new Casilla[64];
        
        for(int i = 0; i < 64; i++){
            casillas[i] = new Casilla(i/8, i%8);
        }

    }




    public Boolean HacerEnroque(){
        return true;
    }

    public Boolean HacerJaque(){
        return true;
    }

    public Boolean HacerJaqueMate(){
        return true;
    }
    
}
