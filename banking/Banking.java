package banking;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Bank bank = new Bank("Chamber Bank");
        Account account = new Account(0);
        
        Customer customer = new Customer("firstname", "lastname");
        
       
        int input = 1;
        
        while(input == 1){  
        System.out.println("Greeting travellers what would you like to do?");
        System.out.println("""
                           
                           1. Make an Account
                           2. Deposit Money
                           3. Withdraw Money
                           4. Check Balance
                           5. Exit
                           """);
        int options = reader.nextInt();
        switch(options){
            case 1 -> { //Create new account
                //input firstname
                System.out.println("Please enter your first name");
                reader.nextLine();
                String firstname = reader.nextLine();//input firstname
                //input lastname
                System.out.println("Please enter your Last name");
                String lastname = reader.nextLine();
                //add new customer into array
                bank.addCustomer(firstname,lastname);
                System.out.println("Account has been successfully made");
                //Entering initial deposit
                System.out.println("Enter initial deposit");
                double initial_balance = reader.nextDouble();
                account.deposit(initial_balance);

                break;
            }
            
            case 2 ->{
                //Input value to balance
                System.out.println("Please enter amount to deposit");
                double amount_deposit = reader.nextDouble();
                //Input into the balance
                account.deposit(amount_deposit);
                break;       
            }
            case 3 ->{
               //Input value to extract from balance
               System.out.println("Please enter amount to withdraw");
               //User input
               double amount_withdrawn = reader.nextDouble();
               account.withdraw(amount_withdrawn);
               break;
            }
            case 4 ->{
               //output user's balance
               System.out.println("Your current balance is " + account.getBalance()+ " Dollars");
               break;
            }
               
            case 5 ->{
               //Set input to 0 to stop the loop 
               input = 0;
               break;
            }
            default -> {
               //the default if any number is inputted into the switch case
               System.out.println("Please try again");
               break;
                    }
                
            
                    
                    
                    
        }
        
        }
    }
    
}
