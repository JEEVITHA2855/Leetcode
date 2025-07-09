class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int sum =0;
        int temp=n;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        if(temp%sum==0){
            return sum;
        }
        return -1;
    }
}