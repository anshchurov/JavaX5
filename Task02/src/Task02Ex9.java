import java.util.Arrays;

//ну или там раньше была сортировка пузырьком
public class Task02Ex9 {
    public static void ex9(int[] array) {
        Arrays.sort(array);
        System.out.println("\nСортировка по возрастанию:");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println("\nСортировка по убыванию:");
        for (int i = 0; i < array.length; i++) System.out.print(array[array.length - i - 1] + " ");
    }
}
