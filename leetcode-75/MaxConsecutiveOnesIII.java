public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2));
        System.out.println(longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
        System.out.println(longestOnes(new int[] {1,0,0,0}, 2));
    }
    
    public static int longestOnes(int[] nums, int k) {
        
        int L = 0, R = 0;
        int flippedCount = 0;

        while (R < nums.length) {
            
            if (nums[R] == 0) {
                k--;
            }

            if (flippedCount > k) {
                if (nums[L] == 0) {
                    k++;
                }
                L++;
            }

            R++;
        }

        return R - L;
    }
}