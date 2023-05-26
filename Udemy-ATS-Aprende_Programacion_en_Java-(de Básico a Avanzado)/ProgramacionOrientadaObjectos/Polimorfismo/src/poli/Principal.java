 
package poli;
 
public class Principal {
    

    public static void main(String[] args) {
        
        
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0]= new Vehiculo("DR-10","ferrary", "X-04");
        misVehiculos[1]= new VehiculoTurismo(4, "24-gf", "Audi", "f-g4");
        misVehiculos[2]=new VehiculoDeportivo(200, "mt-200", "pulsar", "pl-20");
        misVehiculos[3]=new VehiculoFurgoneta(50, "vhf-09", "camioneta", "mc-90");
        
        for (Vehiculo vehiculos:misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
        }
        
    }
    
  
    
}
