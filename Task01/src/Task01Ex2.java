public class Task01Ex2 {

    public static void ex2() {
        int x = 9;
        int y = 2;
        System.out.println("Средний возраст Тани и Мити " + averageAge(x, y) + " лет");
        System.out.println("Возраст Тани от среднего отличается на " + ageDifference(x, y));
        System.out.println("Возраст Мити от среднего отличается на " + ageDifference(y, x));
    }

    public static int averageAge(int x, int y) {
        return (x + y) / 2;
    }

    public static int ageDifference(int x, int y) {
        return Math.abs((x + y) / 2 - x);
    }
}

