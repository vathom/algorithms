# Given a list of people, find which one is celebrity.
# 
def findcelebrity():
	people = [10,11,12,13,14,15]
	celeb_index = 0
	
	for i in range(1, len(people)):
		if knows(people[celeb_index], people[i]):
			celeb_index = i
		elif knows(people[i], people[celeb_index]):
			celeb_index = celeb_index
		elif i+1 < N:
				celeb_index = i+1
				i+=1
			
	isCeleb = False
	for i in range(0, len(people)):
		if i != celeb_index and knows(people[i], people[celeb_index]) and not knows(people[celeb_index], people[i]):
			isCeleb = True
		else:
			isCeleb = False
	
	if isCeleb:
		print (people[celeb_index])
	else:
		print (-1)
		
	

def knows(i,j):
	if i == 12:
		return False
	else:
		return True		
	
findcelebrity()