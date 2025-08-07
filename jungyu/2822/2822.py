a = [int(input()) for _ in range(8)]
b = sorted(a)[3:]
print(sum(b))
c = []
for i in b:
    c.append(a.index(i)+1)
print(*sorted(c))