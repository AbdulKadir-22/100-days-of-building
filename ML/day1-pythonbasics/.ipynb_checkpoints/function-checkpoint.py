
# print("Hello, World!")

def greet(name):
    return f'Hello, {name}!'

def exponent(base,power):
    return base ** power

print("\n\nThe square of 28 is ", exponent(28,2))
print(f"The cube of 28 is ", exponent(28,3))
print(f"The power 4 of 28 is {exponent(28,4)} \n\n")


numbers = [1, 2, 3, 4, 5]
squares = []
for n in numbers:
  squares.append(n * n)
print(squares)

# print(greet("Jon"))