import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {

        //task 1. На вход даны 3 числа. Вывести в консоль только четные числа
        Scanner s = new Scanner(System.in);
        System.out.println("Введите q");
        int q = s.nextInt();
        System.out.println("Введите w");
        int w = s.nextInt();
        System.out.println("Введите r");
        int r = s.nextInt();

        if (q % 2 == 0) {
            System.out.println(q + " четное число");
        };
        if (w % 2 == 0) {
            System.out.println(w + " четное число");
        };
        if (r % 2 == 0) {
            System.out.println(r + " четное число");
        };

        System.out.println("===============================================");

        // task 2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5 (используйте оператор % для проверки деления без остатка)

        System.out.println("Введите t");
        int t = s.nextInt();
        System.out.println("Введите y");
        int y = s.nextInt();
        System.out.println("Введите u");
        int u = s.nextInt();


        if (t % 2 == 0 && t % 5 == 0) {
            System.out.println(t + " делится на 2 и на 5");
        };
        if (y % 2 == 0 && y % 5 == 0) {
            System.out.println(y + " делится на 2 и на 5");
        };
        if (u % 2 == 0 && u % 5 == 0 ) {
            System.out.println(u + " делится на 2 и на 5");
        };

        System.out.println("===============================================");
        // task 3. Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления. Написать программу, которая будет выводит разный текст, в зависимости от значения result. В случае result=3, вывести: "Результат деления равен 3" В случае result=5 вывести: "Результат деления равен 5" В других случаях вывести: "Результат деления равен дробному числу". При этом в последнем случае вывести точный результат деления (использовать приведение типов)
        //Для выполнения задания использовать оператор switch- case

        int result;
        System.out.println("Введите x");
        int x = s.nextInt();
        result = 15 / x;

        switch (result){
            case 3:
            case 5:
                System.out.println("Результат деления равен " + result);
                break;
            default:
                System.out.println("Результат деления равен " + 15.0/(double)x);
                break;
        }
    }
}
