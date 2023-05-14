package ejercicios;

import javax.swing.JOptionPane;

public class CaracterMayusculaMinuscula {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Programa que lea un caracter por teclado y compruebe si es
        una letra masyucula
        */
        
        //Atributos
        String caracter;
        String mayuscula;
        //Pedir datos
        caracter=JOptionPane.showInputDialog("Ingrese una letra");
        
        //Condicion
        if (caracter.equals(caracter.toUpperCase())){
            JOptionPane.showMessageDialog(null, "La letra esta en mayuscula");
        }else{
            JOptionPane.showMessageDialog(null, "La letra esta en minuscula");
        }
         
    }
    
}
