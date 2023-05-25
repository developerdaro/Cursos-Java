package coche;

public class Persona_Constructor {

    //Atributos
    String nombre;
    int edad;

    //Metodos
    //Contructor 1 forma
    //    public Persona_Constructor(String _nombre, int _edad){
    //        nombre=_nombre;
    //        edad=_edad;
    //    }
    //Contructor 2 forma
    public Persona_Constructor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

}
