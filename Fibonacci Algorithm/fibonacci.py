def fibonacci(x, y, z):
    print(x)
    for i in range(z):
        print(y)
        x, y = y, x + y

number_one = int(input("Enter the first number: "))
number_two = int(input("Enter the second number: "))
number_of_terms = int(input("Enter the number of terms: "))

fibonacci(number_one, number_two, number_of_terms)
