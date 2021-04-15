
def d(n) :
    alter = [x for x in str(n)]
    m = n
    for num in alter :
        m += int(num)
    return m

print(d(12345))
    
