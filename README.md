# code-school
A repository with programming challenges for begginers.

## How do I participate?
  Just fork this repo and add your code to the file that corresponds to the challenge. Then, just pull request!

#Challenges

### Challenge 1 - *Who are you?*

**Challenge File**- bmi.py
***Current bmi.py is the result of @Patcholito pull request which is working***

Write a python program that interacts with the user and asks for the following information:
* Name
* Age
* Nationality
* Gender
* Height
* Weight
Then, with this information, it calculates and outputs in this format (or something along these lines):
    Hello <*name*>! 
    You have been registered and this is your id: <*id*>
    Your current Body Mass Index is: <*bmi*>
    <*message depending on the BMI here*>

The ID is defined as a String that contains the country's identifier, name, age and gender of the user.
*Formula:* [CountryTag]+[Age]+[Gender]+[Name]

Country Tags that will be used in this challenge:
* PT - Portugal
* FR - France
* IT - Italy
* ES - Spain
* UK - United Kingdom
* DE - Germany

**Example interaction:**
    
    >>What's your name?
    John
    >>How old are you?
    16
    >>Where are you from?
    France
    >>What's your gender?(m/f)
    m
    >>How tall are you?
    170
    >>How much do you weigh?
    67
    >>Hello John!
    >>You have been registered and this is your id: FR16MJOHN
    >>Your current Body Mass Index is: 23
    >>You are within the healthy range!
    
##### *Additional Information*
Check https://en.wikipedia.org/wiki/Body_mass_index for the BMI table.



