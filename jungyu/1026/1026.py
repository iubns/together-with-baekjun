a = int(input())
b = list(map(int, input().split()))
c = list(map(int, input().split()))
b.sort()
sum = 0
for i in range(a):
    sum += b[i]*max(c)
    c.remove(max(c))
print(sum)