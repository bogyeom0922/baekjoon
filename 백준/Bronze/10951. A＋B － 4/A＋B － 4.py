import sys
while True:
    try:
        A,B = map(int, sys.stdin.readline().split())
        if A=="":
            break
        else:
            print(A+B)
    except:
        break