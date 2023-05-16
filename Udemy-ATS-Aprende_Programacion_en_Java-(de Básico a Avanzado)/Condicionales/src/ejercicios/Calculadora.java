package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Calculadora {
    
    
    public static void main(String[] args) {
        
        /*
        ANUNCIADO
        Construir un programa que simule el funcionamiento de una calculadora que 
        puede reaizar las cuatro operaciones aritmeticas basicas( suma, resta, multiplicacion y division),
        con valores numericos enteros. El usuario debe especificar la operacion con el primer caracter del primer parametro de la linea de
        comandos: 
        S o s para la suma, R o r para la resta, , M o m para el producto, D o d para la division.
        */
        
        
        //Atributos
        int numero1, numero2;
        double resultado;
        String respuesta;
        
        //Pedir datos por consola
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        numero1= entrada.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        numero2= entrada.nextInt();
        
        System.out.print("Ingrese el comando para efectuar una operacion aritmetica: ");
        respuesta= entrada.next();
        
        //Operaciones
        
        switch (respuesta){
            case "s":
                    resultado=numero1+numero2;
                    System.out.println("Suma = " + resultado);
                    break;
            case "S":
                    resultado=numero1+numero2;
                    System.out.println("Suma = " + resultado);
                    break;
           case "r":
                    resultado=numero1-numero2;
                    System.out.println("Resta = " + resultado);
                    break;
            case "R":
                    resultado=numero1-numero2;
                    System.out.println("Resta = " + resultado);
                    break;
            case "m":
                    resultado=numero1*numero2;
                    System.out.println("Multiplicacion = " + resultado);
                    break;
            case "M":
                    resultado=numero1*numero2;
                    System.out.println("Multiplicacion = " + resultado);
                    break;
            case "d":
                    resultado=numero1/numero2;
                    System.out.println("Division = " + resultado);
                    break;
            case "D":
                    resultado=numero1/numero2;
                    System.out.println("Division = " + resultado);
                    break;
        }
                
        
 
       
        
    }
    
    
}
