package co.edu.utp.misiontic2022.c2;

public class ExceptionHandling {
    
    public static void main(String[] args) {
        errorMatematico_fueraIndice();
        
    }

    public static void errorMatematico_fueraIndice(){
        int[] array = new int[20];
        try{
            array[-3] = -24;
            int b = 0;
            int a = 23 / b;
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException ex){//Exception ex
            ex.printStackTrace();
            System.out.println("Error de indice en un array");

        }
        
        
    }
    
}
