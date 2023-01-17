students=[]
for i in range(1,31):
    students.append(int(i))
for _ in range(28):
    a = int(input())
    students.remove(a)
print(students[0])
print(students[1])
