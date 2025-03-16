public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println("Welcome. Enter a word to check if it's a palindrome:");
        String word = readLine();

        boolean result = isPalindrome(word);
        System.out.println("Input: " + word);
        System.out.println("Output: " + (result ? "verdadero" : "falso"));
    }

    public static boolean isPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String readLine() {
        String input = "";
        try {
            char c;
            while ((c = (char) System.in.read()) != '\n') {
                input += c;
            }
        } catch (Exception e) {
            return "";
        }
        return input.trim();
    }
}