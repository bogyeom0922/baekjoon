import sys
n = int(sys.stdin.readline())
sum = []
for i in range(n):
    a,b = map(int, sys.stdin.readline().split())
    sum.append(int(a+b))
for i in range(n):
    print(sum[i])