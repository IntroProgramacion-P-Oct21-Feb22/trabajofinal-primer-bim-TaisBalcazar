tipo = " "
nombre = " "
valorextra1 = 1.5
valorextra2 = 2
valorextra3 = 2.5
valorextra4 = 3
horasobligatorias = 40
nombre = (input("Ingrese su nombre: "))
tipo = (input("Ingrese tipo de empleado: "))
horastrabajadas = int(input("Ingrese las horas trabajadas: "))
cuotaporhora = int(input("Ingrese el valor de la cuota por hora: "))

pagoparcial = (cuotaporhora * horastrabajadas)
horasextratrabajadas = (horastrabajadas - horasobligatorias)
cuotaextra1 = (horasextratrabajadas * valorextra1)
cuotaextra2 = (horasextratrabajadas * valorextra2)
cuotaextra3 = (horasextratrabajadas * valorextra3)
cuotaextra4 = (horasextratrabajadas * valorextra4)

print("\n\nCálculo de sueldo\n" "Horas trabajadas: ", horastrabajadas,"\n" + "Cuota por hora: ", cuotaporhora,"\n"+ "Sueldo parcial: ", pagoparcial)

if (horastrabajadas <= 40):
    print("La cantidad de horas trabajadas no son suficientes para hacer pago de horas extra")
    print("El sueldo a pagar es: ", pagoparcial)
else:
    if (tipo == "tipo1"):
        sueldo = pagoparcial + cuotaextra1
        print("Valor a pagar por horas extra: ", cuotaextra1)
    else:
            if (tipo == "tipo2"):
                 sueldo = pagoparcial + cuotaextra2
                 print("Valor a pagar por horas extra: ", cuotaextra2)
            else:
                 if (tipo == "tipo3"):
                    sueldo = pagoparcial + cuotaextra3
                    print("Valor a pagar por horas extra: ", cuotaextra3)
                 else:
                        if (tipo == "tipo4"):
                            sueldo = pagoparcial + cuotaextra4
                            print("Valor a pagar por horas extra: ", cuotaextra4)
    print("El sueldo a pagar es: ", sueldo)