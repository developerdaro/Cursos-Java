package crud_mvc_mysql;

import controlador.ControladorPersona;
import modelo.ConsultasPersona;
import modelo.Persona;
import vista.FormularioPersona;

public class CRUD_MVC_MySQL {

    
    public static void main(String[] args) {
        
        FormularioPersona vista=new FormularioPersona();
        Persona persona=new Persona();
        ConsultasPersona modelo=new ConsultasPersona();
        ControladorPersona controlador=new ControladorPersona(vista, persona, modelo);
        
        controlador.iniciar();
        vista.setVisible(true);
        
    }
    
}
