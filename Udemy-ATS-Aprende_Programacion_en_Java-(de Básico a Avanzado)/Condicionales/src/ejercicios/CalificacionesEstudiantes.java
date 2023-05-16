package ejercicios;

import javax.swing.JOptionPane;


public class CalificacionesEstudiantes {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        PEdir una nota de 0 a 10 y mostrarla de la forma:
        insuficiente, suficiente, bien, notable y sobresaliente
        */
        
        
        //Atributos
        int nota;
        
        //Pedir nota
        nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota"));
        
        //Operaciones
        switch(nota){
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null, "Insuficiente");
                break;
            case 3:
            case 4:
                JOptionPane.showMessageDialog(null, "suficiente");
                break;
            case 5:
            case 6:
                JOptionPane.showMessageDialog(null, "bien");
                break;
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null, "notable");
                break;
            case 9:
            case 20:
                JOptionPane.showMessageDialog(null, "sobresaliente");
                break;
        }
        
        
        
    }
    
}
