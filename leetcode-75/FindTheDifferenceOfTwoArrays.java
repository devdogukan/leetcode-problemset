import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {

    public static void main(String[] args) {
        System.out.println(findDifference(new int[] { 1, 2, 3 }, new int[] { 2, 4, 6 }));
        System.out.println(findDifference(new int[] { 1, 2, 3, 3 }, new int[] { 1, 1, 2, 2 }));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        for (int num : set1) {
            if (!set2.contains(num)) {
                list.get(0).add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                list.get(1).add(num);
            }
        }

        return list;
    }
}