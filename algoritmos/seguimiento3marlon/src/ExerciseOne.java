public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("Welcome. Enter the number of elements the list will have:");
        int n = readInt();

        int[] list = new int[n];

        for (int i = 0; i < n; i++) { // Fixed the loop to start at 0
            System.out.println("Perfect. Now enter number " + (i + 1) + ":");
            list[i] = readInt();
        }

        bubbleSort(list);

        System.out.print("R = [");
        boolean first = true;
        int i = 0;

        while (i < list.length) {
            int current = list[i];
            int count = 1;

            while (i + 1 < list.length && list[i + 1] == current) {
                count++;
                i++;
            }

            if (count > 1) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(current);
                first = false;
            }
            i++;
        }
        System.out.println("]");
    }

    public static int readInt() {
        int num = 0;
        boolean valid = false;
        while (!valid) {
            try {
                num = Integer.parseInt(readLine());
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer:");
            }
        }
        return num;
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

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}