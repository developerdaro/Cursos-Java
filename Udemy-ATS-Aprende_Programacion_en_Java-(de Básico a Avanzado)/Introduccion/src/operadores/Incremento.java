package operadores;


public class Incremento {
    
    public static void main(String[] args) {
        
        //atributos
        int numero1=5;
        int numero2=10;
        
        //POS incremento
        numero1++;
        System.out.println("numero1 pos incremento = " + numero1);
        
        numero2++;
        System.out.println("numero2 pos incremento = " + numero2);
        
        //POS Decremento
         numero1--;
        System.out.println("numero1 pos decremento = " + numero1);
        
        numero2--;
        System.out.println("numero2 pos decremento = " + numero2);
        
        //PRE incremento
        ++numero1;
        System.out.println("numero1 pre incremento= " + numero1);
        
        ++numero2;
        System.out.println("numero2 pre incremento= " + numero2);
        
        //PRE Decremento
        --numero1;
        System.out.println("numero1 pre Decremento= " + numero1);
        
        --numero2;
        System.out.println("numero2 pre Decremento= " + numero2);
        
        
        
    }
    
}
