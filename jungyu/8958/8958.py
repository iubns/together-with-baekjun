a = int(input())
for _ in range(a):
    b = input().strip()
    score, c = 0, 0
    for char in b:
        if char == 'O':
            c += 1
            score += c
        else:
            c = 0
    print(score)
