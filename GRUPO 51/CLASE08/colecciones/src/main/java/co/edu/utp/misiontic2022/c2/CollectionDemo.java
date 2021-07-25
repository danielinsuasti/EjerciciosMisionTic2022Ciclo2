package co.edu.utp.misiontic2022.c2;

import java.util.*;

// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.LinkedList;
// import java.util.Set;

public class CollectionDemo {
    
    public static void main(String[] args) {
        //setDemo();
        //listDemo();
        //queueDemo();
        //mapDemo();
        manejoListas();
    }

    

    public static void setDemo(){
        Set<String> fruta = new HashSet<>();
        fruta.add("manzana");
        fruta.add("mango");
        fruta.add("aguacate");
        fruta.add("melon");
        fruta.add("mango");
        //fruta.add(5);

        System.out.println(fruta.size());//
        System.out.println(fruta);

    }

    public static void listDemo(){
        List<String> fruta = new LinkedList<>();//new ArrayList<>()
        fruta.add("manzana");
        fruta.add("mango");
        fruta.add("aguacate");
        fruta.add("melon");
        fruta.add("mango");
        //fruta.add(5);

        System.out.println(fruta.get(2)); //aguacate
        System.out.println(fruta.size()); //5
        System.out.println(fruta);

        /*RECORRIDO*/
        System.out.println("Implementación Recorrido");

        //FORMA 0 con un for convencional

        for(int i = 0; i < fruta.size(); i++ ){
            System.out.println(fruta.get(i));
        }

        //FORMA 1 ---FUNCIONA CON TODOS --- Menos con MAP

        var i = fruta.iterator();
        while(i.hasNext()){
            System.out.println("con iterador " + i.next());
        }

        // FORMA 2 -- FUNCIONA CON TODOS -- Menos con MAP

        for(String contador : fruta){
            System.out.println("Primer foreach: " + contador);
        }

        //FORMA 3 -- FUNCIONA CON TODOS -- Menos con MAP
        fruta.forEach(x -> System.out.println("Con lambda "+x));

        //FORMA 4 -- FUNCIONA CON TODOS -- Menos con MAP
        fruta.forEach(System.out::println);
    }

    public static void queueDemo(){
        Queue fruta = new PriorityQueue<>();
        fruta.add("manzana");
        fruta.add("mango");
        fruta.add("aguacate");
        fruta.add("melon");
        fruta.add("mango");

        System.out.println(fruta.size()); //5        
        System.out.println(fruta); //[aguacate, mango, mango, melon, manzana]

        fruta.remove();
        System.out.println(fruta);

        System.out.println(fruta.peek());
        System.out.println(fruta);

    }

    public static void mapDemo(){
        Map<String, Integer> frutasCalorias = new HashMap(); //new LinkedHashMap()
        frutasCalorias.put("manzana", 95);
        frutasCalorias.put("limon", 20);
        frutasCalorias.put("banano", 105);
        frutasCalorias.put("naranja", 45);
        frutasCalorias.put("limon", 17);


        // System.out.println(frutasCalorias.size());
        // System.out.println(frutasCalorias);
        // System.out.println(frutasCalorias.get("naranja"));
        // System.out.println(frutasCalorias.entrySet());

        // frutasCalorias.remove("limon");
        // System.out.println(frutasCalorias);

        //ITERAR SOBRE MAPS

        //FORMA 1

        for(var entrada : frutasCalorias.entrySet()){
            System.out.print(entrada.getValue()+ ":   ");
            System.out.println(entrada.getKey());
        }

        //FORMA 2
        frutasCalorias.forEach(
            (k, v) -> System.out.println("fruta: "+ k + ", calorias: " +v));






    }
    
    public static void manejoListas(){
        //Concepto Generics

        List<Object> listaBasica = new ArrayList<>();
        listaBasica.add("Una cadena");
        listaBasica.add(10);
        listaBasica.add(new ClasePersona());
        listaBasica.add(new ArrayList<ClasePersona>());
        System.out.println("Tamaño: "+ listaBasica.size());
        System.out.println(listaBasica);

    }


    
}
