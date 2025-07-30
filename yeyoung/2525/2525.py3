a,b = map(int, input().split())
c = int(input())

d = a*60+b+c

e = (d // 60) % 24
f = d % 60

print(e, f)