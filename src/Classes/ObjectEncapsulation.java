package Classes;

class Account {
    //Private data members(encapsulated)
    private String name;
    private  String email;
    private long accountNumber;
    private float amount;
    //Public getter and Setter methods
    public String getName() {
        return name;
    }
    public float getAmount() {
        return amount;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public String getEmail() {
        return email;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class ObjectEncapsulation{
    public static void main(String[]args){
        //Create Account Object
        Account acc = new Account();
        //Set values using setter methods(controlled access)
        acc.setAmount(100000f);
        acc.setEmail("abc@gmail.com");
        acc.setName("ABC");
        acc.setAccountNumber(90482098491L);

        //Get the values using the getter methods
        System.out.println("Account Name: " + acc.getName());
        System.out.println("Account Amount: " + acc.getAmount());
        System.out.println("Account Email: " + acc.getEmail());
        System.out.println("Account Number: " + acc.getAccountNumber());
    }
}
