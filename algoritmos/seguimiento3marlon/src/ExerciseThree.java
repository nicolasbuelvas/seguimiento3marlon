public class ExerciseThree {
    public static void main(String[] args) {

        String bitString1 = "1011001";
        int count1 = countOnes(bitString1);
        System.out.println("Input: " + bitString1);
        System.out.println("Output: " + count1);

        String bitString2 = "0000000";
        int count2 = countOnes(bitString2);
        System.out.println("Input: " + bitString2);
        System.out.println("Output: " + count2);
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
}