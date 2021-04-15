cycle = 0
x = int(input())
while True :
    cycle += 1
    
    if x < 10 :
        a, b = 0, x
        c = a + b
        d = b*10 + int(str(c)[-1])
        if d != x :
            x = d
            continue
        else :
            print(cycle)
            break
    else :
        a, b = int(str(x)[-2]), int(str(x)[-1])
        c = a + b
        d = b*10 + int(str(c)[-1])
        if d != x :
            x = d
            continue
        else :
            print(cycle)
            break
