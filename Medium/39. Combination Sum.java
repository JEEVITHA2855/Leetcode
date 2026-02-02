class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> res=new ArrayList<>();
        rec(0,target,candidates, new ArrayList<>(), res);
        return res;
    }

    
    void rec(int start,int rem,int[] candidates, List<Integer> ans, List<List<Integer>> res){
        if(rem==0) {
        res.add(new ArrayList<>(ans));
            return;
        }
            if (rem<0) return;
            for(int i=start;i<candidates.length;i++){
                ans.add(candidates[i]);
                rec(i,rem-candidates[i],candidates,ans,res);
              
                ans.remove(ans.size()-1);
            }
        }
}
