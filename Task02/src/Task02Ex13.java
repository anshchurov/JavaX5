public class Task02Ex13 {

    public static void ex13(int[] array) {

        System.out.println("\nЧисла - палиндромы:");

        for (int j = 0; j < array.length; j++) {
            if (palindrome(array[j])) System.out.print(array[j] + " ");
        }
    }

    public static boolean palindrome(int n) {
        String[] array = Task02Ex6.toArray(n);
        for (int i = 0; i < array.length / 2; i++) {
            if (!array[i].equals(array[array.length - 1 - i]))
                return false;
        }
        return true;
    }
}
