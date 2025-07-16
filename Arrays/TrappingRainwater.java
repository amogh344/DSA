//given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//auxilary arrays

public class TrappingRainwater {
    public static int trappedRainwater(int height[]) {
        int n=height.length;
        // calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1]=height[n]
        for (int i = n-1); i >1; i--) {
            rightmax[i]=Math.max(rightmax[i+1], height[i])
            
        }
        // loop
        // waterLevel = min(leftmax,rightmax)
        // trapped water = waterLevel - height[i]

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    }

}
