
package ejercicios;

import javax.swing.JOptionPane;

public class CalificacionParcialesPorcentajes {
    
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        La calificacion final de un estudiante de informatica se calcula
        con base a las calificaciones de cuatro aspectos de su rendimiento
        academico: participacion, primer examen parcial, segundo examen parcial
        y examen final. sabiendo que las calificaciones anteriores entran
        a la calificacion final con ponderaciones del 10%, 25%, 25% y 40%, hacer
        un programa que calcule e imprima la calificacion final obtenida por un 
        estudiante.        
        */
        
        
        //Atributos
        String estudiante;
        double participacion;
        double primerParcial;
        double segundoParcial;
        double parcialFinal;
        double calificacion;
        
        //Solicitar informacion
        estudiante=JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
        participacion=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion de participacion"));
        primerParcial=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion de primer parcial"));
        segundoParcial=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion de segundo parcial"));
        parcialFinal=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del parcial final"));
        
        //Operaciones
        calificacion=((participacion*0.10)+(primerParcial*0.25)+(segundoParcial*0.25)+(parcialFinal*0.40));
        
        //Calificacion final
        JOptionPane.showMessageDialog(null,"La calificacion final es de "+calificacion);
        
        
        
    }
    
    
}
