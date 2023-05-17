package ejercicios;

import java.util.Scanner;


public class ContadorNumerosPositivos {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        Pedir numeros hasta que se teclee uno negativo, y mostrar
        cuantos numeros se han introduccido.
        */
        
        //Atributos
        int numero,contador=0;
        
        //libreria para pedir informacion por teclado
        Scanner entrada=new Scanner(System.in);
        
        //Logica
        while(true){
            System.out.print("Ingresa un numero: ");
            numero=entrada.nextInt();
            
            if (numero>=0){
                contador +=1;
                
            }
            else{
                System.out.println("Cantidad de numeros positivos digitados es: "+contador);
                break;
            }
        }
        
        
    }
    
}
