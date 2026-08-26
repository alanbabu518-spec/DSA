class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_Left = height[left];
        int max_Right = height[right];
        int water = 0;

        while (left < right) {
            if (max_Left <= max_Right) {
                left++;
                max_Left = Math.max(max_Left, height[left]);
                water += max_Left - height[left];
            }
            else{
                right--;
                max_Right = Math.max(max_Right,height[right]);
                water += max_Right - height[right];
            }

        }
        return water;
    }
}