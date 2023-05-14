package ejercicios;

import javax.swing.JOptionPane;


public class SalarioSemanal {
    
    public static void main(String[] args) {
        
    /*
        ENUNCIADO
        Hacer un programa que calucle e imprima el salario semanal de un empleado
        a partir de sus horas semanales trabajadas y de su salario por hora
    */
    
    
    //Atributos
    String empleado;
    double horasTrabajadas;
    double ValorHora;
    double salario;
    
    
    //Pedir datos
    empleado=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
    horasTrabajadas=Double.parseDouble(JOptionPane.showInputDialog("Cuantas horas trabajo "+empleado));
    ValorHora=Double.parseDouble(JOptionPane.showInputDialog("A como la hora papu xD"));
    
    //Operaciones
    salario=ValorHora*horasTrabajadas;
    
    //Respuesta
    JOptionPane.showMessageDialog(null,"El salario semanal de "+empleado+" es de "+salario);
    
        
        
        
    }
    
    
    
}
