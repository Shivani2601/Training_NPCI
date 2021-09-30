
Atm_currency= {100:2,
               200:3,
               500:10,
               2000:5}    

print(Atm_currency)               

atm_balance=0               

for k,v in Atm_currency.items():
    atm_balance+= k*v


#************************************

debitCard_balance=10000

mini_statement=[]
status= 1

while(status!=0):

    print(" \n Press 1 to withdraw \n Press 2 to check mini statement \n Enter 0 to exit")
    option=int(input())

    if option==1:
        amount= int(input("Enter the amount you want to withdraw "))

        if amount>debitCard_balance:
            print("Insufficient balance ")

        elif amount>(90/100*atm_balance) and (amount<debitCard_balance):    
            print("Cannot withdraw.Please enter lesser amount")

        else:
            debitCard_balance=debitCard_balance-amount

            atm_balance=atm_balance-amount; 

            if(len(mini_statement)<3):
                mini_statement.append(amount)
            else:
                mini_statement.pop(0)    
                mini_statement.append(amount)

            print("*******************MINI STATEMENT******************")        
            for i in mini_statement:
                print("You had withdrawn ",i)

            print("Balance ", debitCard_balance)    


    if option==2:
        print("*******************MINI STATEMENT******************")

        if(len(mini_statement)==0):
            print("NO TRANSACTIONS MADE")

        else:
            for i in mini_statement:
                print("You had withdrawn ",i)

        print("Balance ", debitCard_balance)  

    if option==0:
        status=0    


print("*********************THANK YOU****************************")


