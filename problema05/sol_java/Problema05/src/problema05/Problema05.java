/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int x;
        int y;
        String cuadrante = " ";

        System.out.println("Ingrese el valor de x");
        x = entrada.nextInt();

        System.out.println("Ingrese el valor de y");
        y = entrada.nextInt();

        if (x == 0 || y == 0) {
            cuadrante = "Eje de coordenadas";
        } else {

            if (x > 0 && y > 0) {
                cuadrante = "Primer cuadrante";
            } else {

                if (x < 0 && y > 0) {
                    cuadrante = "Segundo cuadrante";

                } else {
                    if (x < 0 && y < 0) {
                        cuadrante = "Tercer cuadrante";
                    } else {
                        if (x > 0 && y < 0) {
                            cuadrante = "Cuarto cuadrante";
                        }
                    }

                }
            }
        }
        System.out.printf("Las coordenadas estan ubicadas en el %s", cuadrante);

    }
}
