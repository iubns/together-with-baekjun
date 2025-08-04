n = int(input())
arr = [input() for _ in range(n)] 
a = arr.index('KBS1')
b = arr.index('KBS2')
if a > b:
    b += 1
print("1"*a + "4"*a + '1'*b + '4'*(b-1))