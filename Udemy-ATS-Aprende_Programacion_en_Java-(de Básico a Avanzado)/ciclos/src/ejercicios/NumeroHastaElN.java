package ejercicios;

import java.util.Scanner;


public class NumeroHastaElN {
    
    public static void main(String[] args) {
        
        
        /*
        ENUNCIADO
        
        Pedir un numero N, y mostrar  todos los numeros del 1 al N.
        */
        
        //Atributos
        int n;
        
        //Pedir datos
        Scanner entrada=new Scanner(System.in);
        System.out.print("Ingresa el valor a N: ");
        n=entrada.nextInt();
        
        for (int i=1; i<=n;i++) {
            System.out.println(i);
        }
        
    }
    
}
