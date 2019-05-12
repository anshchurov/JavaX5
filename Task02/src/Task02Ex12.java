public class Task02Ex12 {

    public static void ex12(int[] array) {

        System.out.println("\nЧисла Фибоначчи: ");
        for (int j = 0; j < array.length; j++) {
            if (fibonacci(array[j]) == true) System.out.print(array[j] + " ");
        }
    }

    public static boolean fibonacci(int n) {
        double m1 = Math.sqrt(5 * n * n + 4);
        double m2 = Math.sqrt(5 * n * n - 4);
        if (m1 == (int) m1 || m2 == (int) m2) return true;
        else return false;
    }
}
