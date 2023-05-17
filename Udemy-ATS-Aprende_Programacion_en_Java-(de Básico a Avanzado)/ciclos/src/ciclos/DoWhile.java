package ciclos;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        
        /*               
        DO WHILE
        Primero se ejecuta el codigo y luego se verifica la condicion.
        
        do{
            instrucciones;
        }while(condicion);
        
        */
        
        //----------------------------------------------------------------------------------//
        //Pedir cuantos numeros quiere el usuario imprimir
        
        //Atributos
        int numero,contador=1;
        
        //Pedimimos datos
        Scanner entrada=new Scanner(System.in);
        System.out.print("Cuantos numeros quieres imprimir");
        numero=entrada.nextInt();
        
        do {            
            System.out.println(contador);
            contador++;
        } while (contador<=numero);
        
    }
    
}
