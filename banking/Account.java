package banking;

public class Account {
    private double balance;
    
    //initial balance
    public Account(double init_balance){
        balance = init_balance;
    }
    //get balance
    public double getBalance(){
        return balance;
    }
    //constructor for deposit
    public boolean deposit(double amt){
        //error-checking incase given vaalue is 0 or below
        if(amt<1){
            System.out.println("Value deposited must be more than 0");
        return false;
        }else{
            balance+= amt;
            System.out.println("deposit successfull\n" + balance + " dollars, is currently in your account");
            return true;
        }
    }
    //constructor for withdrawing
    public boolean withdraw(double amt){
        //error-checking if value inputted is 0
        if(amt<1){
            System.out.println("Value withdrawn must be higher than 0");
            return false;
        //error-checking incase the amount of value withdrawn is more than the balance
        }else if(amt>balance){
            System.out.println("Value withdrawn exceed account value");
            return false;
        }else{
            balance-= amt;
            System.out.println("Withdraw successfull\n"+ balance+" dollars is your current balance");
            return true;
        }
    } 
}
