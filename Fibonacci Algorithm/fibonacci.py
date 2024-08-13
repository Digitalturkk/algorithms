def fibonacci(x, y, z):
    print(x)
    for i in range(z):
        print(y)
        x, y = y, x + y

fibonacci(1, 2, 10) # Any number of arguments can be passed
