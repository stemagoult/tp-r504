def puissance(a,b):
	if not type(a) is int or not type(b) is int:
		raise TypeError("met un nombre entier")
	else:
		result = 1
		for i in range(b):
			result *= a
		return result
