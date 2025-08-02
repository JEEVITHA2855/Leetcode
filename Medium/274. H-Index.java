class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int count=0;
        for(int i=0;i<n;i++){
            int size=n-i;
            if(citations[i]>=size){
                count=size;
                break;
            }
        }
        return count;
    }
}
