while(True):
    arr = [0] * 3
    arr = list(map(int, input().split(" ")))
    arr.sort(reverse = True)
    a = arr[0]
    b = arr[1]
    c = arr[2]
    if (a==0 and b==0 and c==0):
        break
    if (a < b + c):
        if a == b and b == c:
            print("Equilateral")
        elif a==b or b==c:
            print("Isosceles")
        else:
            print("Scalene")
    else:
        print("Invalid")
        