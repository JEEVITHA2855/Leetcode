public class Solution {
    public int reverseBits(int n) {
        int val=0;
        for (int i=0;i<32;i++) {
            val<<=1;
            val|=(n&1);
            n>>=1;
        }
        return val;
    }
}