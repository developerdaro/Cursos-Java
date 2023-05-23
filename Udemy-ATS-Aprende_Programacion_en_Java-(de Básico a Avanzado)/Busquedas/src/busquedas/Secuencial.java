package busquedas;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Secuencial {


    public static void main(String[] args) {

        /*
        Secuencial
        
        Buscar posicion por posicion
        
        */
        
        Scanner entrada=new Scanner(System.in);
        
        int arreglo[], numeroElementos,dato;
        boolean bandera=false;
        
        numeroElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones"));
        dato=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar"));
        
        arreglo=new int [numeroElementos];
        
        for (int i = 0;i<numeroElementos; i++) {
            System.out.print((i+1)+"- Ingrese un numero");
            arreglo[i]=entrada.nextInt();
        }
        
        //Busqueda secuencial
        int i=0;
        while (i<numeroElementos && bandera==false) {            
            if (arreglo[i]==dato){
                bandera=true;
            }
            i++;
        }
        
        if (bandera==false){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el numero en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, "Dato encontrado en el arreglo: "+arreglo[i-1]);
        }
        
        

    }
    
}
