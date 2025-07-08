class Solution {
    public int[] intersection(int[] arr1, int[] arr2){
        HashSet <Integer> set1=new HashSet <>();
          HashSet <Integer> result=new HashSet <>();
          for (int num : arr1){
              set1.add(num);
          }
          for (int num:arr2){
          if (set1.contains(num)){
              result.add(num);
          }
        
    } int[] resArr =new int[result.size()];
    int i=0;
    for (int val : result){
        resArr[i++]=val;
    }
   
    return resArr;
}}