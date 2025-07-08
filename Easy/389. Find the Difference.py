class Solution:
    def findTheDifference(self, first, second):
        diff = 0
        for ch in first:
            diff^=ord(ch)
        for ch in second:
            diff^=ord(ch)
        return chr(diff)
