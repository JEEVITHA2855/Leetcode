class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder c=new StringBuilder();
        for (char ch:s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                c.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder rev=new StringBuilder(c).reverse();
        return c.toString().equals(rev.toString());
    }
}
