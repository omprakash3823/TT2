package TT2.Stack;

public class rain_water_trap {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax)
                    leftMax = height[left];               //{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
                else
                    ans += (leftMax - height[left]);
                left++;
            } else {
                if (height[right] >= rightMax)
                    rightMax = height[right];
                else
                    ans += (rightMax - height[right]);
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = trap(arr);
        System.out.println(ans);
    }
}
