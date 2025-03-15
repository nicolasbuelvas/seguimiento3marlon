public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6};

        System.out.print("R = [");
        boolean first = true;
        int i = 0;

        while (i < list.length) {
            int current = list[i];
            int contador = 1;

            while (i + 1 < list.length && list[i + 1] == current) {
                contador++;
                i++;
            }

            if (contador > 1) {
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
}