package ejercicios;

import javax.swing.JOptionPane;


public class SumaTotal {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Pedir 10 numeros y escribir la suma total.
        */
        
        //Atributos
        int numero,suma=0;
        
        
        //Operaciones
        for (int i=1; i<=10;i++){
            
            numero=Integer.parseInt(JOptionPane.showInputDialog(i+"-Ingresa  un numero "));
            suma=suma+numero;
        }
        JOptionPane.showMessageDialog(null, "La suma de los 10 numeros es: "+suma);
        
    }
    
}
