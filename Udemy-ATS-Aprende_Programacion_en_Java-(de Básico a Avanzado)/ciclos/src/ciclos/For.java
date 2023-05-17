package ciclos;

import java.util.Scanner;

public class For {
    
    public static void main(String[] args) {
        
        /* 
        FOR
        
        
        for (inicializacion; condicion;aumento o decremento){
            instrucciones;
        }
        */
        
        
        //Pedir al usuario cuantos numeros quiere imprimir
        
        //Atributos
        int numero;
        
        //pedir informacion
        Scanner entrada=new Scanner(System.in);
        System.out.print("cuantos numeros quiere imprimir: ");
        numero=entrada.nextInt();
        
        
        for (int i=1; i<=numero;i++){
            System.out.println(i);
        }
        
        
        
        
    }
    
}
