package ejercicios;

import javax.swing.JOptionPane;


public class ConversionKgAotra {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Hacer un programa que pase de Kg a otra unidad de medida de masa,
        mostrar en pantalla un menu con las opciones posibles.
        */
        
        
        //Atributos
        double kg,miligramos;
        
        //Recibimos informacion
        kg=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valo en Kilogramo"));
        
        
        //Operacion
        miligramos=kg*(1000000/1);
        
        //Solucion
        JOptionPane.showMessageDialog(null, "La conversion a miligramos seria : "+miligramos);
        
    }
    
}
