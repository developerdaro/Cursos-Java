package ejercicios;

import javax.swing.JOptionPane;

public class SalarioObrero {

    public static void main(String[] args) {
        
        /* 
        ENUNCIADO
        
        Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
        -si trabaja 40 horas o menos se le paga $16 por hota
        -si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra
        */
        
        //Atributos
        int horas;
        double salario;
        int primerashoras;
        
        //pedir datos
        horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
        
        //Operaciones
        if (horas <= 40){
            salario=horas*16;
            JOptionPane.showMessageDialog(null,"Trabajo menos de 40 horas, total a pagar "+salario);
        }else{
            primerashoras=(horas)-40;
            salario=(40*16)+(primerashoras*20);
            JOptionPane.showMessageDialog(null, "Trabajo mas de cuarenta horas, total a pagar "+salario);
        }
        
    }
    
}
