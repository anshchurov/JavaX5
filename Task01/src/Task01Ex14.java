public class Task01Ex14 {

    public static void ex14() {
        String string = "Анна ванна стеклянный безымянный";
        String substring = "нн";
        int i = 0;
        while (i < string.lastIndexOf(substring)) {
            i = string.indexOf(substring, i);
            System.out.println(substring);
            i++;
        }
    }
}



