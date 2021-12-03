pies = 0
yardas = 0
pulgadas = 0
metros = 0
contador = 0
suma = 0
cadena0 = "Metros | Yardas| Pulgada| Pies"
cadena1 = 0
cadena2 = 0
cadena3 = 0
cadena4 = 0
cadenafinal = ""
metro = (int(input("Ingrese el valor en metros que desea convertir: ")))
print(cadena0)
while contador < metro:
    contador = contador + 1
    suma = contador
    yardas = suma * 1.094
    pulgadas = suma * 39.37
    pies = suma * 3.2804

    cadena1 = suma
    cadena2 = yardas
    cadena3 = pulgadas
    cadena4 = pies

    print("  %.2f   %.2f    %.2f    %.2f" % (cadena1, cadena2, cadena3, cadena4))