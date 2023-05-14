package ejercicios;

import javax.swing.JOptionPane;

public class SalarioMensualVendedorCarros {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Una compañia de venta de carros usados, paga a su personal de ventas un
        salario de $1000 mensuales, mas una comision de $150 por cada carro vendido,
        mas el 5% del valor de la venta por carro. Cada mes el capturista de la 
        empresa ingresa en la computadora los datos pertinentes. Hacer un programa 
        que calcule e imprima el salario mensual de un vendedor dado.
        */
        
        //Atributos
        String trabajador;
        double salario;
        int carroVendido;
        double valorcarro;
        
        //Pedir datos
        trabajador=JOptionPane.showInputDialog("Ingrese el nombre del trabajador");
        carroVendido=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de carros vendidos"));
        valorcarro=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del carro"));
                
        //Operaciones
        salario=(150*carroVendido)+(0.05*(valorcarro*carroVendido))+1000;
        
        //Salario mensual
        JOptionPane.showMessageDialog(null,"El salario mensual es de "+salario);
        
        
        
    }
    
}
