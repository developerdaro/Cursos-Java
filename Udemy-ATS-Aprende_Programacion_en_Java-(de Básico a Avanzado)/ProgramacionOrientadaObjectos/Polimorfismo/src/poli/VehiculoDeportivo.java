 
package poli;
 
public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    
     @Override
    public String mostrarDatos(){
         return "Matricula: " + Matricula + "\nMarca: " + Marca + "\nModelo: " + Modelo+"\nCilindrada: "+cilindrada; 
    }
}
