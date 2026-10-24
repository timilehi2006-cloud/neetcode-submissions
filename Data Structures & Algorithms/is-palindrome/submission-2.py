class Solution:
    def isPalindrome(self, s: str) -> bool:
        new = ''.join(c for c in s.lower() if c.isalnum())
        k,r = 0,len(new) - 1
        while k < r :
            if new[k] == new[r] :
                k += 1
                r -= 1 
            else:
                return False 
        return True 
        