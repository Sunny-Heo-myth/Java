r = range(1000)
L = {*r} - {s + sum(map(int, str(s))) for s in r}
print(*sorted(L))
