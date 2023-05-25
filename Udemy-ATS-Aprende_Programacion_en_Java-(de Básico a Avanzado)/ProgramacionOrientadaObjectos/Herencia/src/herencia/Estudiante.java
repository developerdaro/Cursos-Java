package herencia;

public class Estudiante extends Persona {

    private int codigoEstudiante;
    private float notaFinal;

    //Constructor
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad); // ya estan inicializados en la clase persona
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        System.out.println("Codigo Estudiante: "+codigoEstudiante);
        System.out.println("Nota final: "+notaFinal);
        
        
        
    }

}
