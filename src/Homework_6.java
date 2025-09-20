import java.util.Arrays;

public class Homework_6 {

    public static void main(String[] args) {

        //1. Создать массив из 10 элементов. Заполните массив числами и вывести их в консоль (выводите через цикл for each).
        // Замените каждый элемент с нечётным индексом на ноль. Выведите полученный массив в консоль через цикл for each
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr [i] = i;
        }

        for (int i:arr) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                arr[i] = 0;
            }
        }

        for (int i:arr) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("=========================================================");

        //2. Создать массив из 5 чисел и заполните этот массив вручную. Создайте второй массив с размерностью больше на 1 чем первый массив.
        // Необходимо скопировать первый массив со всеми значениями во второй массив. Последний элемент во втором массиве пусть будет 0. Выведите второй массив в консоль с помощью цикла for each.
        int [] array = {15, 14, -45, 87, 45};
        int [] array1 = new int [array.length + 1];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
         array1[array1.length-1] = 0;

        for (int i:array1) {
            System.out.print(i + ", ");
        }

        System.out.println();
        System.out.println("=========================================================");

        //3.* Создать массив вручную. Заменить максимальный и минимальный элемент массива. Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.

        int [] array2 = {15, 14, -45, 87, 45, 12, 64, 2, -54, 0, 100, 145, -587};
        System.out.println(Arrays.toString(array2));
        int min = 0;
        int max = 0;

        for (int i = 0; i < array2.length; i++){
            if (array2[i] > array2[max])  {
                max = i;
            }
            if (array2[i] < array2[min]) {
                min = i;
            }
        }

        array2[max] = 1000;
        array2[min] = -1000;
        System.out.println(Arrays.toString(array2));

        System.out.println();
        System.out.println("=========================================================");

        //4.* Создать массив (вручную). Отсортировать элементы массива в порядке возрастания. Вывести полученный массив. Выполнить с помощью цикла for
        int [] array3 = {15, 14, -45, 87, 45, 12, 64, 2, -54, 0, 100, 145, -587};

        for (int i = 0; i < array3.length - 1; i++) {
            for (int j = 0; j < array3.length - 1 - i; j++) {
                if (array3[j] > array3[j + 1]) {
                    int t = array3[j];
                    array3[j] = array3[j + 1];
                    array3[j + 1] = t;
                }
            }
        }
        for (int n : array3) {
            System.out.print(n + ", ");
        }
        System.out.println();



    }
}
