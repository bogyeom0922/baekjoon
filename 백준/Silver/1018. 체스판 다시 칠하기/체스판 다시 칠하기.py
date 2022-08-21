N, M = map(int, input().split())
chess = []
count = []

for _ in range(N):
    chess.append(input())



for row in range(N - 7):
    for col in range(M - 7):
        w_start = 0
        b_start = 0
        for i in range(row, row + 8):
            for j in range(col, col + 8):
                if (i + j) % 2 == 0:
                    if chess[i][j] != 'W':
                        w_start += 1
                    if chess[i][j] != 'B':
                        b_start += 1
                else:
                    if chess[i][j] != 'B':
                        w_start += 1
                    if chess[i][j] != 'W':
                        b_start += 1
        count.append(min(w_start, b_start))

print(min(count))
