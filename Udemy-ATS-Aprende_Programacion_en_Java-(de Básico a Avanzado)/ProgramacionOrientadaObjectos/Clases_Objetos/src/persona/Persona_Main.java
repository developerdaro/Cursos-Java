package coche;


public class Persona_Main {
    
    public static void main(String[] args) {
        
        //llamamos a la clase e invocamos al metodo constructor el cual pide parametros para inicializar
        Persona_Constructor p1=new Persona_Constructor("DaromanX", 29);
        
        p1.mostrarDatos();
        
        Persona_Sobrecarga_Metodos psc1=new Persona_Sobrecarga_Metodos("DaromanX",29);
        Persona_Sobrecarga_Metodos psc2=new Persona_Sobrecarga_Metodos("1061768300");
        psc1.correr();
        psc2.correr(100);
        
        
        
    }
    
}
