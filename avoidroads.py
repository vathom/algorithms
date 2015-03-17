#Subproblem:
#Whats the no. of ways to get to a point P[i][j] for i<=W & j<=H
#Guess:
#2 options, one from left, one from below
#Recurrence:
#P[i][j] = p[i-1][j] + p[i][j-1]


def numways(w, h):
    ways = [][]
    for i in range(0,w):
        for j in range(0,h):
            if i == 0 and j!= 0:
                ways[i][j] = 1
            elif i != 0 and j == 0:
                ways[i][j] = 1
            else:
                ways[i][j] = 0
    for i in range(1,w):
        for j in range(1,h):
            ways[i][j] = ways[i-1][j] + ways[i][j-1]

    allways = ways[w-1] + ways[h-1]
    return allways

print numways(10,10)
    
            

