
import java.util.Scanner;
import javax.swing.JOptionPane;

 
public class ejemplo {
    
    public static void main(String[] args) {
        
        
        int numeros[]=new int [5];
        
       //Entrada de datos
       int objetivo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero objetivo"));
       Scanner entrada=new Scanner(System.in);
       
       //Llenar arreglo
       for (int i=0; i<numeros.length;i++){
           System.out.println((i+1)+"- Ingresa un numero: ");
           numeros[i]=entrada.nextInt();
       }
       
       
       int temporal;
       
       for( int i=0; i<numeros.length;i++){
           temporal=numeros[i]+numeros[i+1];
           
           if ( objetivo== temporal){
               System.out.println("Encontrado: "+numeros[i+1]+ " - "+numeros[i]);
               break;
           }
       }
       
       //Recorrer array
       
        
    }
    
}
