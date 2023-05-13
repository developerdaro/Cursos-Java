package operadores;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Aritmeticos {
    
    
    public static void main(String[] args) {
        
        //declaraciones
        Scanner entrada=new Scanner(System.in);
        
        //Atributos
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        int residuo;
        
        //Pedimos datos al usuario por ventana emergente        
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2"));
                
        suma=numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        division=numero1/numero2;
        residuo=numero1%numero2;
        
        //resultados por ventana emergente
        JOptionPane.showMessageDialog(null,"El resultado de la suma es" +suma);
        JOptionPane.showMessageDialog(null,"El resultado de la resta es" +resta);
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es" +multiplicacion);
        JOptionPane.showMessageDialog(null,"El resultado de la division es" +division);
        JOptionPane.showMessageDialog(null,"El resultado del residuo es" +residuo);
        
        //Pedimos datos al usuario por consola
        System.out.print("Ingresa el primer numero: ");
        numero1=entrada.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        numero2=entrada.nextInt();
        
        suma=numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        division=numero1/numero2;
        residuo=numero1%numero2;
        
        //mostramos resultados por consola
        System.out.println("La suma es: " +suma);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicacion es: " +multiplicacion);
        System.out.println("La division es: " +division);
        System.out.println("La residuo es: " +residuo);
        
        
        
        
    }
    
}
