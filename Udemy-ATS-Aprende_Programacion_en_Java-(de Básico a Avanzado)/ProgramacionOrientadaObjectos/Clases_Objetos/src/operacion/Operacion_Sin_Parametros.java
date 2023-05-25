package coche;

import javax.swing.JOptionPane;

public class Operacion_Sin_Parametros {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodos
    //Metodo para pedirle al usuario que digite dos numeros
    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    }

    //Metodo para sumar ambos numeros
    public void sumar() {
        suma = numero1 + numero2;
    }

    //Metodo para restar ambos numeros
    public void restar() {
        resta = numero1 - numero2;
    }

    //Metodo para multiplicar ambos numeros
    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    //Metodo para dividir ambos numeros
    public void dividir() {
        division = numero1 / numero2;
    }
    
    //Metodo para mostrar los resultados
    public void mostrarResultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }

}
