public class Task01Ex13 {

    public static void ex13() {
        String name = "слово инфор информатика";
        int i = name.indexOf("информатика");
        System.out.println(name.substring(i+2, i + 7));
        System.out.println(name.substring(i+7, i + 10));
    }
}
