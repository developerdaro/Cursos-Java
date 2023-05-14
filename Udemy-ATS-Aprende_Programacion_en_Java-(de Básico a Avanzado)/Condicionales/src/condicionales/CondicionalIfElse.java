package condicionales;

import javax.swing.JOptionPane;

public class CondicionalIfElse {

    public static void main(String[] args) {

        /*
        Signos de comparacion
        
        == : igual
        != : diferente
        > : Mayor
        >= : Mayor o igual
        <  : Menor
        <= : Menor o igual
        
        */
        
        //Ejemplos
        int numero;
        
        //Solicitud de datos
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        //Condicionales
        if (numero != 5){
            JOptionPane.showMessageDialog(null,"El numero"+numero+" es diferente");
        }else{
            JOptionPane.showMessageDialog(null,"Los numero son iguales");
        }
        
    }
    
}
