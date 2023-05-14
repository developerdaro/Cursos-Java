package ejercicios;

import javax.swing.JOptionPane;

public class PorcentajeCompras {

    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        En un MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere
        los $300 ¿Cual sera la cantidad que pagara una persona por su compra?
        */
        
        //Atributos
        String nombre;
        double pagar;
        double compras;
        
        //Pedir datos
        nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        compras=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de las compras"));
        
        //Operaciones
        if (compras > 300){
            pagar=compras-(compras*0.20);
            JOptionPane.showMessageDialog(null,"Compro mas de $300, tiene descuento del 20%"+compras*0.20+" . Total a pagar "+pagar);
        }else{
            JOptionPane.showMessageDialog(null,"No compro mas de $300, no tiene descuento. Total a pagar "+compras);
        }
    }
    
}
