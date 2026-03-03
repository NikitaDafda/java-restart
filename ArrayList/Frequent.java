package ArrayList;

// which element appear frequently after key

import java.util.*;

public class Frequent{

    public static int mostFrequent(ArrayList<Integer> nums, int key) {

        int maxCount = 0;
        int result = -1;

        for (int i = 0; i < nums.size() - 1; i++) {

            if (nums.get(i) == key) {

                int target = nums.get(i + 1);
                int count = 0;

                // count how many times this target appears after key
                for (int j = 0; j < nums.size() - 1; j++) {
                    if (nums.get(j) == key && nums.get(j + 1) == target) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    result = target;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(
                Arrays.asList(1, 100, 200, 1, 100)
        );

        int key = 1;

        System.out.println(mostFrequent(nums, key));  // 100
    }
}
    