public class BankAccount {


    private long accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public long getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }


    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
        } else System.out.println("Brak wystarczajacych srodkow.");
    }
}
