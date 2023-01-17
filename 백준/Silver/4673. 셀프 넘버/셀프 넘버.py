def d(n):
    x = n+int(n/10000)+int(n/1000%10)+int(n/100%10)+int(n/10%10)+int(n%10)
    return(x)

list=[]

for i in range(1,10001):
    list.append(i)
for i in range(1,10001):
    a = int(d(i))
    if a in list:
        list.remove(a)
for i in list:
    print(i)

