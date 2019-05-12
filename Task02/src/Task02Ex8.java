public class Task02Ex8 {

    public static void ex8(int[] array) {

        int x = Task02Ex2.max(array);
        System.out.println("\nПростые числа:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0 && sieveOfEratosthenes(x)[array[j] - 1] == 2) {
                System.out.print(array[j] + " ");
            }
        }
    }

    public static int[] sieveOfEratosthenes(int x) {

        int[] array2 = new int[x];
        for (int j = 0; j < x; j++) {
            array2[j] = 0;
        }

        for (int j = 1; j < x; j++) {
            if (array2[j] == 0) {
                array2[j] = 2;
                for (int i = 2 * j + 1; i < x; i += j + 1) {
                    array2[i] = 1;
                }
            }
        }

        return array2;
    }

/*    public static boolean simple(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }*/
}
