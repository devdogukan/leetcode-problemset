public class FindMaxAverage {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        System.out.println(findMaxAverage(new int[] {5}, 1));
        System.out.println(findMaxAverage(new int[] {-1}, 1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double result = Integer.MIN_VALUE;

        int leftPointer = 0, rigthPointer = k - 1;
        
        while (rigthPointer < nums.length) {
            int sum = 0;
            for (int i = leftPointer; i <= rigthPointer; i++) {
                sum += nums[i];
            }

            if (sum > result) {
                result = sum;
            }

            leftPointer++;
            rigthPointer++;
        }

        return result / k;
    }
}
