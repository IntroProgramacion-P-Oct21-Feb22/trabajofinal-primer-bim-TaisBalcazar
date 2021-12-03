x = int(input("Ingrese el valor de x: "))
y = int(input('Ingrese el valor de y: '))
if x == 0 or y == 0:
    print("Se encuentra en el eje de coordenadas")
if x > 0 and y > 0:
    print("Se encuentra en el primer cuadrante")
if x < 0 and y > 0:
    print("Se encuentra en el segundo cuadrante")
if x < 0 and y < 0:
    print("Se encuentra en el tercer cuadrante")
if x > 0 and y < 0:
    print("Se encuentra en el cuarto cuadrante")



