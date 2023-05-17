package ejercicios;

import java.util.Scanner;

public class IndicarParImparCeroSale {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Leer numeros hasta que se introduzca un 0. Para 
        cada uno indicar si es par o impar
        */
        
        //Atributos
        int numero;
        
        //Pedir informacion
        Scanner entrada=new Scanner(System.in);
     
        while (true) {            
            System.out.print("Ingresa un numero: ");
            numero=entrada.nextInt();
            
            if (numero%2==0){
                System.out.println("El numero es par");
            }
            if (numero%2!=0){
                System.out.println("El numero es impar");
            }
            if (numero ==0){
                System.out.println("Adios");
                break;
            }
            
        }
        
        
        
    }
}
