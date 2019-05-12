public class Task02Ex1 {

    public static void ex1(int[] array) {
        System.out.println("\nЧетные:");
        even(array);
        System.out.println("\nНечетные:");
        odd(array);
    }

    public static void even(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) System.out.print(array[i] + " ");
        }
    }

    public static void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) System.out.print(array[i] + " ");
        }
    }

}
