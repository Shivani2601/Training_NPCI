

rows=5
x=1
m = (2 *rows) - 2  
for i in range(0, rows):  
    for j in range(0, m):  
        print(end=" ")  
    m = m - 1  
    for j in range(0, i + 1):  
        print(x, end=' ')  
    x=x+2    
    print(" ")  

print("\n")
x=1
for i in range(0, rows):
    print(i ,"*", x ,"=", i*x )
    x+=2
