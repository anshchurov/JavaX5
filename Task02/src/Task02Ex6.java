public class Task02Ex6 {

    public static void ex6(int[] array) {

        System.out.println("\nТрехзначные числа, в которых нет повторяющихся цифр:");

        for (int i = 0; i < array.length; i++) {
            if (unique(toArray(array[i])) == false && Math.abs(array[i]) > 99 && Math.abs(array[i]) < 1000)
                System.out.print(array[i] + " ");
        }
    }

    public static boolean unique(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].equals(array[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String[] toArray(int n) {
        String stringn = Integer.toString(n);
        String[] array = new String[stringn.length()];
        for (int i = 0; i < stringn.length(); i++) {
            array[i] = stringn.substring(i, i + 1);
        }
        return array;
    }
}
