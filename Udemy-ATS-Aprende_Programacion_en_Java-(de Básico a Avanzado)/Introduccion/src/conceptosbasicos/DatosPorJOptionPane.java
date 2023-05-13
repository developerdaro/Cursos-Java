package conceptosbasicos;

import javax.swing.JOptionPane;


public class DatosPorJOptionPane {
    
    //atajo para crear el public static void main: psvm
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        char genero;
        double salario;
        
        //Pedir datos al usuario
        nombre=JOptionPane.showInputDialog("Digita tu nombre"); //Forma de llamar un string
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad")); //Parsear un int
        genero=JOptionPane.showInputDialog("Ingresa la letra de tu genero").charAt(0);//Parsear un char
        salario=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu salario")); //Parsear un double
        
        //Mostrar datos por ventana emergente
        JOptionPane.showMessageDialog(null,"Tu nombre es: "+nombre);
        JOptionPane.showMessageDialog(null,"Tu edad es "+ edad);
        JOptionPane.showMessageDialog(null,"Tu genero es "+ genero);
        JOptionPane.showMessageDialog(null,"Tu salario es :"+salario);
        
        //mostrar datos segun la informacion escrita Consola
        System.out.println("El usuario se llama "+nombre+" tienes "+edad+" años"+ ", tu genero es: "+genero+" y ganas $"+salario);

        
        
    }
    
}
