package areaPerimetroCuadrilatero;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        
        AreaPerimetroCuadrilatero c1;
        
        float lado1,lado2;
        
        lado1=Float.parseFloat(JOptionPane.showInputDialog("Digite lado 1: "));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Digite lado 2: "));
        
        
        //Es un cuadrado
        if ( lado1 == lado2){
            c1=new AreaPerimetroCuadrilatero(lado1);
        }
        else{
            c1=new AreaPerimetroCuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perimetros es: "+c1.getPerimetro());
        System.out.println("El Area es: "+c1.getArea());
        
    }
   
}
