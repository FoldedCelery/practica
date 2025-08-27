cadena1 = "maximiliano"
print("capitalize", cadena1.capitalize())

cadena2 = "MAX"
print("casefold", cadena2.casefold())

print(cadena2.center(7,'-'))

menus = ["MENU ATM","depositar","retirar","consultar"]
for menu in menus:
    print(menu.center(20,'-'))

cadena3 = "maximiliano"
print(cadena3.count("i"))
