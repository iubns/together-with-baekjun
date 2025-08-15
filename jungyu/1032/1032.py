n = int(input())
a = list(input())

for _ in range(n - 1):
    b = input()
    for i in range(len(a)):
        if a[i] == b[i]:
            continue
        else:
            a[i] = "?"
print(*a, sep="")
