import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DetermineIfTwoStringsAreClose {

    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
        System.out.println(closeStrings("a", "aa"));
        System.out.println(closeStrings("cabbba", "abbccc"));
    }

    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) return false;

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : word1.toCharArray()) {
            set1.add(c);
        }

        for (char c : word2.toCharArray()) {
            set2.add(c);
        }

        if (set1.size() != set2.size() || !set1.containsAll(set2)) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (Character character : word1.toCharArray()) {
            if (!map1.containsKey(character)) {
                map1.put(character, 1);
            } else {
                map1.put(character, map1.get(character) + 1);
            }
        }

        for (Character character : word2.toCharArray()) {
            if (!map2.containsKey(character)) {
                map2.put(character, 1);
            } else {
                map2.put(character, map2.get(character) + 1);
            }
        }

        List<Integer> values1 = new ArrayList<>(map1.values());
        List<Integer> values2 = new ArrayList<>(map2.values());
        Collections.sort(values1);
        Collections.sort(values2);
        return values1.equals(values2);
    }
}