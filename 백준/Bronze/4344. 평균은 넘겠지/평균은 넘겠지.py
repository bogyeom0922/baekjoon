C = int(input())

for _ in range(C):
    count = 0
    score = list(map(int, input().split()))
    avg = (sum(score) - score[0]) / score[0]
    for i in range(score[0]):
        if score[i+1] > avg:
            count += 1
    result = count / score[0] * 100
    print(f'{result:.3f}%')