incr=3

rows=3
first=1

n=2*rows-2

for i in range(0, rows):
    for j in range(0, n):
        print(end=" ") 
    n=n-1
    y=first
    for j in range(0, i+1):
        print(y, end=" ")
        y+=1
    first+=incr
    print(" ")    

print("\n")
    
##########################################

first_ele=0
total_sum=1

for i in range(0,rows):
    if(i==0):
        print("Row 1 = 1")
        first_ele=1+incr
    else:
        row_sum=0
        x=first_ele
        for j in range(0,i+1):
            row_sum+=x
            x+=1
        print("Row ", i+1, " = ",row_sum)
        total_sum+=row_sum  

        first_ele+=incr    

print("Total sum : ", total_sum, "\n")

##########################################################

Matrix = [[0 for x in range(3)] for y in range(3)]

x=1


for i in range(2,-1,-1):
    y=x
    for j in range(0,3-i):
        Matrix[i][j]=y
        y=y+1
    x=x+incr

for i in range(0,3):
    print(Matrix[i])

print("\n")
##########################################################

for i in range(0,3):
    for j in range(0,3):
        Matrix[i][j]=Matrix[i][j]*Matrix[i][j] 

print("Square of matrix : ")
for i in range(0,3):
    print(Matrix[i])        
     





