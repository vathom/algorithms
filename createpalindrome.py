# Creates a palindrome by adding any leading characters 0 or more
# Return the length of shortest palindrome created
def createpalindrome(str, start, end):
    if start == end:
        return 0
    if ispalindrome(str, start, end):
        return 0;

    required = 1 + createpalindrome(str, start, end-1)
    return required
        
    
def ispalindrome(str, start, end):
    while start < end:
        if str[start] != str[end]:
            return False;
        start+=1
        end-=1
    return True


str = 'rbaabaabra'
start = 0
end = len(str)-1
value = createpalindrome(str, start, end)
print value + len(str)

