import sys

read = sys.stdin.readline
T = int(read())

result=[]
score=0
o=0

for _ in range(T):
    word=input().strip()
    for i in word:
        if(i == "O"):
            o+=1
            score+=o
        if(i == "X"):
            o=0
    result.append(score)
    score=0
    o=0

for idx in range(len(result)):
    print(result[idx])
    
