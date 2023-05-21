package ejercicios;

import java.util.Scanner;

public class Facturas {

    public static void main(String[] args) {

        /*
        ENUNCIADO
        
        Una empresa que se dedica a la venta de sesinfectantes, necesitan un programa para gestion facturas.
        En cada factura figura:
        el codigo del articulo, la cantidad vendida en litros y el precio por litro.
        Se pide de 5 facturas introduccidas:
        Facturacion total, cantidad en litros vendidos del articulo 1 y cuantas facturas 
        se emitieron de mas de $600.
         */
        //Atributos
        int factura, precioLitro = 50, total, cantidadLitros,contador=0;
        String codigo;

        //Pedir informacion
        Scanner entrada = new Scanner(System.in);
        

        //Operaciones
        //Factura
        for (int i = 1; i <= 5; i++) {

            if (i == 1) {
                System.out.println("Factura " + i);
                codigo = "Daro-01";
                cantidadLitros = 3;
                total = cantidadLitros * precioLitro;
                System.out.println("Codigo: " + codigo);
                System.out.println("Cantidad vendida: " + cantidadLitros);
                System.out.println("Total: " + total);

                if (total > 600) {
                    contador+=1;
                }
            }
            

            if (i == 2) {
                System.out.println("Factura " + i);
                codigo = "Daro-02";
                cantidadLitros = 4;
                total = cantidadLitros * precioLitro;
                System.out.println("Codigo: " + codigo);
                System.out.println("Cantidad vendida: " + cantidadLitros);
                System.out.println("Total: " + total);
                if (total > 600) {
                    contador+=1;
                }
            }
            if (i == 3) {
                System.out.println("Factura " + i);
                codigo = "Daro-03";
                cantidadLitros = 5;
                total = cantidadLitros * precioLitro;
                System.out.println("Codigo: " + codigo);
                System.out.println("Cantidad vendida: " + cantidadLitros);
                System.out.println("Total: " + total);
                if (total > 600) {
                    contador+=1;
                }
            }
            if (i == 4) {
                System.out.println("Factura " + i);
                codigo = "Daro-04";
                cantidadLitros = 30;
                total = cantidadLitros * precioLitro;
                System.out.println("Codigo: " + codigo);
                System.out.println("Cantidad vendida: " + cantidadLitros);
                System.out.println("Total: " + total);
                if (total > 600) {
                    contador+=1;
                }
            }
            if (i == 5) {
                System.out.println("Factura " + i);
                codigo = "Daro-05";
                cantidadLitros = 11;
                total = cantidadLitros * precioLitro;
                System.out.println("Codigo: " + codigo);
                System.out.println("Cantidad vendida: " + cantidadLitros);
                System.out.println("Total: " + total);
                if (total > 600) {
                    contador+=1;
                }
            }

        }
        System.out.println("La cantidad de facturas por encima de 600 es: "+contador);

    }

}
