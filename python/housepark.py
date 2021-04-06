class HousePark :
        lastname = 'Park'
        def setname(self, name):
            self.fullname = self.lastname + name
        def travel(self, where):
            print("%s is traveling to %s." %(self.fullname, where))



pey = HousePark()
pes = HousePark()
pey.setname("life")

print(pey.lastname)
print(pey.fullname)
print(pey.travel("Auroville"))


## __init__
class HousePark:
    lastname = 'Park'

    def __init__(self, name):
        self.fullname = self.lastname + name

    def travel(self, where):
        print("%s is traveling to %s." % (self.fullname, where))
print(pey.travel("Auroville"))

class HouseHeo :
    lastname = 'Heo'

    def __init__(self, name) :
        self.fullname = self.lastname + name

    def travel(self, where) :
        print("%s is traveling to %s." %(self.fullname, where))
sunyoung = HouseHeo('sunny')
print(sunyoung.travel('Space'))


