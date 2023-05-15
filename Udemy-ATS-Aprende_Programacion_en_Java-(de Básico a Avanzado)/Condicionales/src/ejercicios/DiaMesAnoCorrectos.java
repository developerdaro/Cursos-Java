package ejercicios;

import javax.swing.JOptionPane;

public class DiaMesAnoCorrectos {
    
    public static void main(String[] args) {
        
        /* 
        ENUNCIADO
        
        Pedir el dia, mes y año de una fecha e indicar  si la fecha es correcta.
        Suponiendo que todos los meses son de 30 dias     
        */
        
        
        //Atributos
        int dia,mes,ano;
        
        //Solicitar datos
        dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el DIA"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el MES"));
        ano=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el AÑO"));
        
        //Operaciones
        if(dia >0 && dia <=30){
            if(mes >0 && mes <=12){
                JOptionPane.showMessageDialog(null,"La fecha ingresada es correcta");
                JOptionPane.showMessageDialog(null,"dia: "+dia+" -mes: "+mes+ " - año: "+ano);
            }
        }else{
            JOptionPane.showMessageDialog(null,"La fecha ingresada es incorrecta");
        }
        
    }
    
}
