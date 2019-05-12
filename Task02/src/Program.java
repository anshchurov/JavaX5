public class Program {

    public static void main(String[] args) {

        int[] array = new int[100];
        System.out.print("Массив: ");
        for (int j = 0; j < array.length; j++) {
            array[j] = (int) (Math.round(1000 * Math.random())) - 500;
            System.out.print(array[j] + " ");
        }
//        Task02Ex1.ex1(array);
//        Task02Ex2.ex2(array);
//        Task02Ex3.ex3(array);
//        Task02Ex4.ex4(array);
//        Task02Ex5.ex5(array);
//        Task02Ex6.ex6(array);
//        Task02Ex7.ex7();
//        Task02Ex8.ex8(array);
//        Task02Ex9.ex9(array);
//        Task02Ex10.ex10(array);
//        Task02Ex11.ex11(array);
        Task02Ex12.ex12(array);
//        Task02Ex13.ex13(array);
//        Task02Ex14.ex14(array);
//        Task02Ex15.ex15(array);
//        Task02Ex16.ex16(array);


    }
}
