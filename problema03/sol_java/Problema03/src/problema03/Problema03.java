/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String tipo;
        String nombre;
        double cuotaporhora;
        int horastrabajadas;
        double pagoparcial;
        double valorextra1 = 1.5;
        double valorextra2 = 2;
        double valorextra3 = 2.5;
        double valorextra4 = 3;
        double cuotaextra1;
        double cuotaextra2;
        double cuotaextra3;
        double cuotaextra4;
        double sueldo = 0;
        int horasobligatorias = 40;
        int horasextratrabajadas;
        
        System.out.println("Ingrese  nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese tipo de empleado");
        tipo = entrada.nextLine();
        System.out.println("Ingrese las horas trabajadas");
        horastrabajadas = entrada.nextInt();
        System.out.println("Ingrese el valor de la cuota por hora");
        cuotaporhora = entrada.nextDouble();

        pagoparcial = (cuotaporhora * horastrabajadas);
        horasextratrabajadas = (horastrabajadas - horasobligatorias);
        cuotaextra1 = (horasextratrabajadas * valorextra1);
        cuotaextra2 = (horasextratrabajadas * valorextra2);
        cuotaextra3 = (horasextratrabajadas * valorextra3);
        cuotaextra4 = (horasextratrabajadas * valorextra4);

        System.out.printf("Cálculo de sueldo\nHoras trabajadas:%d\nCuota por "
                + "hora:%.2f\nSueldo parcial:%.2f\n", horastrabajadas,
                cuotaporhora, pagoparcial);

        if (horastrabajadas < 40) {
            System.out.println("La cantidad de horas trabajadas no son"
                    + " suficientes para hacer pago de horas extra");
            System.out.printf("El sueldo a pagar es:%.2f\n", pagoparcial);
        } else {
            if (tipo.equals("tipo1")) {
                sueldo = pagoparcial + cuotaextra1;
                System.out.printf("Valor a pagar por horas extra:%.2f\n",
                        cuotaextra1);
            } else {
                if (tipo.equals("tipo2")) {
                    sueldo = pagoparcial + cuotaextra2;
                    System.out.printf("Valor a pagar por horas extra:%.2f\n",
                            cuotaextra2);
                } else {
                    if (tipo.equals("tipo3")) {
                        sueldo = pagoparcial + cuotaextra3;
                        System.out.printf("Valor a pagar por horas extra:%.2f\n",
                                cuotaextra3);
                    } else {
                        if (tipo.equals("tipo4")) {
                            sueldo = pagoparcial + cuotaextra4;
                            System.out.printf("Valor a pagar por horas extra:%.2f\n",
                                     cuotaextra4);
                        }
                        
                    }

                }
            }
            System.out.printf("El sueldo a pagar es:%.2f\n", sueldo);
        }

    }

}