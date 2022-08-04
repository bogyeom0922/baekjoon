Sum = []
while True:
    A, B = map(int, input().split())
    if A == B == 0:
        break
    Sum.append(A + B)

for i in range(len(Sum)):
    print(Sum[i])
