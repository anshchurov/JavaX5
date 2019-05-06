public class Task01Ex3 {

    public static void ex3() {
        int x = 9;
        System.out.println("Температура по шкале Фаренгейта: " + fahrenheit(x));
        System.out.println("Температура по шкале Кельвина: " + kelvin(x));
    }

    public static double fahrenheit(double x) {
        return x * 1.8 + 32;
    }

    public static double kelvin(double x) {
        return x + 273.15;
    }
}
