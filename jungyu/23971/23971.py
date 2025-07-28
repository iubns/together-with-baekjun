import math
a, b, c, d = map(int, input().split(" "))
row = math.ceil(a/(c+1))
col = math.ceil(b/(d+1))
print(row*col)