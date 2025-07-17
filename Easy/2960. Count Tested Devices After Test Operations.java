class Solution {
    public int countTestedDevices(int[] nums) {
        int count=0;
            for (int i=0;i<nums.length;i++){
                if(nums[i]>count){
                    count++;
                }
            }
            return count;
    }
}
