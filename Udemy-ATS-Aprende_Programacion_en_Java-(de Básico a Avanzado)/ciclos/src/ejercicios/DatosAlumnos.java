package ejercicios;

import java.util.Scanner;

public class DatosAlumnos {

    public static void main(String[] args) {
        
        /*
        ENUNCIADOS
        
        Dadas las edades y alturas de 5 alumnos, mostrar la edad
        y la estatura media, la cantidad de alumnos mayores de 18 años,
        y la cantidad de alumnos que miden mas de 1.75        
        */
        
        //Atributos
        int edades,cantidadAlumnosEdades, cantidadAlumnosEstatura = 0,mayoresEdad=0;
        double estatura,mediaEdad = 0,mediaEstatura = 0,resedades = 0,resestaturas=0;
       
        //Pedir informacion al usuario
        Scanner entrada=new Scanner(System.in);
        
        //Operaciones
        for (int i =1 ; i <= 5; i++) {
            System.out.print(i+"- Edad: ");
            edades=entrada.nextInt();
            
            System.out.print(i+"- Estatura: ");
            estatura=entrada.nextDouble();
            
            mediaEdad=mediaEdad+edades;
            resedades=mediaEdad/5;
            
            
            mediaEstatura=mediaEstatura+estatura;
            resestaturas=mediaEstatura/5;
            
            if (edades >18){
                mayoresEdad+=1;
            }
            
             if (estatura >1.75){
                cantidadAlumnosEstatura+=1;
            }
            
            
            
        }
        System.out.println("Edad Media: "+resedades);
        System.out.println("Estatura Media: "+resestaturas);
        System.out.println("Cantidad de mayores de edad:  "+mayoresEdad);
        System.out.println("Cantidad de mayores de 1.75:  "+cantidadAlumnosEstatura);
        
        
    }
    
}
