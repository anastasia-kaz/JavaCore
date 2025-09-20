import java.util.Scanner;

public class Homework_5 {

    public static void main(String[] args) {

        //1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до100. (можно использовать цикл for)
        int i1;
        for (i1 = 1; i1 <= 100; i1++){
            if (i1 % 3 == 0){
                System.out.println(i1 + " - Число кратное 3");
            }
            if (i1 % 7 == 0){
                System.out.println(i1 + " - Число кратное 7");
            }
        }

        //2. Ввести 2 положительных числа с консоли с помощью сканера. Вывести сумму всех чисел от одного числа до другого. (Используйте цикл while).Подсказка.
        // До цикла объявите переменную int sum=0. В самом цикле перезаписывайте в эту переменную сумму чисел.

        Scanner s = new Scanner(System.in);
        System.out.println("Введите a");
        int a = s.nextInt();
        System.out.println("Введите b");
        int b = s.nextInt();
        int sum = 0;

        //обработка случая когда b > a, 1 + 2 = 2 + 1
        int i2 = Math.min(a, b);
        int j = Math.max(a, b);

        while (i2 <= j){
            sum += i2;
            i2++;
        };
        System.out.println("Сумма чисел между значениями (включительно) " + a + " и " + b + " = " + sum);

        //3*. Ввести число с консоли, которое не заканчивается на 0. Вывести число в обратном порядке. Использовать оператор %.
        System.out.println("Введите c");
        int c = s.nextInt();

        if (c % 10 == 0) {
            System.out.println("Число заканчивается на 0, и не соответствует условиям");

        } else {
            String num = Integer.toString(c);
            for (int i = num.length()-1; i >= 0; i--){
                System.out.print(String.valueOf(num.charAt(i)));
            }
        }

        //4*. Ввести число с консоли, которое не заканчивается на 0.Вывести чётные и нечётные числа через while and if. Использовать оператор %.

        System.out.println("Введите c");
        int d = s.nextInt();
        int i4 = 1;


        if (d % 10 == 0) {
            System.out.println("Число заканчивается на 0, и не соответствует условиям");

        } else {
            while (i4 <= d) {
                if (i4 % 2 == 0){
                    System.out.println(i4 + " четное число");
                }
                if (i4 % 2 != 0){
                    System.out.println(i4 + " нечетное число");
                }
                i4++;
            }
        }


    }
}








