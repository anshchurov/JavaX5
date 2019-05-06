public class Task01Ex1 {
    // Кто на ком стоял?..
    //Как поняла:
    public static double ex1(int x, int y, int z) {
        if (x * y + 37 > 0) {
            z = z * 2;
            return 5 * y - x;
        } else {
            if (x == 0) z = z / x;
            else z = z / 5;
            return 7 * x + y;
        }
    }
}
