package arrays;

public class prefix {

    public static void maxSub(int array[]) {
        int n = array.length;
        int max = Integer.MIN_VALUE;

        int prefix[] = new int[n];
        prefix[0] = array[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println("Max sum is " + max);
    }

    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        maxSub(array);
    }
}
