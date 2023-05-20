package ejercicios;

import javax.swing.JOptionPane;

public class TablaMultiplicar {

    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Pide un numero (que debe estar entre 0 y 10) y
        mostrar la tabla de multiplicar de dicho numer.
        */
        
        
        //Atributos
        int numero,resultado;
        
        //Pedir informacion
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        
        //Operaciones
        for (int i = 1; i <= 10; i++) {
            resultado=numero*i;
            JOptionPane.showMessageDialog(null,numero+"*"+i+"= "+resultado);
        }
        
    }
    
}
