package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        BankAccount samsAccount = new BankAccount("Sam", 10340);

        //samsAccount.setAccountHolder("Sam");
        samsAccount.deposit(10000);
        samsAccount.displayAccountInfo();
        }
    }

