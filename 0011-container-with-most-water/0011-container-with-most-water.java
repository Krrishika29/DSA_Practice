class Solution {
    public int maxArea(int[] height) {
        int left=0, right = height.length-1;
        int maxar=0;
        while(left<right){
            int width = right - left ;
            int ht= Math.min(height[left], height[right]);
            int area= ht *width;
            maxar= Math.max(maxar, area);
            if (height[left]< height[right]){
                left ++;
            }
            else{
                right --;
            }
        }
        return maxar;
    }
}