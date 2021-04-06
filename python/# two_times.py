# positive.py
def positive(l) :
    result = []
    for i in l :
        if i > 0 :
            result.append(i)
    return result

print(positive([1, -3, 2, 0, -5, 6]))

# filter1.py
def positive(x) :
    return x > 0

print(list(filter(positive, [1, -3, 2, 0, -5, 6])))
print(filter(positive, [1, -3, 2, 0, -5, 6]))

list(filter(lambda x : x > 0, [1, -3, 2, 0, -5, 6]))

#two_times.py
def two_times(numberList) :
    result = []
    for number in numberList :
        result.append(number * 2)
    return result

actual_result = two_times([1,2,3,4])

print(actual_result)
