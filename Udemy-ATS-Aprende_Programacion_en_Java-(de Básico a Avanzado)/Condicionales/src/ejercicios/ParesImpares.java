package ejercicios;

import javax.swing.JOptionPane;

public class ParesImpares {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Hacer un programa que tome dos numeros y diga si ambos son pares
        o impares.        
        */
        
        //Atributos
        int numero1,numero2;
        
        //Pedir datos
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        //Operaciones   
        if (numero1%2==0 && numero2%2==0){
            JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
        }
        if (numero1%2!=0 && numero2%2!=0){
            JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
        }
        
        
    }

    
}
