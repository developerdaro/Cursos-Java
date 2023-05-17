package ciclos;

import java.util.Scanner;


public class While {

    public static void main(String[] args) {
        
        /*
        WHILE
        Mientras se cumpla una condicion se va a estar ejecutando un conjunto de acciones.
        
        while(condicion){
            instrucciones;
        }

        */
        
        
        //----------------------------------------------------------------------------------//
        //perdir al usuario cuantos numeros quiere imprimir
        
        //Atributos
        int numero,contador=1;
        
        //Pedir informacion
        Scanner entrada=new Scanner(System.in);
        System.out.print("Cuantos numeros quieres imprimir: ");
        numero=entrada.nextInt();
        
        //Logica
        while(contador <=numero){
            System.out.println(contador);
            contador ++;
        }
        
        
        
    }
    
}
