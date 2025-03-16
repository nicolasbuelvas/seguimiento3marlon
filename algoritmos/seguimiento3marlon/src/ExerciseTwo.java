public class ExerciseTwo {
    public static void main(String[] args) {

        String word1 = "reconocer";
        boolean result1 = isPalindrome(word1);
        System.out.println("Input: " + word1);
        System.out.println("Output: " + result1);

        String word2 = "hola";
        boolean result2 = isPalindrome(word2);
        System.out.println("Input: " + word2);
        System.out.println("Output: " + result2);
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
}