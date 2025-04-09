import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
        //System.out.println(decodeString("3[a2[c]]"));
        //System.out.println(decodeString("2[abc]3[cd]ef"));
    }

    public static String decodeString(String s) {
        
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int index = 0;

        while (index < s.length()) {
            char currentChar = s.charAt(index);

            if (Character.isDigit(currentChar)) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            } else if (currentChar == '[') {
                stringStack.push(currentString.toString());
                currentString.setLength(0); // Reset currentString
                index++;
            } else if (currentChar == ']') {
                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                int repeatCount = countStack.pop();
                for (int i = 0; i < repeatCount; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
                index++;
            } else {
                currentString.append(currentChar);
                index++;
            }
        }

        return currentString.toString();
    }
}
