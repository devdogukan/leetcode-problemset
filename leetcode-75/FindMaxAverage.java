public class FindMaxAverage {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        System.out.println(findMaxAverage(new int[] {5}, 1));
        System.out.println(findMaxAverage(new int[] {-1}, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int result = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        result = Math.max(result, sum);

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];

            result = Math.max(result, sum);
        }

        return (double)result / k;
    }
}
