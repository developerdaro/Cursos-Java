package ejercicios;

import java.util.Scanner;


public class IndicarPositivoNegativoCeroSale {
    
    public static void main(String[] args) {
        
        
        /*
        ENUNCIADO
        
        Leer un numero e indicar si es positivo o negativo. El proceso se repetira
        hasta que se introduzca un 0
        */
        
        //Atributos
        int numero;
        
        //Pedir informacion
        Scanner entrada=new Scanner(System.in);
       
        
        while (true) {      
          System.out.print("Digita un numero por favor: ");
          numero=entrada.nextInt();
          
          if (numero>0){
              System.out.println("El numero es positivo");
          }
          if (numero<0){
              System.out.println("El numero es negativo");
          }
          if (numero ==0){
              System.out.println("Cero, Adios");
              break;
          }
            
        }
        
        
    }
    
}
