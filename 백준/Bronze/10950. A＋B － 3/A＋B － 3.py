import sys

read = sys.stdin.readline
T = int(read())
# 공백을 기준으로 들어온 두 숫자를 sum() 함수로 합친 값을 result 에 추가.
result = [sum(map(int, read().split())) for _ in range(T)] 

print(*result, sep='\n')