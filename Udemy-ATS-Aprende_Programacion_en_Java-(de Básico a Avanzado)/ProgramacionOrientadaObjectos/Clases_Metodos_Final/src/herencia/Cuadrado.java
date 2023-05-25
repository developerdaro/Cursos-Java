package herencia;

public class Cuadrado extends FiguraCerrada{
    
    private double area;

    public Cuadrado(double area, int nLAdos, double tamaño) {
        super(nLAdos, tamaño);
        this.area = area;
    }
    
    public void dibujar(){
        System.out.println("Dibujamos un cuadrado");
    }
    
}
