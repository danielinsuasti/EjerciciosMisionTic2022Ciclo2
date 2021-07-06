package co.edu.utp.misiontic2022.c2;

public class PromedioAjustado {
    //Algoritmo promedio ajustado
        //1) Identificar cuál es la peor nota
        //2) Retirar la peor nota
        //3) Obtener el promedio
        //4) Hacer la conversión a escala de 0 a 5
        //5) Retornar el resultado

       
        public static double nota_quices_iterativo(int nota1 , int nota2, int nota3, int nota4, int nota5){

            //Variable que va a contener el resultado
            double PromedioAjustado=0;


            //1) Identificar cuál es la peor nota
            /*
            int peorNota = nota1;

            if(nota2<peorNota){
                peorNota = nota2;
            }
            if(nota3<peorNota){
                peorNota =nota3;
            }
            if(nota4<peorNota){
                peorNota =nota4;
            }
            if(nota5<peorNota){
                peorNota =nota5;
            }
            */
            
            int peorNota = nota1;
            peorNota = nota2< peorNota ? nota2 : peorNota;
            peorNota = nota3< peorNota ? nota3 : peorNota;
            peorNota = nota4< peorNota ? nota4 : peorNota;
            peorNota = nota5< peorNota ? nota5 : peorNota;
            

            //2) Retirar la peor nota
            //3) Obtener el promedio

            PromedioAjustado = ((nota1 + nota2 + nota3 + nota4 + nota5)-peorNota)/4;

            //4) Hacer la conversión a escala de 0 a 5
            PromedioAjustado = PromedioAjustado/20;

            return PromedioAjustado;
        }       
        
        



        public static void main(String[] args) {

            String codigo = "AA01";
            double resultadoNota = nota_quices_iterativo(40, 50, 39, 76, 96);

            System.out.println("El promedio ajustado del estudiante "+codigo+ " es: " + resultadoNota);
            
        }

    
}
