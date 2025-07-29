a = int(input())
sum = 1
for i in range(a):
    sum += i*6
    if sum >= a:
        print(i+1)
        break