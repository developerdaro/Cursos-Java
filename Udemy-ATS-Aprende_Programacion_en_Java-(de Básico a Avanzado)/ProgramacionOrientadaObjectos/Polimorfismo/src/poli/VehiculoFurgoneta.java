 
package poli;
 
public class VehiculoFurgoneta extends Vehiculo{
    private int carga;

    public VehiculoFurgoneta(int carga, String Matricula, String Marca, String Modelo) {
        super(Matricula, Marca, Modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
     @Override
    public String mostrarDatos(){
         return "Matricula: " + Matricula + "\nMarca: " + Marca + "\nModelo: " + Modelo+"\ncarga: "+carga; 
    }
    
}
