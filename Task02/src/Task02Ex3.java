public class Task02Ex3 {
    // Не очень понятно, что нужно сделать. Что на 3 делится, в делится на 9 по-любому попадает же.
    public static void ex3(int[] array) {
        System.out.print("\nЧисла, которые делятся на 3 или на 9: ");
        div3(array);
        //       div9(array);
    }

    public static void div3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) System.out.print(array[i] + " ");
        }
    }

    public static void div9(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 9 == 0) System.out.print(array[i] + " ");
        }
    }
}
