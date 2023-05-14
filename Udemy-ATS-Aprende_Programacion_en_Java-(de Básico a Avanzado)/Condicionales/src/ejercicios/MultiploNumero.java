package ejercicios;

import javax.swing.JOptionPane;


public class MultiploNumero {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Hacer un programa que lea un nuemro entero y muestre si el numero
        es multiplo de 10
        */
        
        //Atributos
        int numero;
        String resultado;
        
        //Pedir datos
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        //Condicion
        resultado=(numero%2 == 0 && numero%10==0) ? " Es multiplo" : " No es multiplo";
        
        //Resultado
        JOptionPane.showMessageDialog(null, "El numero "+numero+resultado);
        System.out.println("resultado = " + resultado);
        
        
        
    }
    
}
