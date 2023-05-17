package ejercicios;

import javax.swing.JOptionPane;


public class Factorial {
    
    public static void main(String[] args) {
        
        
        /*
        ENUNCIADO
        
        Pedir un numero y calcular su factorial
        */
        
        //Atributo
        int numero,factorial=1,acumulador=0;
        
        
        //Pedir informacion
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        //Logica
        for (int i=1;i<=numero;i++){
            factorial=factorial*i;

        }
         System.out.println("El factorial de "+numero+" es de "+factorial);

        
    }
    
}
