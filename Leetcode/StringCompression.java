public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress(new char[] {'a','a', 'b', 'b', 'c', 'c', 'c', 'c'}));
    }

    public static int compress(char[] chars) {
        int index = 0, i = 0;
        
        while (i < chars.length) {
            int j = i;

            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            chars[index++] = chars[i];
            if (j - i > 1) {
                String count = j - i + "";

                for (char ch : count.toCharArray()) {
                    chars[index++] = ch;
                }
            }

            i = j;
        }

        return index;
    }
}
