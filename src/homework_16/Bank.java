package homework_16;

import homework_16.exeption.AccountNotFoundException;
import homework_16.exeption.NotEnoughMoneyException;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private Set<Account> accounts = new HashSet<>();

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }


    //метод для BYN
    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        Account fromAccount = null;
        Account toAccount = null;

        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumberFrom)) {
                fromAccount = account;
            }
            if (account.getNumber().equals(accountNumberTo)) {
                toAccount = account;
            }
            if (fromAccount != null && toAccount != null) {
                break;
            }

        }

        if (fromAccount == null || toAccount == null) {
            throw new AccountNotFoundException("not.found.account");
        }

        if (fromAccount.getBalance() < amount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
    }

    //метод для USD если указан курс то предпологаем что и сумма указана в валюте карты откуда перевод
    public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount, double exchangeRate){
        Account fromAccount = null;
        Account toAccount = null;
        double amountToTransfer = amount;

        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumberFrom)) {
                fromAccount = account;
            }
            if (account.getNumber().equals(accountNumberTo)) {
                toAccount = account;
            }
            if (fromAccount != null && toAccount != null) {
                break;
            }
        }

        if (fromAccount == null || toAccount == null) {
            throw new AccountNotFoundException("not.found.account");
        }

        if (fromAccount.getBalance() < amount) {
            throw new NotEnoughMoneyException("not.enough.money");
        }

        if (!fromAccount.getCurrency().equals(toAccount.getCurrency())) {
            if ("BYN".equals(fromAccount.getCurrency()) && "USD".equals(toAccount.getCurrency())) {
                amountToTransfer = amount / exchangeRate; // BYN → USD
            } else if ("USD".equals(fromAccount.getCurrency()) && "BYN".equals(toAccount.getCurrency())) {
                amountToTransfer = amount * exchangeRate; // USD → BYN
            } else {
                throw new IllegalArgumentException("Неподдерживаемая конвертация валют");
            }
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amountToTransfer);
    }
}
