/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InformationHidingExample;

/**
 *
 * @author trung
 */
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        account.deposit(500.00);
        account.withdraw(200.00);
        System.out.println("Current balance: $" + account.getBalance()); // Output: $1300.00
    }
}
