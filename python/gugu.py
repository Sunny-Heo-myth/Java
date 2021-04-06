# GuGu

# result = GuGu(2)

def GuGu(n) :
    result = []
    for x in range(1, 10) :
        result.append(n * x)
    return result


if __name__ == '__main__' :
    print(GuGu(2))

