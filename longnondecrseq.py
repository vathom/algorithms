def longnondecsubseq(A, n):
    l = []
    for i in range(0, n):
        l.append(1)
    for i in range(1,n):
        for j in reversed(range(i)):
            l[i] = max(l[i], l[i-j]+1)
    return l[n-1]


A = [1,4,2,3,4,2,5,6,7,1,2,4,6,7]
print longnondecsubseq(A, len(A))
