package ejercicios;

import java.util.Scanner;


public class CalcularMedia {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        Pedir numeros hasta que se introduzca uno negativo, y 
        calcular la media.
        */
        
        //Atributos
        int numero,media,sumatoria=0,contador=0;
        
        //Libreria para pedir informacion por teclado
        Scanner entrada=new Scanner(System.in);
        
        //Operaciones
        while(true){
            
            System.out.print("Ingresa un numero: ");
            numero=entrada.nextInt();
            
            if (numero>=0){
                sumatoria=sumatoria+numero;
                contador +=1;
            }else{
                media=sumatoria/contador;
                System.out.println("La media es: "+media);
                break;
            }
        }
        
    }
    
}
