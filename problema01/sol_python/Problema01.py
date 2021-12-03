angulo1= int(input("Ingrese el primer ángulo: "))
angulo2=int(input("Ingrese el segundo ámgulo: "))
angulo3=int(input("Ingrese el tercer ángulo: "))
if angulo1 == 90 or angulo2 == 90  or angulo3 == 90:
    print("El tipo de triangulo es: Rectangulo")
if (angulo1 > 90 and angulo1<180)or(angulo2 > 90 and angulo1<180)or(angulo3 >90 and angulo1<180):
    print("El tipo de triangulo es: Obtusangulo")
if angulo1 < 90 and angulo2 < 90 and angulo3 < 90:
    print("El tipo de triangulo es: Acutángulo")