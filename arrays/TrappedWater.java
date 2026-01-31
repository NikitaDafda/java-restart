package arrays;

public class TrappedWater {
    public static int TrappedWater(int height[]) {
        int n = height.length;

        // max left array
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        // max right array
        int maxRight[] = new int[n];
        maxRight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        // calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrappedWater(height)); // 11
    }
}
