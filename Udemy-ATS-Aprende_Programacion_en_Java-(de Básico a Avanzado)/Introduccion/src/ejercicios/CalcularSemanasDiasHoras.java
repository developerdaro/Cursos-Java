package ejercicios;

import javax.swing.JOptionPane;

public class CalcularSemanasDiasHoras {

    public static void main(String[] args) {

        /*
    ENUNCIADO
    
    Construir un programa que, dado un numero total de horas, devuelve el numero de 
    semanas, dias y horas equivalentes. Por ejemplo dado un total de 1000 horas debe
    mostrar 5 semanas, 6 dias y 16 horas.    
         */
        //Atributos
        int horas;
        int dia = 24;
        int semana;
        int resultadosemanas;
        int resultadodias;
        //Pedir informacion
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de horas"));

        semana = dia * 7;

        resultadosemanas = horas / semana;
        int redondeeado=Math.round(resultadosemanas);
        double diascalculados = (horas -(redondeeado*semana))/24;
        int redondeo = (int) Math.ceil(diascalculados);
        int horasacumulados = horas%24;
        JOptionPane.showMessageDialog(null, "semanas [" + resultadosemanas + "] - dias [" + redondeo + "] - horas [" + horasacumulados + "]");

      
    }

}
