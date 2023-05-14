package ejercicios;

import javax.swing.JOptionPane;


public class CalcularDolaresPersonas {

    public static void main(String[] args) {
        /*
        ENUNCIADO
        Guillermo tiene B dolares. Luis tiene la mitad de lo que posee Guillermo.
        Juan tiene la mitad de lo que posee Luis y Guillermo juntos. Hacer un programa
        que calcule e imprima la cantidad de dinero que tienen entre los tres.        
        */
        
        //Atributos
        String nombre1="Guillermo";
        String nombre2="Luis";
        String nombre3="Juan";
        double dolaresGuillermo;
        double dolaresLuis;
        double dolaresJuan;
        
        //Pedir datos al usuario
        dolaresGuillermo=Double.parseDouble(JOptionPane.showInputDialog("Cuantos dolares tiene "+nombre1));
        
        //Operaciones
        dolaresLuis=dolaresGuillermo/2;
        dolaresJuan=(dolaresLuis+dolaresGuillermo)/2;
        
        //Mensaje resultado de dolares
        JOptionPane.showMessageDialog(null,"Guillermo tiene "+dolaresGuillermo);
        JOptionPane.showMessageDialog(null,"Luis tiene "+dolaresLuis);
        JOptionPane.showMessageDialog(null,"Juan tiene "+dolaresJuan);
        
    }
    
}
