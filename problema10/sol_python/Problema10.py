bandera = True
media = 0
suma = 0
varianza = 0
sumdesviaciones = 0  # suma de variaciones
varianza = 0
desviaciones = 0
lista = []

while bandera:
    num = float(input("Ingrese el dato para calcular: "))
    lista.append(num)

    inp = input("Desea ingresar otro dato: Si - No: \t")
    if inp == "Si" or inp == "SI" or inp == "si":
        print()
    else:
        bandera = False
        cantval = len(lista)

        for num in range(len(lista)):
            suma = suma + lista[num]
        media = suma / cantval

        for num in range(len(lista)):
            sumdesviaciones = sumdesviaciones + ((lista[num] - media) ** 2)
        varianza = sumdesviaciones / cantval

print("El valor de la media es: \t", media)
print("El valor de varianza final es: \t", varianza)