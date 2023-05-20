package ejercicios;

import java.util.Scanner;


public class SueldosDiezMayores {

    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Pedir 10 sueldos.
        Mostrar su suma y cuantos hay mayores de $1000.        
        */
        
        //Atributos
        double sueldos,suma = 0;
        int contador=0;
        //Scanner para pedir por teclado informacion}
        Scanner entrada=new Scanner(System.in);
        
        //Operaciones
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digita el "+i+" sueldo: ");
            sueldos=entrada.nextDouble();
            
            if(sueldos>1000){
                contador+=1;
                
            }
            suma=suma+sueldos;
        }
        System.out.println("la cantidad de sueldos superiores a mil es: "+contador);
        System.out.println("Suma total de los sueldos es: "+suma);


        
    }
    
}
