public class Task02Ex7 {

    public static void ex7() {

        int[] array = {70, -35, -75};
        int d = array[0];
        int k = array[0];

        for (int j = 1; j < array.length; j++) {
            d = nod(d, array[j]);
            k = nok(k, array[j]);
        }
        System.out.println("\nНОД: " + d);
        System.out.println("\nНОК: " + k);
    }

    public static int nok(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / nod(a, b);
    }

    public static int nod(int a, int b) {
        if (a == 0 || b == 0) return 0;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}