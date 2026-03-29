package org.example;

public class BankAccount {
    private String accountHolder;
    private double accountBalance = 0;
    private final String accountNumber = "12345678980";

    public BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        this.accountBalance = initialBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public double deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Amount depositted must be more than nothing");
        }else{
            accountBalance += amount;
            return accountBalance;
        }
    }
    public double withdraw(double amount){
        if (amount <= 0 && amount > accountBalance){
            throw new IllegalArgumentException("Insufficient funds");
        }else{
            accountBalance -= amount;
            return accountBalance;
        }
    }
    public void displayAccountInfo(){
        System.out.printf("Account Holder: %s.%n", getAccountHolder());
        System.out.printf("Account NUmber: %s.%n", getAccountNumber());
        System.out.printf("Account Balance: %s.%n", getAccountBalance());
    }
}
