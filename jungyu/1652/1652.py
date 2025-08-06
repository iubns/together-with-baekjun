a = int(input())
b = [list(input()) for _ in range(a)]
row = 0
for i in range(a):
    c = 0
    for j in range(a):
        if b[i][j] == '.':
            c += 1
            if c == 2:
                row += 1
        else:
            c = 0
col = 0
for i in range(a):
    c = 0
    for j in range(a):
        if b[j][i] == '.':
            c += 1
            if c == 2:
                col += 1
        else:
            c = 0
print(row, col)