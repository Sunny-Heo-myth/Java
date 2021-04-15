f = open('C:/Python/New file.txt', 'r')
lines = f.readlines()
for line in lines :
    print(line)
f.close()

f = open('C:/Python/New file.txt', 'r')
data = f.read()
print(data)
f.close()

# add data.py
f = open('C:/Python/New file.txt', 'a')
for i in range(11, 20) :
    data = 'Line no. %d.\n' %i
    f.write(data)
f.close()
