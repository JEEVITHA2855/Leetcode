class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> st=new Stack<>();
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
            int curr=nums[i%n];
            while(!st.isEmpty() && curr>=st.peek()){
                st.pop();
            }
            if(i<n) {
                nums[i]=st.isEmpty()?-1:st.peek();
            }
            st.push(curr);
        }
        return nums;
    }
}
