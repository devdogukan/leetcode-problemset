public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        String result = "";
        
        String[] array = s.trim().split("\\s+");

        for (int i = array.length - 1; i >= 0 ; i--) {
            result += array[i] + ' ';
        }

        return result.strip();
    }
}