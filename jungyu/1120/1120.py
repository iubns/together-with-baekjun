a, b = input().split()
len_a = len(a)
len_b = len(b)
d = float('inf')
for i in range(len_b - len_a + 1):
    c = 0
    for j in range(len_a):
        if a[j] != b[i + j]:
            c += 1
    d = min(d, c)
print(d)
