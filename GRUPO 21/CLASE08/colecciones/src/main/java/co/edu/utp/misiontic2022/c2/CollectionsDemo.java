package co.edu.utp.misiontic2022.c2;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        //setDemo();
        //listDemo();
        //mapDemo();
        //queueDemo();
        manejoListas();
        
    }


    public static void setDemo(){
        Set<String> fruta = new LinkedHashSet<();
        fruta.add("manzana");
        fruta.add("limon");
        fruta.add("banano");
        fruta.add("naranja");
        fruta.add("limon");
        //fruta.add(5);//Integer

        System.out.println(fruta.size());//4
        System.out.println(fruta);

    }
    
    public static void listDemo(){
        List<String> fruta = new ArrayList<>();//var fruta = new ArrayList<String>();
        fruta.add("manzana");
        fruta.add("limon");
        fruta.add("banano");
        fruta.add("naranja");
        fruta.add("limon");
        //fruta.add(5);
        System.out.println(fruta.get(2));//banano
        System.out.println(fruta.size());//5
        System.out.println(fruta); //[manzana, limon, banano, naranja, limon]
        //fruta[3] = "zapallo";
        System.out.println();
    }

    public static void queueDemo(){
        Queue fruta = new LinkedList();
        fruta.add("manzana");
        fruta.add("limon");
        fruta.add("banano");
        fruta.add("naranja");
        fruta.add("limon");
       

        System.out.println(fruta.size());//5
        System.out.println(fruta);

        fruta.remove();
        System.out.println(fruta);
        fruta.remove();
        System.out.println(fruta);

        System.out.println(fruta.peek());
        System.out.println(fruta);
        
    }

    public static void mapDemo(){
        Map frutasCalorias = new LinkedHashMap();
        frutasCalorias.put("manzana", 95);
        frutasCalorias.put("limon", 20);
        frutasCalorias.put("banano", 105);
        frutasCalorias.put("naranja", 45);
        frutasCalorias.put("limon", 17);

        System.out.println(frutasCalorias.size());
        System.out.println(frutasCalorias);
        System.out.println(frutasCalorias.get("banano"));
        System.out.println(frutasCalorias.entrySet());

        frutasCalorias.remove("naranja");
        System.out.println(frutasCalorias);
    }

    public static void manejoListas(){
        //Conceptro Generics
        List<Object> listaBasica = new ArrayList<>(); //Stack //LinkedList
        listaBasica.add("una cadena");
        listaBasica.add(56.65); 
        //listaBasica.add(new ArrayList<ClasePersona>());
        //listaBasica.add(new ClasePersona());
        System.out.println("Tamaño: " + listaBasica.size());
    }







    
    
}
