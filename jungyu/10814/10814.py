a = int(input())
b = []
for _ in range(a):
    c, d = input().split()
    b.append([int(c), d])
for i in sorted(b, key=lambda x: x[0]):
    print(i[0], i[1])