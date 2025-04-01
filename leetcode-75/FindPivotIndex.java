public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 }));
        System.out.println(pivotIndex(new int[] { 1, 2, 3 }));
        System.out.println(pivotIndex(new int[] { 2, 1, -1 }));
    }

    public static int pivotIndex(int[] nums) {

        int leftSum = 0;
        int rigtSum = 0;

        for (int i = 0; i < nums.length; i++) {
            rigtSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            rigtSum -= nums[i];

            if (leftSum == rigtSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}
