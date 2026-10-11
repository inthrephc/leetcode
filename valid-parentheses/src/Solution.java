public class Solution {
    public static boolean isValid(String s) {
        char[] stack = new char[1001];
        if (s.length() % 2 != 0) return false;
        stack[0] = s.charAt(0);
        int stringIdx = 1, stackIdx = 0;

        while (stringIdx < s.length()) {
            switch (stack[stackIdx]) {
                case '(':
                    if (')' != s.charAt(stringIdx)) {
                        stackIdx++;
                        stack[stackIdx] = s.charAt(stringIdx);
                    } else {
                        stack[stackIdx] = '0';
                        if (stackIdx > 0) stackIdx--;
                    }
                    break;
                case '[':
                    if (']' != s.charAt(stringIdx)) {
                        stackIdx++;
                        stack[stackIdx] = s.charAt(stringIdx);
                    } else {
                        stack[stackIdx] = '0';
                        if (stackIdx > 0) stackIdx--;
                    }
                    break;
                case '{':
                    if ('}' != s.charAt(stringIdx)) {
                        stackIdx++;
                        stack[stackIdx] = s.charAt(stringIdx);
                    } else {
                        stack[stackIdx] = '0';
                        if (stackIdx > 0) stackIdx--;
                    }
                    break;
                default:
                    if (stackIdx != 0) stackIdx++;
                    stack[stackIdx] = s.charAt(stringIdx);
                    stringIdx++;
                    continue;
            }

            stringIdx++;
        }

        return stack[0] == '0';
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}