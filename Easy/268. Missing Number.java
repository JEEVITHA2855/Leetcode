class Solution {
    public int missingNumber(int[] nums) {
       int actSum=0; int exSum=0;
        int n=nums.length;
            
        exSum=n*(n+1)/2;
            for (int num : nums){
                actSum=actSum+num;
            }
            return exSum-actSum;

        }
    
      
    }
