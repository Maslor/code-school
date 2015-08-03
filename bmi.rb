#ruby solution for Challenge 1

puts "What's your name?"
name = gets.chomp
puts "How old are you?"
age = gets.chomp
puts "Where are you from?"
nation = gets.chomp
puts "What's your gender?"
gender = gets.chomp
puts "How much do you weigh?"
weight = gets.chomp
puts "How tall are you?"
height = gets.chomp

	def bmi(weight, height)
		weights = weight.to_i
		heightsq = height.to_i ** 2
		bmi = weights/heightsq
		
	end

	def nationCode(nation)
		nations = {"France"=>"FR","Portugal"=>"PT","Spain"=>"ES","Italy"=>"IT","United Kingdom"=>"UK"}
		final = nations[nation]
	end

	def id(name, country, age, gender)
		id = "#{nationCode(country)}#{age}#{gender}#{name}"
	end

	def finalMessage(id, name, bmi, message)
		puts("Hello #{name}")
		puts("Your code is #{id}")
		puts("Your bmi is: #{bmi}")
		puts("#{message}")
	end

	def bmiIntervals(bmi)
		if bmi<15
			puts "Very Severely underweight!"
		elsif bmi>=15 and bmi < 16
			puts "Severely underweight!"
		elsif bmi >= 16 and bmi < 18.5
			puts "underweight!"
		elsif bmi >= 18.5 and bmi < 25
			puts "healthy!"
		elsif bmi >= 25 and bmi < 30
			puts "Overweight!"
		elsif bmi >= 30 and bmi < 35
			puts "Obese!"
		elsif bmi >=35
			puts "TOO FAT FO DIS" 
		end
	end

bmi = bmi(weight,height)
finalMessage(id(name, nation, age, gender),name,bmi,bmiIntervals(bmi.to_i))

