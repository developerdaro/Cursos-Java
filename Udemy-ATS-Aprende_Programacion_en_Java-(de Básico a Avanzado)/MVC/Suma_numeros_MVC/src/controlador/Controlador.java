package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener{
    
    //Puente entre la vista y el modelo
    
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.btnSumar.addActionListener(this);
    }
    
    //Iniciar aplicacion
    public void iniciar(){
        vista.setTitle("MVC Sumar");
        vista.setLocationRelativeTo(null);
    }

    //Funcion del boton
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumero1(Integer.parseInt(vista.txtNumero1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.txtNumero2.getText()));
        modelo.resultadoSuma();
        
        //Muestro resultado a la vista
        vista.txtResultado.setText(String.valueOf(modelo.getResultado()));
    }
    
    
    
    
}
