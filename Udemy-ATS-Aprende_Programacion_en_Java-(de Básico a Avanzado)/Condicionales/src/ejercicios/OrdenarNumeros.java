package ejercicios;

import javax.swing.JOptionPane;

public class OrdenarNumeros {

    public static void main(String[] args) {

        /*
        ENUNCIADO
        
        Pedir tres numeros y mostrarlos ordenados de mayor a menor
         */
        //Atributos
        int numero1, numero2, numero3;

        //Pedir datos
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));

        //Operaciones
        if (numero1 > numero2 && numero1 > numero3) {
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + "es mayor");
            if (numero2 > numero3) {
                JOptionPane.showMessageDialog(null, "El numero " + numero2 + "es medio");
            }
            
                JOptionPane.showMessageDialog(null, "El numero " + numero3 + "es menor");
            
        }
        if (numero2 > numero1 && numero2 > numero3) {
            JOptionPane.showMessageDialog(null, "El numero " + numero2 + "es mayor");
            if (numero1 > numero3) {
                JOptionPane.showMessageDialog(null, "El numero " + numero1 + "es medio");
            }
                JOptionPane.showMessageDialog(null, "El numero " + numero3 + "es menor");
            
        }
        if (numero3 > numero2 && numero3 > numero1) {
            JOptionPane.showMessageDialog(null, "El numero " + numero3 + "es mayor");
            if (numero2 > numero1) {
                JOptionPane.showMessageDialog(null, "El numero " + numero2 + "es medio");
            }
                JOptionPane.showMessageDialog(null, "El numero " + numero1 + "es menor");
            

        }

        //fin, unico bug, si es igual no hay condicion
    }
}
