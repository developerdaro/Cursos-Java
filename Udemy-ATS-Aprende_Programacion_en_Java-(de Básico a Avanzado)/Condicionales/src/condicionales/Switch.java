package condicionales;

import javax.swing.JOptionPane;


public class Switch {
    
    public static void main(String[] args) {
        
        /*
        
        Condicionales multiples
        Switch son casos
        */
        
        //Atributos
        int numero;
        
        
        //Pedir informacion
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
        
        //Casos
        switch(numero){
            
            //El numero que esta alado del case es el que compara con el introduccido por el usuario
            
            case 1:JOptionPane.showMessageDialog(null,"Caso o numero 1");
            break;
            
            case 2:JOptionPane.showMessageDialog(null,"Caso o numero 2");
            break;
            
            case 3:JOptionPane.showMessageDialog(null,"Caso o numero 3");
            break;
            
            case 4:JOptionPane.showMessageDialog(null,"Caso o numero 4");
            break;
            
            case 5:JOptionPane.showMessageDialog(null,"Caso o numero 5");
            break;
            
            default:JOptionPane.showMessageDialog(null,"Caso o numero no encontrado");
        }
        
        
        
    }
    
}
