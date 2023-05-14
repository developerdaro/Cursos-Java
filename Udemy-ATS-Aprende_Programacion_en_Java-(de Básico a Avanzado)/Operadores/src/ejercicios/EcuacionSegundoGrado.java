package ejercicios;

import javax.swing.JOptionPane;


public class EcuacionSegundoGrado {
    
    public static void main(String[] args) {
        
        /*
        Construir un programa que calcule y muestre por pantalla las 
        raices de la ecuacion de segundo grado de coeficientes reales.
        */
        
        
        //Atributos
        double a,b,c;
        
        //Pedimos informacion
        a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de A"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de B"));
        c=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de C"));
        
        //Formula cuadratica
        double x1=((-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
        double x2=((-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a));
        
        //Mostramos resultados
        JOptionPane.showMessageDialog(null,"Resultado x1 "+x1);
        JOptionPane.showMessageDialog(null,"Resultado x2 "+x2);
    }
}
