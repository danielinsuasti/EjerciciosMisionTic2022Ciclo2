public class ejemploString{

    public static void main(String[] args) {
        String cadena1 = "Esto es una cadena";
        String cadena2 = "Hola";
        String cadena3 = "hola";
        String cadena4 = "          hola  asdfasdf                    ";
        
        
        System.out.println("Longitud de la cadena es: " + cadena1.length());
        System.out.println("funcion indexOf() : " + cadena1.indexOf("una"));
        System.out.println("funcion lastIndexOf() : " + cadena1.lastIndexOf("e"));
        System.out.println("funcion charAt() : " + cadena2.charAt(3));
        System.out.println("las ultimas dos palabras = " + cadena1.substring(8,18));
        System.out.println("funcion .equals() : " + cadena2.equals(cadena3));
        System.out.println("funcion .equalsIgnoreCase() : " + cadena2.equalsIgnoreCase(cadena3));
        System.out.println("funcion .trim() :" + cadena4.trim());




    }
}