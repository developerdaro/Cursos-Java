 
package poli;
 
public class VehiculoTurismo extends Vehiculo{

    private int nPuertas;
    public VehiculoTurismo(int nPuertas,String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.nPuertas=nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }
    
    @Override
    public String mostrarDatos(){
         return "Matricula: " + Matricula + "\nMarca: " + Marca + "\nModelo: " + Modelo+"\nPuertas: "+nPuertas; 
    }
    
}
