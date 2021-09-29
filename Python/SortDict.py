
dict1={'one':'papaya', 
       'two':'banana',
       'three': 'apple',
       'four':'kiwi',
       'five': 'mango' }

       
res = sorted(dict1.items(), key=lambda x: x[1])

for i in res:
	print(i[0], i[1])       