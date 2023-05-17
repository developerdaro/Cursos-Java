package ejercicios;

import java.util.Scanner;

public class CuadradoNumeroHastaNegativo {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca
        un numero negativo.
        */
        
        //Atributos
        int numero,cuadrado;
        
        Scanner entrada=new Scanner(System.in);
      
        
        //Logica
        while(true){
            System.out.print("Ingrese un numero: ");
            numero=entrada.nextInt();
            if (numero>=0){
                cuadrado=numero*numero;
                System.out.println("El cuadrado de "+numero+" es: "+cuadrado);
            }else{
                System.out.println("Numero negativo, adios");
                break;
            }
        }
            
        
        
    }
    
}
