class Solution(object):
    def secondHighest(self, s):
        """
        :type s: str
        :rtype: int
        """
        digits = {int(c) for c in s if c.isdigit()}  
        if len(digits) < 2:
            return -1 
        return sorted(digits, reverse=True)[1]  