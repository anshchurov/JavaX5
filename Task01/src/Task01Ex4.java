public class Task01Ex4 {

    public static void ex4() {
        System.out.println("x равен " + findx());
    }

    public static int findx() {
        int x = 564;
        return x % 10 * 100 + x / 10;
    }
}
