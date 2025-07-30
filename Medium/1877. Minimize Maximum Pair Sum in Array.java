class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int right=nums.length-1, left=0;
        int max=0;
        while(left<right){
            int sum=nums[left]+nums[right];
            max=Math.max(max,sum);
            left++;
            right--;
        }
        return max;
    }
}
