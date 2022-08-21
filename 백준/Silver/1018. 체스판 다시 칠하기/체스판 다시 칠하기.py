N, M = map(int, input().split())
chess = []
count = []

for _ in range(N):
    chess.append(input())

for row in range(N-7):
    for col in range(M-7):
        index1 = 0
        index2 = 0
        for i in range(row, row + 8):
            for j in range(col, col + 8):
                if (i + j) % 2 == 0:
                    if chess[i][j] != 'W':
                        index1 += 1
                    if chess[i][j] != 'B':
                        index2 += 1
                else:
                    if chess[i][j] != 'B':
                        index1 += 1
                    if chess[i][j] != 'W':
                        index2 += 1
        count.append(min(index1, index2))

print(min(count))