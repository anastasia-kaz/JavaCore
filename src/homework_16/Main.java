package homework_16;

import homework_16.exeption.AccountNotFoundException;
import homework_16.exeption.NotEnoughMoneyException;

public class Main {

    public static void main(String[] args) {

        Account a1 = new Account(1, "111 111 111 111", "BYN", 100);
        Account a2 = new Account(2, "222 111 111 111", "USD", 100);
        Account a3 = new Account(3, "333 111 111 111", "BYN", 100);
        Account a4 = new Account(4, "444 111 111 111", "BYN", 100);
        Account a5 = new Account(5, "555 111 111 111", "BYN", 100);
        Account a6 = new Account(6, "666 111 111 111", "BYN", 100);
        Account a7 = new Account(7, "777 111 111 111", "BYN", 100);
        Account a8 = new Account(8, "888 111 111 111", "BYN", 100);

        Bank bank = new Bank();
        bank.getAccounts().add(a1);
        bank.getAccounts().add(a2);
        bank.getAccounts().add(a3);
        bank.getAccounts().add(a4);
        bank.getAccounts().add(a5);
        bank.getAccounts().add(a6);
        bank.getAccounts().add(a7);
        bank.getAccounts().add(a8);

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());


        try{
            bank.transferMoney("111 111 111 111", "222 111 111 111", 15.0);
        }
        catch (AccountNotFoundException accountNotFoundException){
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        }
        catch (NotEnoughMoneyException notEnoughMoneyException){
            System.out.println("Недостаточно средств для перевода");
        }
        finally {
            System.out.println("Спасибо,что воспользовались услугами банка");
        }


        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

    }
}
