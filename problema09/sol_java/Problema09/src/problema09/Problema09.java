/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String signo;
        String signo1 = "-";
        String signo2 = "+";
        String cadena = " ";
        int numero1 = 12;
        int numero2 = 11;
        int limite1 = 48;
        int limite2 = 44;
        do {
            // para manejar el signo asociado 
                if (numero1 % 12 == 0){
                    signo = signo2;
                } else {
                    if ((numero2 == 11) || (numero2 % 11 == 0)) {
                    signo = signo1;}
                }

                cadena = String.format("%s%s%d %s%d ",
                        cadena,
                        signo2,
                        numero1,
                        signo1,
                        numero2);
                numero1 = numero1 + 12;
                numero2 = numero2 + 11;
            
        } while ((numero2 <= limite2)||(numero1 <= limite1));
        {

          System.out.println(cadena);

        }
         
    }
} 