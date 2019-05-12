public class Task02Ex4 {

    public static void ex4(int[] array) {
        System.out.print("\nЧисла, которые делятся на 5 и на 7: ");
        div35(array);
    }

    public static void div35(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 35 == 0) System.out.print(array[i] + " ");
        }
    }
}
