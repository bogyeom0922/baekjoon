import sys

m=n=count=0

read = sys.stdin.readline
num = int(read())
before_N = num

while True:
    count+=1
    new_N = (before_N % 10) * 10 + ((before_N // 10) + (before_N % 10)) % 10
    if new_N == num:
        break
    before_N = new_N

print(count)
