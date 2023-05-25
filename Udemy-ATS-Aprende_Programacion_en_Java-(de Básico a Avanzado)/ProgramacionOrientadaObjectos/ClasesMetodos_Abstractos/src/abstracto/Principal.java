 
package abstracto;
 
public class Principal {
    
    public static void main(String[] args) {
        Planta planta1=new Planta();
        
        AnimalHerbivoro ac=new AnimalHerbivoro();
        planta1.alimentarse();
        ac.alimentarse();
    }
    
}
