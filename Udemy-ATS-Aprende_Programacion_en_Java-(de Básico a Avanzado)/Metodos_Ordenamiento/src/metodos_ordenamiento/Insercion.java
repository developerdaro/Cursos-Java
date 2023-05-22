package metodos_ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Insercion {
    
    public static void main(String[] args) {
        
        /*
        Insercion
        
        Es una manera muy natural de ordenar para un ser humano, y puede
        usarse facilmente para ordenar un mazo de cartas numeradas en
        forma arbitraria. Requiere 0(n^2) operaciones para ordenar una
        lista de n elementos.
        
        [4][5][2][1][3]
        Comprobar si el elemento de su izquiera ya es menor que el
        numeroIzquierda > numeroActual: cambio
        */
        
        
        //Scanner para pedir datos al usuario por consola
        Scanner entrada=new Scanner(System.in);
        
        //declaramos el arriglo y el atributo para saber cuantos elementos tendra el arreglo
        int arreglo[], numeroElementos,posicion,temporal;
        
        //Pedirmos al usuario cuantos numeros tendra el arreglo
        numeroElementos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos"));
        
        //instanciamos los numeros digitados por el usuario al arreglo
        arreglo=new int[numeroElementos];
        
        //Pedimos los datos del arreglo
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print((i+1)+"- Ingresa un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        
        //Ordenamiento por insercion
        for (int i = 0; i < numeroElementos; i++) {
            posicion=i;
            temporal=arreglo[i];
            
            //Primera condicion, para cuando llega a la posicion cero se devuelva
            //Segunda condicion para comparar con el valor de la izquierda sea mayor al numero actual
            while((posicion>0) && (arreglo[posicion-1]>temporal)){
                
                //Cambiamos
                arreglo[posicion]=arreglo[posicion-1];
                posicion--;
            }
            //Refrescar numero actual
            arreglo[posicion]=temporal;
            
        }
        
        //Mostrar el arreglo ordenado acendente
        System.out.println("Arreglo acendente");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(arreglo[i]);

        }
        //Mostrar el arreglo ordenado descendente
        System.out.println("Arreglo descendente");
        for (int i = numeroElementos-1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }
        
        
        
        
    }
    
}
