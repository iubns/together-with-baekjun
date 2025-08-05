a = int(input())
cnt = a
for _ in range(a):
    b = input()
    for i in range(0,len(b)-1):
        if b[i] == b[i+1]:
            continue
        elif b[i] in b[i+1:]:
            cnt -= 1
            break
print(cnt)