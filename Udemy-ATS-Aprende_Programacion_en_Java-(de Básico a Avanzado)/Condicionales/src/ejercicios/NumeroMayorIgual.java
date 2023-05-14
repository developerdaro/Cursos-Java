package ejercicios;

import javax.swing.JOptionPane;

public class NumeroMayorIgual {
    
    public static void main(String[] args) {
        
        
        /*
        ENUNCIADO
        
        Pedir dos numeros y decir cual es el mayor o si son iguales
        */
        
        //Atributos
        int numero1,numero2;
        String mensaje;
        
        //Pedimos informacion
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        //Condicion
        if (numero1 > numero2){
            JOptionPane.showMessageDialog(null,"El numero "+numero1+ " es mayor");
        }
        if (numero2 > numero1){
            JOptionPane.showMessageDialog(null,"El numero "+numero2+ " es mayor");
        }
        if (numero1 == numero2){
            JOptionPane.showMessageDialog(null,"El numero "+numero1+ " es igual al numero "+numero2);
        }
        
        
        
    }
    
}
