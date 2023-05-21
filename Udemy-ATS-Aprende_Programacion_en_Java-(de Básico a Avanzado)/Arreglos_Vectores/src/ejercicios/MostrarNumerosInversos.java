package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MostrarNumerosInversos {

    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Leer 5 numeros, guardarlos en un arreglo y ,pstrarlos en el orden
        inverso al introducido.
        */
        
       //Parametros
        int numeros;
        
        //Pedir numeros
        Scanner entrada=new Scanner(System.in);
        
        //Array
        int numeroArray[]=new int[5];
        
        //Introducir datos arreglo
        for (int i=0; i<numeroArray.length;i++){
            System.out.println("Ingresa un numero");
            numeroArray[i]=entrada.nextInt();
           
        }
        
        int longitud=numeroArray.length;
        for (int i = 0; longitud >i; longitud--) {
            System.out.println(numeroArray[longitud-1]);
            
            
        }
        
        
        
        
    }
    
}
