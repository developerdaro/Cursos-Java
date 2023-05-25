package herencia;

public class FiguraCerrada  extends Figura{
    
    private int nLados;
    
    public FiguraCerrada(int nLAdos, double tamaño){
        super(tamaño);
        this.nLados=nLAdos;
    }
    
    public  void dibujar(){
            System.out.println("Dibujo de una figura cerrada");
    }
    
}
