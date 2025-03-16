public class ExerciseThree {
    public static void main(String[] args) {
        System.out.println("Welcome. Enter a binary string to count the number of 1s:");
        String bitString = readLine();

        int count = countOnes(bitString);
        System.out.println("Input: " + bitString);
        System.out.println("Output: " + count);
    }

    public static int countOnes(String bitString) {
        int count = 0;
        for (int i = 0; i < bitString.length(); i++) {
            if (bitString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
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