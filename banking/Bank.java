package banking;

public class Bank {
    private Customer[] customers = new Customer[50];
    private int numberOfCustomers;
    private String bankName;
    
    public Bank(String bName){
        bankName = bName;
        numberOfCustomers = 0;
            
        }   
    //Adding the customer's name into an array
    public void addCustomer(String f, String l){
        customers[numberOfCustomers] = new Customer(f,l);
        numberOfCustomers+=1;
        } 
    //TO get number of customers "unused"
    public int getNumOfCustomers(){
        return numberOfCustomers;
    }
    //To print what customer is being used "unused"
    public Customer getCustomer(int index){
        return customers[index];
    }
}
