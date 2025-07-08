class Solution {
    private int sumOfSquares(int n) {
        int s= 0;
        while (n > 0) {
            int dig=n % 10;
            s+=dig*dig;
            n /= 10;
        }
        return s;
    }

    public boolean isHappy(int n) {
        int sl=n,f= n;
        while ((f=sumOfSquares(sumOfSquares(f)))!= 1 && sl!=f) {
            sl=sumOfSquares(sl);
        }
        return f==1;
    }
}
