class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLen = 0, right=0;
        while (right < s.length()){
            char curr= s.charAt(right);
            if(!seen.contains(curr)){
                seen.add(curr);
                maxLen=Math.max(maxLen,right-left+1);
                right++;
            }
            else{
                seen.remove(s.charAt(left));
                left++;
            }
            }
            return maxLen;
        }
        
    }
