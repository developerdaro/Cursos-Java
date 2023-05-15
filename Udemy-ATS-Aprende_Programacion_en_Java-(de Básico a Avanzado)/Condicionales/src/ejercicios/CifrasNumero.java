package ejercicios;

import javax.swing.JOptionPane;

public class CifrasNumero {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        pedir un numero entre 0 y 99.999 y decir cuantas cifras tiene
        */
        
        //Atributos
        String numero;
        
        //Solicitar informacion
        numero=JOptionPane.showInputDialog("Ingrese un numero");
        
        //Operacio
        String longitud=Integer.toString(numero.length());
        JOptionPane.showMessageDialog(null, "El numero "+numero+" tiene "+longitud+ " cifras");
        System.out.println("El numero "+numero+" tiene "+longitud+ " cifras");
        
    }
}
