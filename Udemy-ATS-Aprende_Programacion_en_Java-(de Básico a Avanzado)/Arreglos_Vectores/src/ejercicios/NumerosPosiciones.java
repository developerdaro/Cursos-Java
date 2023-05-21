package ejercicios;

import java.util.Scanner;

public class NumerosPosiciones {

    public static void main(String[] args) {
        
        /*
        ENUNCIADOS
        
        Leer 10 numeros enteros, guardarlos en un arreglo. Debemos mostrarlos en
        el siguiente orden: el primero, el ultimo, el segundo, el penultimo, el tercero, etc.
        */
        
        //Atributos
        int numero;

        //Ingresar informacion por consola
        Scanner entrada = new Scanner(System.in);

        //Array
        int numeros[] = new int[10];

        //Ingresar datos en el array
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("Ingresa un numero");
            numeros[i] = entrada.nextInt();
        }
        
        int longitud=(numeros.length)/2; //Dividido dos por que no quiero que recorra 10 veces por cada for
        int control;
        
        for (int i=0; i<longitud;i++){
            System.out.println(numeros[i]);
            
            control=(numeros.length)-i; // me hace 5 recorridos el for interno y externo
            for (int x=0; control>x;control-- ){
                System.out.println(numeros[control-1]);
                break;
            }
            
            
         
            
            
           
            
            
        }
        
    }
    
}
