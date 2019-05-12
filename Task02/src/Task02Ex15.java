public class Task02Ex15 {

    public static void ex15(int[] array) {

        System.out.println("\nПериод десятичной дроби p = m/n для первых двух целых положительных чисел n и m, расположенных подряд:");
        p(array);
    }

    public static boolean p(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] > 0) && (array[i + 1]) > 0) {
                System.out.print(array[i + 1] / array[i]);
                return true;
            }
        }
        return false;
    }
}