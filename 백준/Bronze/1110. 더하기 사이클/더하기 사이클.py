import sys
n = int(sys.stdin.readline())
a = int(n/10)
b = int(n%10)
sum = (a+b)%10 + b*10
count=1
while True:
    if sum == n:
        print(count)
        break
    else:
        a = int(sum/10)
        b = int(sum%10)
        sum = (a+b)%10 + b*10
        count += 1