public class Task02Ex2 {

    public static void ex2(int[] array) {
        System.out.println("\nНаибольшее число: " + max(array));
        System.out.println("Наименишее число: " + min(array));
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > max) max = array[i + 1];
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < min) min = array[i + 1];
        }
        return min;
    }
}

