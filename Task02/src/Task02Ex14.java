public class Task02Ex14 {


    public static void ex14(int[] array) {

        System.out.println("\nЧисла равные полусумме соседних:");

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == (array[i - 1] + array[i + 1]) / 2.0)
                System.out.print(array[i] + " ");
        }
    }
}



