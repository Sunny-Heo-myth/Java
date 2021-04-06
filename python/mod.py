#mod1.py
def safe_sum(a,b):
    if type(a) != type(b) :
        print('not addable')
        return
    else:
        result = sum(a,b)
    return result

def add(a, b) :
    return a + b
def sub(a, b) :
    return a - b

if __name__ == "__main__" :
    print(add(1, 4))
    print(sub(4, 2))