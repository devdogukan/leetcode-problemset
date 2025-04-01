public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 }));
        // System.out.println(pivotIndex(new int[] { 1, 2, 3 }));
        // System.out.println(pivotIndex(new int[] { 2, 1, -1 }));
    }

    public static int pivotIndex(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                leftSum += nums[j];
            }

            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                return i;
            }

            leftSum = 0;
            rightSum = 0;
        }

        return -1;
    }
}
