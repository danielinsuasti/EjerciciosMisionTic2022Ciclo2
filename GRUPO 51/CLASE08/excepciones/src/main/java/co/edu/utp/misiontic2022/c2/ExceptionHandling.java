package co.edu.utp.misiontic2022.c2;

import java.io.File;

import javax.sql.StatementEventListener;

public class ExceptionHandling {

    public static void main(String[] args) {
        //errorMatematico_fueraIndice();
        createNewFile();
    }
    
    //Error matematico y error fuera de indice
    public static void errorMatematico_fueraIndice(){

        int[] array=new int[20];
        try{
            array[-3] = -24;
            int b = 0;
            int a = 23/b;
        }catch(Exception  ex){//ArrayIndexOutOfBoundsException | ArithmeticException  ex
            ex.printStackTrace();
            System.out.println("Error fuera de indice");        
            System.out.println("Error Aritmetico");
        }finally{
            System.out.println("Clausula finally");
        }

        System.out.println("Terminé!");        

    }

    // Escriba un programa que cree un nuevo archivo
    // Maneje las excepciones que puedan ocurrir
    public static void createNewFile(){
        File file = new File("recursos/archivoNoExistente.txt");
        try{
            file.createNewFile();
        }catch(Exception e){ //(IOException e)
            System.out.println("El directorio no existe");
            e.printStackTrace();
        }        
    }

    

    
}
