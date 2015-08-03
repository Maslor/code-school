name = input  ("What's your name?")
age = input ("How old are you?")
country = input ("Where are you from?")
gender = input ("What's your gender?(m/f)")
height = eval(input ("How tall are you?"))
weight = eval(input ("How much do you weigh?(kilos)"))

countrytag = {'Portugal' : 'PT', 'France' : 'FR' , 'Italy' : 'IT' , 'Spain' : 'ES' , 'Germany' : 'DE'}

id = countrytag[country] + str(age) + gender + name 

bmi = weight/(height * height)

def intervalo(bmi):
	if bmi <= 15:
		return "Very severely underweight"
		
	elif bmi >= 15.0 and bmi <= 16.0:
		return "Severely underweight"
			
	elif bmi >= 16.0 and bmi <= 18.5: 
		return "Underweight"
				
	elif bmi >= 18.5 and bmi <= 25: 
		return "Normal (healthy weight)"
					
	elif bmi >= 25 and  bmi <= 30: 
		return "Overweight"
						
	elif bmi >= 30 and bmi <= 35: 
		return "Obese Class I (Moderately obese)"

print ("Hello " + name + " ! You have been registered and this is your id: " + id + " Your current Body Mass Index is: " + str(bmi) + intervalo(bmi) )
