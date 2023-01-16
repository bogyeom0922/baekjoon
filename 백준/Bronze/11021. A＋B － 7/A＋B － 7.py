import sys
T = int(sys.stdin.readline())
sum = []
for _ in range(T):
    a,b = map(int, sys.stdin.readline().split())
    sum.append(int(a+b))
for i in range(T):
    print("Case #"+str(i+1)+": "+str(sum[i]))