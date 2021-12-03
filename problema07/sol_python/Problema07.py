contador = 2
suma = 0
numero = int(input("Ingrese número: "))
if numero < 2:
    print("Valor fuera de rango")
else:
    while contador <= numero:
        suma = suma + contador
        contador = contador + 2
        print(contador - 2)
print("El valor total de la suma de los pares es:", suma)