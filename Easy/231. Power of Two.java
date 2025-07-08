class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1) return true;
        if (n%2!=0) return false;
        while (n>=2 && n%2==0){
            if(n==2) return true;
            else n=n/2;
        }
        return false;
    }
}