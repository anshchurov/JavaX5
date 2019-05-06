public class Task01Ex7 {

    public static void ex7() {
        int x = 957;
        String a = Integer.toString(x);
        if (a.charAt(0) > a.charAt(2)) System.out.println("а) первая цифра больше последней");
        else System.out.println("а) первая цифра не больше последней");
        if (a.charAt(0) > a.charAt(1)) System.out.println("б) первая цифра больше второй");
        else System.out.println("б) певая цифра не больше второй");
        if (a.charAt(1) > a.charAt(2)) System.out.println("в) вторая цифрам больше последней");
        else System.out.println("в) вторая цифра не больше последней");
    }
}
