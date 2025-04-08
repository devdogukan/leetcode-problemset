import java.util.Stack;

public class RemovingStarsFromAString {

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("erase*****"));
    }

    public static String removeStars(String s) {
        Stack<Character> chars = new Stack<>();

        for (Character character : s.toCharArray()) {
            if (character == '*') {
                chars.pop();
            } else {
                chars.push(character);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            sb.append(ch);
        }

        return sb.toString();
    }
}