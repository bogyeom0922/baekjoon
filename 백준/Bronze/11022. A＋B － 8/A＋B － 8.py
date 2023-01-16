import sys
T = int(sys.stdin.readline())
sum = []
num1 = []
num2 = []
for i in range(T):
    a,b = map(int, sys.stdin.readline().split())
    num1.append(a)
    num2.append(b)
    sum.append(int(a+b))
for i in range(T):
    print("Case #"+str(i+1)+": "+str(num1[i])+" + "+str(num2[i])+" = "+str(sum[i]))

