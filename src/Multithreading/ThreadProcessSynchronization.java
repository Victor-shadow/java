package Multithreading;
class BankAccount{
    private int balance = 1000;//shared resource
    //synchronized method for deposit operation
    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }
    //synchronized method for withdrawal operation
    public synchronized  void withdraw(int amount){
        if (balance>=amount){
            balance-= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        }
        else{
            System.out.println("Insufficient balance to withdraw: " + amount);
        }
    }
    public int getBalance(){
        return balance;
    }
}
public class ThreadProcessSynchronization {
    public static void main(String[]args){
        BankAccount account = new BankAccount();//shared resource
        //Thread 1 to deposit money in the account
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 3; i++){
                account.deposit(200);
                try {
                    Thread.sleep(50);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //Thread 2 to withdraw money from the account
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i< 3; i++ ){
                account.withdraw(100);
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        //start both threads
        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //print final balance
        System.out.println("Final Balance: " + account.getBalance());
    }

}
//It demonstrates process synchronization using a bank account, with deposit and withdrawal operations
//Two threads, one for depositing and the other for withdrawal perform operations on the shared account
//The methods deposit and withdraw are synchronized to ensure thread safety to prevent race conditions  when both
//threads access the balance simultaneously
//This ensures accurate updates to the account balance