package coche;

public class Persona_Sobrecarga_Metodos {

    //Atributos
    String nombre;
    int edad;
    String dni;

    //Constructor
    public Persona_Sobrecarga_Metodos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Sobre carga de constructores
    public Persona_Sobrecarga_Metodos(String dni) {
        this.dni = dni;
    }
  
    
    public void correr(){
        System.out.println("Soy " +nombre+ " Tengo "+edad+ " Años, y estoy corriendo una maraton");
    }
    
    //Sobre carga de metodo normal
   public void correr(int km){
       System.out.println("He corrido "+km+" kilometros");
   }

}
