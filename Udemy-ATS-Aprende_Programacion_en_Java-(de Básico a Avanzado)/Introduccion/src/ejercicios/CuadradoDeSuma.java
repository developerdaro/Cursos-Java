package ejercicios;

import javax.swing.JOptionPane;

public class CuadradoDeSuma {
   
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Hacer un programa que calcule el cuadrado de una suma
        */
        
        //Atributos
        int numero1;
        int numero2;
        double cuadradonum1;
        double cuadradonum2;
        double respuesta;
        
        
        //Solicitar informacion
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del primer numero"));
        
        //Operaciones
        cuadradonum1=Math.pow(numero1, 2);
        cuadradonum2=Math.pow(numero2, 2);
        respuesta=((cuadradonum1)+(cuadradonum2)+(2*numero1*numero2));
        
        //Respuesta
        JOptionPane.showMessageDialog(null,"El valor de la operacion es "+respuesta);
        
        
    }
    
}
