class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> st=new Stack<>();

        int n=heights.length;
        int[] nse=new int[n];
        for(int i=n-1;i>=0;i--){
            int curr=heights[i];
           while (!st.isEmpty() && curr <= heights[st.peek()])
{
                st.pop();
            }
            nse[i]=st.isEmpty() ? n:st.peek();
            st.push(i);
        }
        st.clear();
        int[] pse=new int[n];
        for (int i = 0; i < n; i++){
            int curr=heights[i];
         while (!st.isEmpty() && curr <= heights[st.peek()]){

                st.pop(); 
        }
        pse[i]=st.isEmpty() ? -1 :st.peek();
        st.push(i);
    }
    int max=0;
    for(int i=0;i<n;i++){
        int area=heights[i]*(nse[i]-pse[i]-1);
        max=Math.max(max,area);
    }
    return max;
}
}
