signo = " "
signo1 = "-"
signo2 = "+"
cadena = " "
numero1 = 12
numero2 = 11
limite1 = 48
limite2 = 44

while numero2 <= limite2 or numero1 <= limite2:
    if numero1 % 12 == 0:
        signo = signo2
    else:
        if numero2 == 11 or numero2 % 11 == 0:
            signo = signo1

    print("%s%s%d %s%d" % (cadena, signo2, numero1, signo1, numero2), end="")
    numero1 = numero1 + 12
    numero2 = numero2 + 11
