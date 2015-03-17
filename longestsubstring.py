def longestsubstring(A):
    length = len(A)
    longest = 1
    newlong = 1
    startpos = 0
    i = startpos+1
    while i < length:
        j = i-1
        exists = False
        while j >= startpos:
            if A[i] == A[j]:
                exists = True
                startpos = j+1
                i = startpos+1
                break
            j-=1
        if not exists:
            newlong+=1
            i+=1
            longest = max(longest, newlong)
        else:
            newlong = 1
        
    return longest


def dp(A,n, longest):
    for i in range(1,n):
        for j in range(0, i):
            if A[i] == A[j]:
                longest[i] = longest[j]
            else:
                longest[i] = longest[j] + 1
    
    

array = ['a','b','c','a','m','d','e','f','t','g','h']#['a','b','a','c','d','e', 'a', 'b','c','e']
longest = []
n = len(array)
for i in range(0,n):
    longest.append(1)
dp(array, n, longest)
print longest[n-1]

# subproblem - whats max non repeating length at i for i <= n
# guess - two conditions add to longest str or no
# recursion
# dp[i] = max (dp[i-1], dp[i-1] + 1 if i > 0
