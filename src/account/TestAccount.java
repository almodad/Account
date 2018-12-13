/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Almodad
 */
public class TestAccount {
    public static void main(String []args){
        //create an object of the Account class
        Account account1 = new Account(560000.50);
        account1.withdraw(5000);
        System.out.println("Balance: "+account1.getBalance());
    }
    
}
