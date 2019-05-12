public class Task02Ex5 {

    public static void ex5(int[] array) {
        System.out.println("\nРасположенные по убыванию модулей:");
        for (int i = 0; i < array.length; i++) System.out.println(sort(array)[i]);
    }

    public static int[] sort(int[] array) {
        for (int j = array.length; j > 0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (Math.abs(array[i + 1]) > Math.abs(array[i])) {
                    array[i] = array[i + 1] + array[i];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                }
            }
        }
        return array;
    }
}
