num1 = int(input("Ingresar el número: "))
num2 = int(input("Ingresar el número: "))
num3 = int(input("Ingresar el número: "))
if num1 == num2 or num2 == num3 or num1 == num3:
    print("No se puede ejecutar, por que los numeros tienen el mismo valor")
else:
    print("El número mayor entre %d, %d y %d es :%d" %(num1, num2, num3, max(num1, num2, num3)))