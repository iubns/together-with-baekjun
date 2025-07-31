a = input().upper()
ls = list(set(a))
cnt = []
for i in ls:
    count = a.count(i)
    cnt.append(count)
if cnt.count(max(cnt)) >= 2:
    print("?")
else:
    print(ls[cnt.index(max(cnt))])