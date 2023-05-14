package conceptosbasicos;

import java.util.Scanner;


public class DatosPorConsola {


    public static void main(String[] args) {
        
        //Scanner para lectura de datos por consola
        Scanner entrada= new Scanner (System.in);
        
        //Atributos
        String nombre;
        int edad;
        
        //Pedir datos por consola
        System.out.print("Ingresa tu nombre: ");
        nombre=entrada.nextLine(); //nextLine: line debido a que quiero que el nombre tenga espacios
        
        System.out.print("Ingresa tu edad: ");
        edad=entrada.nextInt(); //nextInt: int debido a que quiero voy agregar tipo numerico
        
        System.out.println("El usuario se llama "+nombre+" y tiene "+edad+" años.");
              
    }
    
}
