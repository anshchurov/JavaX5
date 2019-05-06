public class Task01Ex5 {
    public static void ex5() {
        double s1 = 20;         //Площадь квадрата
        double s2 = 12;         //Площадь круга

        if (Math.sqrt(s1) >= d(s2)) System.out.println("Круг входит в квадрат");
        else if (b(s1) <= d(s2)) System.out.println("Квадрат входит в круг");
        else System.out.println("Ничего никуда не входит");
    }

    public static double d(double s) {      // Диаметр круга
        return Math.sqrt(s / 3.141592) * 2;
    }

    public static double b(double s) {      //Диагональ квадрата
        return Math.sqrt(2 * s);
    }
}
