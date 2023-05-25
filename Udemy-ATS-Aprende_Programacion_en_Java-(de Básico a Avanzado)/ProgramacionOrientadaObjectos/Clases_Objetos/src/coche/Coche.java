package coche;

public class Coche {

    //Atributos
    String color;
    String marca;
    int km;

    public static void main(String[] args) {

        //Llamamos a la clase y creamos un objeto
        Coche coche1 = new Coche();

        //Accedemos a los atributos del objeto y damos valores
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;

        //Mostramos informacion
        System.out.println("El choche1 tiene color" + coche1.color);
        System.out.println("El choche1 tiene marca" + coche1.marca);
        System.out.println("El choche1 tiene km" + coche1.km);
        
        
        //Llamamos a la clase y creamos un segundo objeto
        Coche coche2 = new Coche();

        //Accedemos a los atributos del objeto y damos valores
        coche2.color = "Azul";
        coche2.marca = "Ferrari";
        coche2.km = 0;

        //Mostramos informacion
        System.out.println("El coche2 tiene color" + coche1.color);
        System.out.println("El coche2 tiene marca" + coche1.marca);
        System.out.println("El coche2 tiene km" + coche1.km);

    }

}
