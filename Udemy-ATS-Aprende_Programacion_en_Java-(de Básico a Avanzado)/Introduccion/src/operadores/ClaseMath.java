package operadores;
//libreria Math

public class ClaseMath {
    
    public static void main(String[] args) {
        
        //Atributos
        double raiz;
        double exponente=2;
        double aleaotrio;
        
        //Raiz cuadrada sqrt
        raiz=Math.sqrt(652.23);
        exponente=Math.pow(raiz, 2);
        
        //redondiar
        exponente=Math.round(exponente);
        
        //numeros aleatorios
        aleaotrio=Math.random();
        
        System.out.println(raiz);
        System.out.println(exponente);
        System.out.println(aleaotrio);
        
        
    }
    
}
