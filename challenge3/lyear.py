
while True:
	year = eval(input("Insert a year: "))
	
	if ((year % 4 ) == 0):
		print ("Noob Year")
		answer = input("Another year? (yes or no?) ")
		if answer == "no":
			break		
	else:
		print ("Not leap")
	
	
	
		answer = input("Another year? (yes or no?) ")
		if answer == "no":
			break
	   
print( "Bye! :D")
