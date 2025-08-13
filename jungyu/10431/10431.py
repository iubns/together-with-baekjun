a = int(input())
for _ in range(a):
    b = list(map(int, input().split()))
    cnt = 0
    for i in range(1, len(b)-1):
        for j in range(i+1, len(b)):
            if b[i] > b[j]:
                b[i], b[j] = b[j], b[i]
                cnt += 1
    print(b[0], cnt)
