class Solution:
    def reverseWords(self, text):
        return ' '.join(word[::-1] for word in text.split())
