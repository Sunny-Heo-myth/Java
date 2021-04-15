# writedata.py
f = open("C:/Python/New file.txt", 'w')
for i in range(1, 11) :
    data = 'line no. %d.\n' %i
    f.write(data)

f.close()

c = open('C:/Python/review.txt', 'w')
c.close()

f = open('C:/Python/New file.txt', 'r')
while True :
    line = f.readline()
    if not line : break
    print(line)
f.close()

while 1 :
    data = input()
    if not data : break
    print(data)

f = open('C:/Python/New file.txt', 'r')
lines = f.readlines()
for line in lines :
    print(line)
f.close()

f = open('C:/Python/New file.txt', 'r')
data = f.read()
print(data)
f.close()
