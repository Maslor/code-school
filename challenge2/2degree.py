# ax**2 + bx + c = 0

import math
a = eval(input('a : '))
b = eval(input('b : '))
c = eval(input('c : '))

d = (b**2) - (4*a*c)

sol1 = (-b-math.sqrt(d)) /(2*a)
sol2 = (-b+math.sqrt(d)) /(2*a)

print('The solution are %f and %f '%(sol1,sol2))



