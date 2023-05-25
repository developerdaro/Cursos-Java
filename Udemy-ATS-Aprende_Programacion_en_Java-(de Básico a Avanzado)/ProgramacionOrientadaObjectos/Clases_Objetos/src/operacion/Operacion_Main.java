
package coche;

import javax.swing.JOptionPane;


public class Operacion_Main {
    
    public static void main(String[] args) {
        
        //Creamos un objeto de la clase Operacion_Sin_Parametros
        Operacion_Sin_Parametros op=new Operacion_Sin_Parametros();
        
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
        
        //Creamos un objeto de la clase Operacion_Con_Parametros
        Operacion_Con_Parametros opcon=new Operacion_Con_Parametros();
        
        //Solicitamos numeros n1, n2
        int numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        opcon.sumar(numero1,numero2);
        opcon.restar(numero1,numero2);
        opcon.multiplicar(numero1,numero2);
        opcon.dividir(numero1,numero2);
        opcon.mostrarResultados();
        
        
        //Creamos un objeto de la clase Operacion_Con_Retorno
        Operacion_Con_Retorno opconreturn=new Operacion_Con_Retorno();
        
        //Solicitamos numeros n1, n2
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        int sumar=opconreturn.sumar(n1,n2);
        int restar=opconreturn.restar(n1,n2);
        int multiplicar=opconreturn.multiplicar(n1,n2);
        int dividir=opconreturn.dividir(n1,n2);
        opconreturn.mostrarResultados(sumar,restar,multiplicar,dividir);
        
        
         
        
        
    }
    
}
