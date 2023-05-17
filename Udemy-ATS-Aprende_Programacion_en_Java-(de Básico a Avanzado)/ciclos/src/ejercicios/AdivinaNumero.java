package ejercicios;

import java.util.Scanner;

public class AdivinaNumero {
    
    public static void main(String[] args) {
        
        
        /*
        ENUNCIADO
        Realizar un juego para adivinar un numero. Para ello generar
        un numero aleatorio entre 0-100, y luego ir pidiendo numeros
        indicando "es mayor" o "es menor" segun sea mayor o menor con
        respecto a N. el proceso termina cuando el usuario acierta y 
        mostrar el numero de intentos.
        */
        
        //Atributos
        int numero=(int) (Math.random()* ((100-0)+1)+0); //Random con rangos
        int opcion,contador=0;
        
        
        //Pedimos datos
        Scanner entrada=new Scanner(System.in);
        
        //Operacion
        while(true){
            System.out.println("Digita un numero: ");
            opcion=entrada.nextInt();
            
            if(opcion > numero){
                System.out.println("Es el numero es menor");
                contador+=1;
            }
            if(opcion < numero){
                System.out.println("Es el numero es mayor");
                contador+=1;
            }
            
            if (opcion == numero){
                System.out.println("Loteria, ganaste ... te demoraste "+contador+ " intentos.");
            }
        }
        
        
    }
    
}
