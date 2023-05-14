package ejercicios;

import javax.swing.JOptionPane;

public class Calificaciones {
    
    public static void main(String[] args) {
        
        /*
            ENUNCIADO
            Hacer un programa que calcule e imprima la suma de tres calificaciones.
        */
        
        //Atributos
        double nota1;
        double nota2;
        double nota3;
        double resultado;
        
        //Pedir datos
        nota1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la primer calificacion"));
        nota2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la segunda calificacion"));
        nota3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la tercera calificacion"));
        
        //Operacion
        resultado=(nota1+nota2+nota3)/3;
        
        //Mensaje de respuesta
        JOptionPane.showMessageDialog(null,"El calificacion final es "+ resultado);
                
        
        
    }
    
}
