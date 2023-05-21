package arreglos_vectores;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Llenar_Arreglos {
    
    public static void main(String[] args) {
        
       Scanner entrada=new Scanner(System.in);
       int elementos;
       
       elementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos"));
       
       char [] letras=new  char[elementos];
       
        System.out.println("Digita los elementos del arreglo");
        
        for (int i=0; i<elementos;i++){
            System.out.println((i+1)+" . Digita un caracter");
            letras[i]=entrada.next().charAt(0);
            
        }
        
        System.out.println("\nLos caracteres del arreglo son: ");
        for (int i=0;i<elementos;i++){
        System.out.println(letras[i]);
    }
        
    }
    
}
