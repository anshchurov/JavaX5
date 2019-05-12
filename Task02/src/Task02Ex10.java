import java.util.HashMap;
//Только если количество вхождений одинаковое, то внутри как попала расположены :(

public class Task02Ex10 {


    public static void ex10(int[] array) {
        for (int j = array.length; j > 0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (counts(array).get(array[i + 1]) > counts(array).get(array[i])) {
                    array[i] = array[i + 1] + array[i];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                }
            }
        }

        System.out.println("\nРасположенные по убыванию количества вхождений:");
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");

//        System.out.println("\n" + counts(array));

    }

    public static HashMap<Integer, Integer> counts(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < array.length; j++) {
            Integer value = array[j];
            Integer count = map.get(value);
            if (count == null) count = 0;
            map.put(value, ++count);
        }
        return map;
    }
}
