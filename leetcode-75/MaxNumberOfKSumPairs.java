import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {
    public static void main(String[] args) {
        System.out.println(maxOperations(new int[] {1,2,3,4}, 5));
        System.out.println(maxOperations(new int[] {3,1,3,4,3}, 6));
    }

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int diff = k - num;

            if (map.containsKey(diff) && map.get(diff) > 0) {
                // if map include diff and map.get(diff) greater then 0
                count++;
                map.put(diff, map.get(diff) - 1);
            } else {
                // if map not include the num or map.get(diff) is 0
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}
