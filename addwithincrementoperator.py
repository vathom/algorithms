def add(x,y):
    if x == 0:
        return y
    if y == 0:
        return x
    while x!= 0:
        if x < 0:
            x+=1
            y-=1
        else:
            x-=1
            y+=1
    return y

a = -1
b = -10
sum = add(a,b)
print sum

