class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
while (left < right) {

int minHeight = Math.min(height[right],height[left]);
max=Math.max(max, minHeight*(right-left)) ;
if (height[left]<height[right]) left++;
else right--;
 }
 return max;
}}