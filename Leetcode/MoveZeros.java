public class MoveZeros {
    public static void main(String[] args) {
        moveZeroes(new int[] {0,1,0,3,12});
    }

    public static void moveZeroes(int[] nums) {
        int prev = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[prev] == 0) {
                int temp = nums[prev];
                nums[prev] = nums[i];
                nums[i] = temp;
            }

            if (nums[prev] != 0) {
                prev++;
            }
        }
    }
}
