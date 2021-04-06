# counting time
from datetime import date


# 100 yrs life (passed at least)

birth = date(1992, 7, 13)
death = date(2092, 7, 13)


# total = death - birth
total = death - birth
print(total)


# past = now - birth
past = date(2020, 8, 1) - birth
print(past)


# future = death - now
future = death - date(2020, 8, 1)

print(future)


