package ejercicios;

import javax.swing.JOptionPane;

public class DiaMesAnoConMesesVariados {

    public static void main(String[] args) {

        /*
        ANUNCIADO
        
        Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta.
        Con meses de 28, 39 y 31 dias. Sin años bisiestos.
         */
        
        
        
        //Atributos
        int dia, mes, ano;

        //Pedir datos
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes en numeros"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));

        //Operaciones
        switch (mes) {
            case 1:
                
                if (dia >0 && dia <=31){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes enero -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de enero tiene hasta 31 dias");
                }
                break;
            case 2:
                if (dia >0 && dia <=28){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes febrero -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de febrero tiene hasta 28 dias");
                }
                break;
            case 3:
                if (dia >0 && dia <=31){
                   JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes marzo -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de marzo tiene hasta 31 dias");
                }
                break;
            case 4:
                if (dia >0 && dia <=30){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes abril -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de abril tiene hasta 30 dias");
                }
                break;
            case 5:
                if (dia >0 && dia <=31){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes mayo -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de mayo tiene hasta 31 dias");
                }
                break;
            case 6:
                if (dia >0 && dia <=30){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes junio -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de junio tiene hasta 30 dias");
                }
                break;
            case 7:
                if (dia >0 && dia <=31){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes julio -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de julio tiene hasta 31 dias");
                }
                break;
            case 8:
                if (dia >0 && dia <=31){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes agosto -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de agosto tiene hasta 31 dias");
                }
                break;
            case 9:
                if (dia >0 && dia <=30){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes septiembre -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de septiembre tiene hasta 30 dias");
                }
                break;
            case 10:
                if (dia >0 && dia <=31){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes octubre -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de octubre tiene hasta 31 dias");
                }
                break;
            case 11:
                if (dia >0 && dia <=30){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes noviembre -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de noviembre tiene hasta 30 dias");
                }
                break;
            case 12:
                if (dia >0 && dia <=31){
                    JOptionPane.showMessageDialog(null, "Dia "+dia+" - mes diciembre -año "+ano);
                }else{
                    JOptionPane.showMessageDialog(null, "Error - El mes de diciembre tiene hasta 31 dias");
                }
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Error - Mes no encontrado");
                break;
            

        }

    }

}
