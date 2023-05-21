package arreglos_vectores;

public class Arreglos_Vectores {

    public static void main(String[] args) {

        /*
        Arreglos
        
        Es un estructura de datos que nos permite almacenar un conjunto del mismo tipo.
        el tamaño de los arrays se declara en un primer momento y no puede cambiar
        luego durante la ejecucion del programa.
        
        
        Unidimensionales
        array de una sola dimencion
        
        tipo_de_variable[] nombre_del_array=new Tipo_de_variable[dimension]
        
        Dar valores
        int[] nombre=new int [numerodatos ]
        int[] nombre={valor1,valor2,valor3}
        */
        
        int [] numeros=new int[3];
        
        numeros[0]=5;
        numeros[1]=10;
        numeros[2]=8;
        
        for( int i=0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
         
        System.out.println("----------------------------");
        
        //Segunda forma
        int [] numero={3,5,6,8};
        
        for(int i=0;i<numero.length;i++){
            System.out.println(numero[i]);
        }
        
        
        
        
        

    }
    
}
