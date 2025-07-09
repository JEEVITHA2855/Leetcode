class Solution {
    public List<Integer> findDuplicates(int[] nums) {
         Set<Integer> seen = new HashSet<>();
        Set<Integer> dupl = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                dupl.add(num);
            }
        }
        return new ArrayList<>(dupl);
    }
}