import random

print("Угадай число")
print("от 1 до 100")

target = random.randint(1, 100)  
guess = None

while guess != target:
    guess = int(input("Введите число: "))
    if guess < target:
        print("Больше:")
    elif guess > target:
        print("Меньше:")

print("Победа")
