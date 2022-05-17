package banking;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    
    public Customer(String f, String l){
        firstName = f;
        lastName = l;
        
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    //getting the account
    public Account getAccount() {
        return account;
    }
    //When choosing an account, it will setaccount for balance
    public void setAccount(Account acct){
        account = acct;
    }
    
}
//This file is mostly unused