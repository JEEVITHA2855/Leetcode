class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,maxLen=0,zeroC=0;

        for (int right=0;right<nums.length;right++) {
            if (nums[right]==0) {
                zeroC++;
            }

            while (zeroC>k) {
                if (nums[left]==0) {
                    zeroC--;
                }
                left++;
            }

            maxLen = Math.max(maxLen,right-left+ 1);
        }

        return maxLen;
    }
}
