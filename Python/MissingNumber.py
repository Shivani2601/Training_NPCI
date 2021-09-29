
seq=[]
print("Enter the sequence")
seq=input()
n=len(seq)

print("Enter step size")
step=input()

print("Missin numbers are :")

start=seq[0]
last=seq[n-1]


while(start<last):
    if(seq.count(start+step)==1):
        start=start+step
    else:
        print(start+step) 
        start=start+step   



