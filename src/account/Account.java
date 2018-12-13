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
public class Account {
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void withdraw(double amount){
        if(this.balance >= amount){
           this.balance -= amount;          
        }else{
            System.out.println("You have insufficient balance to withdraw "+amount);
        }
    }
    
    public double deposit(float amount){
        this.balance += amount;
        
        return this.getBalance();
    }
    
}
