public class Task01Ex10 {

    public static void ex10() {
        int[] a = new int[]{1, 61, 8, 9, 0, 6, 90, 87, 54, 6, 4, 3436};
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 2) == 0) j++;
        }
        System.out.println(j);
    }
}