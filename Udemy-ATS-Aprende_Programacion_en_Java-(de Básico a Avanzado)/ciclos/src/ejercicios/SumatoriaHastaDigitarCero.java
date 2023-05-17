package ejercicios;

import java.util.Scanner;


public class SumatoriaHastaDigitarCero {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los
        numeros introducidos.
        */
        
        //Atributo
        int numero,acumulador=0;
        
        //Libreria para pedir datos
        Scanner entrada=new Scanner(System.in);
        
        while(true){
            
            System.out.print("Digita un numero: ");
            numero=entrada.nextInt();
            
            if(numero != 0){
                acumulador =acumulador+numero;
            }else{
                System.out.println("La sumatoria de los numeros fueron: "+acumulador);
                break;
            }
            
            
        }
        
        
    }
    
}
