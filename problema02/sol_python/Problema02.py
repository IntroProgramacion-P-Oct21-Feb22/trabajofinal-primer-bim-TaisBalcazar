porcentaje1 = 20
porcentaje2 = 25
porcentaje3 = 40
porcentaje4 = 50
precio= float(input("Ingrese el costo unitario del producto: "))
cantidad= int(input("Ingrese la cantidad que desea de este producto: "))

costoparcial = (precio*cantidad)
print(costoparcial)
descuento1 = (costoparcial*porcentaje1)/(100)
descuento2 = (costoparcial*porcentaje2)/(100)
descuento3 = (costoparcial*porcentaje3)/(100)
descuento4 = (costoparcial*porcentaje4)/(100)

print("Venta de Trajes\n" "Cantidad de productos:",cantidad,"\n" +"Costo de los productos:",precio,"\n"+"Subtotal:",costoparcial)
if cantidad == 1:
    costofinal = costoparcial - descuento1
    print("Descuento:", descuento1)
if cantidad == 2:
    costofinal = costoparcial - descuento2
    print("Descuento:", descuento2)
if cantidad == 3:
    costofinal = costoparcial - descuento3
    print("Descuento:", descuento3)
if cantidad > 3:
    costofinal = costoparcial - descuento4
    print("Descuento:", descuento4)

print("El costo final de venta es: ", costofinal)