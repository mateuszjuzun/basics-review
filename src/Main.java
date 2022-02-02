public class Main {
    public static void main(String[] args) {

        BankAccount konto = new BankAccount();

        konto.setBalance(10000);
        konto.deposit(5000);
        System.out.println("Stan konta: "+ konto.getBalance());
    }


}
