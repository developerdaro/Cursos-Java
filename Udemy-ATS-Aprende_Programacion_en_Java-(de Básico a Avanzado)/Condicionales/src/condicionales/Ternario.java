package condicionales;

import javax.swing.JOptionPane;


public class Ternario {
    
    public static void main(String[] args) {
        
        /*
        Ternario es una if de una sola linea, solo evalua una condicion
        
        Estructura:
        valor = (condicion) ? valor1 : valor2
        */
        
        //Atributos
        int numero;
        String mensaje;
        
        //Pedir datos
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        
        //Condicion
        mensaje=(numero%2==0)? " es par": " es impar";
        
        JOptionPane.showMessageDialog(null, "El numero "+numero+mensaje);
        System.out.println("El numero "+numero+" es " + mensaje);
        
        
    }
    
}
