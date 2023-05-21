package ejercicios;

import java.util.Scanner;

public class MediaNumeros {

    public static void main(String[] args) {

        /*
        ENUNCIADO
        
        Leer 5 numeros por teclado, almacenarlos en un arreglo y a 
        continuacion realizar la media de los numeros positivosm la media de 
        los numeros negativos y contar el numero de ceros.
         */
        //Atributos
        int numero, contadorpositivos = 0, contadornegativos = 0, contadorceros = 0, sumapositivos = 0, sumanegativos = 0;
        double mediapositivos = 0, medianegativos = 0;

        //Ingresar informacion por consola
        Scanner entrada = new Scanner(System.in);

        //Array
        int numeros[] = new int[5];

        //Ingresar datos en el array
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("Ingresa un numero");
            numeros[i] = entrada.nextInt();
        }

        //Recorrer el array
        for (int elemento : numeros) {
            if (elemento > 0) {
                contadorpositivos += 1;
                sumapositivos = sumapositivos + elemento;
                mediapositivos = sumapositivos / contadorpositivos;
            }
            if (elemento < 0) {
                contadornegativos += 1;
                sumanegativos = sumanegativos + elemento;
                medianegativos = sumanegativos / contadornegativos;
            }
            if (elemento == 0) {
                contadorceros += 1;
            }
        }
        
        System.out.println("La media de los numeros Positivos es: "+mediapositivos);
        System.out.println("La media de los numeros Negativos es: "+medianegativos);
        System.out.println("Cantidad de Ceros: "+contadorceros);

    }

}
