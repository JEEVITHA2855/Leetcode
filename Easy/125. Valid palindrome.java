class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();

        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        
        StringBuilder reversed = new StringBuilder(cleaned).reverse();
        return cleaned.toString().equals(reversed.toString());
    }
}
