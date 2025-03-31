public class LongestSubarrayOfFirstAfterDeletingOneElement {
    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[] {1,1,0,1}));
        System.out.println(longestSubarray(new int[] {0,1,1,1,0,1,1,0,1}));
        System.out.println(longestSubarray(new int[] {1,1,1}));
    }

    public static int longestSubarray(int[] nums) {
        int L = 0, R = 0;
        int deletedCount = 1;
        
        while (R < nums.length) {
            if (nums[R] == 0) {
                deletedCount--;
            }

            if (deletedCount < 0) {
                if (nums[L] == 0) {
                    deletedCount++;
                }
                L++;
            }

            R++;
        }

        return R - L - 1;
    }
}
