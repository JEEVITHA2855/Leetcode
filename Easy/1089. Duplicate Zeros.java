class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] newarr = new int[n+n];
        int a=0;
        for(int i=0;i<n;i++){
            newarr[a++]=arr[i];
            if(arr[i]==0){
                newarr[a++]=0;
            }
            
        }
        for(int i=0;i<n;i++){
            arr[i]=newarr[i];
        }
    }
    
}
