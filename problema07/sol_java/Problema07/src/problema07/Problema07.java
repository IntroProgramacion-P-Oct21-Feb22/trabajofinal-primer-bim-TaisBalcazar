/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero;
        int contador = 0;
        int suma = 0;
        System.out.println("Ingrese numero");
        numero = entrada.nextInt();
        if (numero < 2) {
            System.out.println("Valor fuera de rango");
        } else {
            do {
                contador = contador + 2;
                suma = suma + contador;
                System.out.printf("%d\n", contador);

            } while (contador < numero);
            System.out.println("El valor total de la suma de pares es:" + suma);
        }
    }
}
   
