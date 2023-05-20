package ejercicios;

import java.util.Scanner;


public class MediaNumerosPositivoNegativoCeros {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Pedir 10 numeros.
        Mostrar la media de los numeros positivos, la media de los numeros negativos
        y la cantidad de ceros.
        */
        
        //Atributos
        int numero,contador=0,mediaPositivos=0,mediaNegativos=0,positivo=0,negativo=0,ceros=0;
        int contadorpositivo=0,contadornegativos=0;
        
        //Libreria para pedir numeros por consola
        Scanner entrada=new Scanner(System.in);
        
        //Proceso
        while (true) {            
            System.out.print("Ingrese el "+contador+ " numero: ");
            numero=entrada.nextInt();
            
            if (numero>0){
                positivo=positivo+numero;
                contadorpositivo+=1;
                mediaPositivos=positivo/contadorpositivo;
            }
            if (numero<0){
                negativo=negativo+numero;
                contadornegativos+=1;
                mediaNegativos=negativo/contadornegativos;
                
            }
            if (numero==0){
                ceros+=1;
                
            }
            contador++;
            if (contador ==10){
                break;
            }
            
        }
            System.out.println("La suma es "+positivo+" y la media es "+mediaPositivos);
            System.out.println("La suma es "+negativo+" y la media es "+mediaNegativos);
            System.out.println("# Ceros: "+ceros);

        
    }
    
}
