import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));
        System.out.println(uniqueOccurrences(new int[] { 1, 2 }));
        System.out.println(uniqueOccurrences(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> ht = new HashMap<>();

        for (int num : arr) {
            if (!ht.containsKey(num)) {
                ht.put(num, 1);
            } else {
                ht.put(num, ht.get(num) + 1);
            }
        }

        Set<Integer> set = new HashSet<>();
        for (Integer value : ht.values()) {
            if (set.contains(value)) {
                return false;
            }

            set.add(value);
        }

        return true;
    }
}
