package ejercicios;


public class ProductoDiezNumerosImpares {
    
    public static void main(String[] args) {
        
        /*
        ENUNCIADO
        
        Diseñar un programa que muestre el producto de los 10 primeros
        numeros impares.
        */
        
        
        //Atributos
        int producto=1;
        
        
        //Operaciones
        for (int i=1; i<=20;i=i+2) {
            if (i%2!=0){
                producto=producto*i;
            }
            
            
        }
        System.out.println("El producto de los primeros diez numeros es : "+producto);
        
        
        
    }
    
    
    
}
