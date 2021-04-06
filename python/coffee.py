# coffee.py

coffee = 10
while True : # infinite loop
    money = int(input('Insert coin : '))
    if money == 300 :
        print('Coffee out')
        coffee -= 1
        
    elif money > 300 :
        print('Coffee out')
        print(f'receive the change : {money - 300}')
        coffee -= 1
        
    else :
        print('Not enought coin')
        print(f'{coffee} coffee left.')

    if coffee == 0 :
        print("Sold out")

        break
    
