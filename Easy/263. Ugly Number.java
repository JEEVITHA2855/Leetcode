class Solution {
    public boolean isUgly(int n) {
        if (n<=0) return false;
        return checkUgly(n);
    }
    
    private boolean checkUgly(int n) {
        if (n==1) return true;
        if (n%2==0) return checkUgly(n/2);
        if (n%3==0) return checkUgly(n/3);
        if (n%5==0) return checkUgly(n/5);
        return false;
    }
}