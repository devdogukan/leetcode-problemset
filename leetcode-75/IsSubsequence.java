public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int pointerL = 0, pointerR = 0;

        while (pointerL < s.length() && pointerR < t.length()) {
            if (s.charAt(pointerL) == t.charAt(pointerR)) {
                pointerL++;
            }

            pointerR++;
        }

        if (pointerL == s.length()) {
            return true;
        }

        return false;
    }
}
