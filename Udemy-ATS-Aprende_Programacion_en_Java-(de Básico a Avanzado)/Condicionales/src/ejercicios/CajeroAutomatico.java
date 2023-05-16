package ejercicios;

import java.util.Scanner;


public class CajeroAutomatico {
    
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Hacer un programa que simule un cajero automatico con un saldo inicial
        de 1000 Dolares, con el siguiente menu de opciones:
        1.Ingresar dinero a la cuenta
        2.Retirar dinero de la cuenta
        3.Salir
        */
        
        
        //Atributos
        double saldo=1000;
        
        String opcion;
        
        //Pedir informacion
        Scanner entrada = new Scanner(System.in);
        Scanner salida = new Scanner(System.in);
        System.out.println("--------MENU--------");
        System.out.println("1. Ingresar dinero a la cuenta");
        System.out.println("2. Retirar dinero a la cuenta");
        System.out.println("3. Salir");
        System.out.println("--------------------");
        System.out.print("-");
        opcion=entrada.next();
        
        //Operaciones
        switch(opcion){
            case "1":
                System.out.print("Ingrese el monto a ingresar: ");
                saldo=saldo+ entrada.nextInt();
                System.out.println("Valor actual: "+saldo);
                break;
            case "2":
                System.out.print("Ingrese el monto a retirar: ");
                double valor=salida.nextDouble();
                if(valor >saldo){
                    System.out.println("Fondos insuficientes");
                }else{
                    System.out.println("Valor actual: "+(saldo-valor));
                }
                
                break;
            case "3":
                System.out.println("Has cerrado sesion");
                break;
        }
        
    }
    
}
