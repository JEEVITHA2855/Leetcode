class Solution:
    def lengthOfLastWord(self, s):
        return len(s.strip().split()[-1]) if s.strip() else 0
