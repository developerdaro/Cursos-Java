package paquete1;

public class Clase2 {
    
    public static void main(String[] args) {
        Clase1 objeto1=new Clase1();
        objeto1.SetEdad(10);
        objeto1.setNombre("DaromanX");
        System.out.println("Tu nombre es:  "+objeto1.getNombre());
        System.out.println("La edad es "+objeto1.GetEdad());
    }
    
}
