public class Task01Ex8 {

    public static void ex8() {
        int x = 956;
        int n = 8;
        System.out.println("a)" + inclusion(x, 6));
        System.out.println("b)" + inclusion(x, n));
    }

    public static boolean inclusion(int x, int n) {
        String a = Integer.toString(x);
        String b = Integer.toString(n);
        if (a.contains(b) == true) return true;
        else return false;
    }
}
