# vartest.py

a = 1
def vartest(a) :
    a += 1
    return a

a = vartest(a)
print(a)

# vartest_global.py
a = 1
def vartest() :
    global a
    a += 1

vartest()
print(a)
    
