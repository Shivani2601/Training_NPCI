
list1=[3,5,7,1,4,9,10]



status=True

while(status==True):

    print(" \n Press 1 to add new element to list \n Press 2 to create dict from list \n Press 3 sort dictionary in descending order based on value \n Enter 0 to exit")
    num=int(input())
    if num==1:
        element= int(input("Enter the element"))
        list1.append(element)
        print(list1)

    elif num==2:
        dict1={ls:ls for ls in list1 }
        print(dict1)

    elif num==3:
        res = sorted(dict1.items(), key=lambda x: x[1])

        for i in res:
	        print(i[0], i[1])    

    elif num==0:
        status=False;       





    



  
  