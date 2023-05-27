package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;
import vista.*;
import modelo.*;

public class ControladorPersona implements ActionListener {

    private FormularioPersona vista;
    private Persona persona;
    private ConsultasPersona modelo;

    public ControladorPersona(FormularioPersona vista, Persona persona, ConsultasPersona modelo) {
        this.vista = vista;
        this.persona = persona;
        this.modelo = modelo;

        vista.btninsertar.addActionListener(this);
        vista.btnlimpiar.addActionListener(this);
        vista.btnbuscar.addActionListener(this);
        vista.btnactualizar.addActionListener(this);
        vista.btneliminar.addActionListener(this);
    }

    public void iniciar() {
        vista.setTitle("CRUD MVC");
        vista.setLocationRelativeTo(null);
        vista.txtId.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Detectar si la accion es desde el botono insertar
        if (e.getSource() == vista.btninsertar) {
            persona.setClave(vista.txtClave.getText());
            persona.setNombre(vista.txtNombre.getText());
            persona.setDomicilio(vista.txtDomicilio.getText());
            persona.setCelular(vista.txtCelular.getText());
            persona.setCorreo_electronico(vista.txtCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.txtFecha.getText()));
            persona.setGenero(vista.cmbxGenero.getSelectedItem().toString());

            if (modelo.insertar(persona)) {
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                this.limpiarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al instertar registro");
                this.limpiarCajas();
            }
        }

        if (e.getSource() == vista.btnlimpiar) {
            this.limpiarCajas();
        }

        if (e.getSource() == vista.btnbuscar) {
            persona.setClave(vista.txtBuscar.getText());

            if (modelo.buscar(persona)) {
                vista.txtId.setText(String.valueOf(persona.getIdPersona()));
                vista.txtClave.setText(String.valueOf(persona.getClave()));
                vista.txtNombre.setText(String.valueOf(persona.getNombre()));
                vista.txtDomicilio.setText(String.valueOf(persona.getDomicilio()));
                vista.txtCelular.setText(String.valueOf(persona.getCelular()));
                vista.txtCorreo.setText(String.valueOf(persona.getCorreo_electronico()));
                vista.txtFecha.setText(String.valueOf(persona.getFecha_nacimiento()));
                vista.cmbxGenero.setSelectedItem(persona.getGenero());

            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
                this.limpiarCajas();
            }
        }

        if (e.getSource() == vista.btnactualizar) {
            persona.setIdPersona(Integer.parseInt(vista.txtId.getText()));
            persona.setClave(vista.txtClave.getText());
            persona.setNombre(vista.txtNombre.getText());
            persona.setDomicilio(vista.txtDomicilio.getText());
            persona.setCelular(vista.txtCelular.getText());
            persona.setCorreo_electronico(vista.txtCorreo.getText());
            persona.setFecha_nacimiento(Date.valueOf(vista.txtFecha.getText()));
            persona.setGenero(vista.cmbxGenero.getSelectedItem().toString());
            
            if(modelo.editar(persona)){
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                this.limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar el registro");
                this.limpiarCajas();
            }
            
            

        }
        
        if (e.getSource()==vista.btneliminar){
            persona.setIdPersona(Integer.parseInt(vista.txtId.getText()));
            
            if(modelo.eliminar(persona)){
                JOptionPane.showMessageDialog(null, "Registro elimiado correctamente");
                this.limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                this.limpiarCajas();
            }
        }

    }

    public void limpiarCajas() {
        vista.txtId.setText(null);
        vista.txtBuscar.setText(null);
        vista.txtCelular.setText(null);
        vista.txtClave.setText(null);
        vista.txtCorreo.setText(null);
        vista.txtDomicilio.setText(null);
        vista.txtNombre.setText(null);
        vista.txtFecha.setText(null);
        vista.cmbxGenero.setSelectedIndex(0);

    }

}
