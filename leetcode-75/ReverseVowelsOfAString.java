
public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && vowels.indexOf(chars[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(chars[end]) == -1) {
                end--;
            }

            if (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                start++;
                end--;
            }
        }

        return new String(chars);
    }
}