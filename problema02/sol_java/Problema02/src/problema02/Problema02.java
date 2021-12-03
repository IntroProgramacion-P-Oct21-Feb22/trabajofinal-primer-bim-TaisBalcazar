/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double precio;
        int cantidad;
        double costoparcial;
        double porcentaje1 = 20;
        double porcentaje2 = 25;
        double porcentaje3 = 40;
        double porcentaje4 = 50;
        double descuento1;
        double descuento2;
        double descuento3;
        double descuento4;
        double costofinal = 0;

        System.out.println("Ingrese el costo unitario del producto");
        precio = entrada.nextDouble();
        System.out.println("Ingrese la cantidad que desea de este producto");
        cantidad = entrada.nextInt();

        costoparcial = (precio * cantidad);
        descuento1 = (costoparcial * porcentaje1) / 100;
        descuento2 = (costoparcial * porcentaje2) / 100;
        descuento3 = (costoparcial * porcentaje3) / 100;
        descuento4 = (costoparcial * porcentaje4) / 100;

        System.out.printf("Venta de Trajes\nCantidad de productos:%d\nCosto de "
                + "los productos:%.2f\nSubtotal:%.2f\n", cantidad, precio, 
                costoparcial);
        
        if (cantidad < 0) {
            System.out.println("Valor fuera de rango");
        } else {
            if (cantidad == 1){
                costofinal = costoparcial - descuento1;
                System.out.printf("Descuento:%.2f\n", descuento1);
            } else {
                if (cantidad == 2) {
                    costofinal = costoparcial - descuento2;
                    System.out.printf("Descuento:%.2f\n", descuento2);
                } else {
                    if (cantidad == 3) {
                        costofinal = costoparcial - descuento3;
                        System.out.printf("Descuento:%.2f\n", descuento3);
                    } else {
                        if (cantidad > 3) {
                            costofinal = costoparcial - descuento4;
                            System.out.printf("Descuento:%.2f\n", descuento4);
                        }
                    }

                }
            }
        }
        System.out.printf("Costo final de venta:%.2f\n", costofinal);
    }
    
}
