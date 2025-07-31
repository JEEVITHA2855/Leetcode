class Solution {
    public List<Integer> pancakeSort(int[] arr) {
    List <Integer> flips = new ArrayList<>();
        
       for( int val=arr.length;val>0; val--)
       {
        int index=findInd(arr,val);
        if(index==val-1) continue;
        if(index!=0){
            flip(arr,index+1);
            flips.add(index+1);
        }
         flip(arr,val);
            flips.add(val);
       }
       return flips;
    }
    private void flip(int[] arr, int k){
        int left=0, right=k-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    private int findInd(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    
    }
}
