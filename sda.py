class Tienda():
    def __init__(self,nombre):
        self.nombre=nombre

obj1=Tienda(input("ingrese nombre: "))
print("bienvenido a FLUKER : ",obj1.nombre)

print("""---PRODUCTOS---
    Productos   precio      nroPro
    Cebollas    2 soles     1
    Camote      4 soles     2
    Arroz       3 soles     3
    Huevos      2 soles     4
    Vinagre     1.5 soles   5           """)

nroPro=input(" indique los productos deseasos: ")
cantidad=input("cuanto desea compra: ")

nro=(int(x)for x in nroPro)
cant=(int(x)for x in cantidad)


