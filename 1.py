class Hund:
    rasse=""
    name=""
    alter=0
    lautstaerkeDB=0

    def __init__(self,name="",lautstaerkeDB=100,alter=36,rasse="lamb"):
        self.rasse=rasse
        self.name=name
        self.alter=alter
        self.lautstaerkeDB=lautstaerkeDB
        

    def display(self):
        print(self.rasse)
        print(self.name)
        print(self.alter)
        print(self.lautstaerkeDB)

    def lautstaerke(self):
        print(self.lautstaerkeDB)

class Schaeferhund(Hund):
    #def __init__(self, name,lautstaerkeDB,alter,rasse):
    #    super().__init__()
    def __init__(self, name, lautstaerkeDB, alter, rasse="schaeferhund"):
        super().__init__(name, lautstaerkeDB*1.5, alter, rasse)#
        


obj=Hund("Tehodor", 72.3,10,"laprador")
obj.display()
print()
obj2=Hund("Elias",7)
obj2.display()

print()
obj3=Hund("Mäuschen")
obj3.display()

print()
obj4=Hund(90.4)
obj4.display()


print()
obj5=Schaeferhund("Theodor", 80,10)
obj5.display()