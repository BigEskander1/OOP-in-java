// this class to learn constructor 
// finalizer  to delete the object from heap  , 
//java provide (garbage collector) that delete the object from heap when it is not used

public class Account {
    private String name;
    private String address;
    private String accountNumber;
    private double balance;
    
    // Constructor to initialize the object and set default values 
    // cannot be abstract , static , final , synchronized
    public Account(String accountNumber, double balance) {
        this(accountNumber , balance , "No Name"); // use this keyword to call another constructor  --> constructor chaining
    }
      // class can have only one constructor or change arguments , typeOf arguments 
    public Account(String accountNumber, double balance , String name) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.address = "No address";
    }
      // class can have only one constructor or change arguments , typeOf arguments 
    public Account(int accountNumber, double balance) {
        this(accountNumber  + "" , balance , "No Name");
    }

    //default constructor if not provided
    public Account() {}

    // copy constructor
    public Account(Account account) {
        this.name = account.name;
        this.address = account.address;
        this.accountNumber = account.accountNumber;
        this.balance = account.balance;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", address=" + address + ", accountNumber=" + accountNumber + ", balance="
                + balance + "]";
    }

    public static void main(String[] args) {
            System.out.println(" \n ----- Account ----- \n");

            Account account1 = new Account("1234", 1000.0 );
            System.out.println(account1.toString());

            Account account2 = new Account(12345, 1200.0);
            System.out.println(account2.toString());

            // use copy constructor
            Account account3 = new Account(account1);
            System.out.println(account3.toString());

    }
 
}