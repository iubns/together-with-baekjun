a, b = map(int, input().split())
c = [list(map(int, input().split())) for _ in range(a)]
c.sort(key=lambda x: (x[1], x[2], x[3]), reverse=True)
d = [c[i][0] for i in range(a)].index(b)
for i in range(a):
    if c[d][1:] == c[i][1:]:
        print(i + 1)
        break