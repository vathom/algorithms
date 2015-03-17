#subproblem:
#length of common subsequence L[i][j] for i<= M - chars in str1 and j<=N - chars in str2
#guess:
#either it matches or it doesnt match
#recursion:
#

def longcommonsequence(stra, strb, m, n):


def coins(A, sum):
    n = len(A)
    S = [0]
    for i in range(0,n):
        for s in range(1,sum+1):
            if i >= A[s]:
                S[i] = min(S[i], S[i-A[s]]+1)
            
