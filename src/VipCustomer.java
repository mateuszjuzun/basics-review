public class VipCustomer {

    private String name;
    private long creditLimit;
    private String emailAddress;


    public VipCustomer(String name, long creditLimit, String emailAddress){
this.name = name;
this.creditLimit = creditLimit;
this.emailAddress= emailAddress;

    }

public VipCustomer(){
        this("default", 1234, "default@default.com");

}
public VipCustomer(String name,String emailAddress){
        this(name, 12345, emailAddress);
}

    public VipCustomer(String name, long creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }
}
