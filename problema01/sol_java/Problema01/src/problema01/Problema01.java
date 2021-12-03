/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables
        int angulo1;
        int angulo2;
        int angulo3;
        String triangulo = " ";

        System.out.println("Ingrese el primer ángulo");
        angulo1 = entrada.nextInt();

        System.out.println("Ingrese el segundo ángulo");
        angulo2 = entrada.nextInt();

        System.out.println("Ingrese el tercer ángulo");
        angulo3 = entrada.nextInt();

        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            triangulo = "Rectangulo";
        } else {

            if (angulo1 > 90 && angulo1 < 180
                    || angulo2 > 90 && angulo2 < 180
                    || angulo3 > 90 && angulo3 < 180) {
                triangulo = "Obtusángulo";
            } else {

                if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
                    triangulo = "Acutángulo"; 

                }

            }
        }
        System.out.printf("El tipo de triangulo es: %s", triangulo);
    }
}

