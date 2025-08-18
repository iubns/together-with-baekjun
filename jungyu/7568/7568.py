a = int(input())
b = []
for _ in range(a):
    b.append(list(map(int, input().split())))
for i in b:
    c = 1
    for j in b:
        if i[0] < j[0] and i[1] < j[1]:
            c += 1
    print(c, end=" ")