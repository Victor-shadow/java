package Synchronization;

class BankAccount{
    private int balance = 1000; //shared resource(balance)
    //synchronized method for deposit action
    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }
    //synchronized method for withdrawal action
    public synchronized void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Balance: " + balance);
        }
        else{
            System.out.println("Insufficient Balance to withdraw: " + amount);
        }
    }
    public int getBalance(){
        return balance;
    }
}
//main class
public class ProcessSynchronization {
    public static void main(String[]args){
        BankAccount account = new BankAccount();//SHARED RESOURCE
        //Thread 1 to deposit money in the account
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++){
                account.deposit(200);
                try {
                    Thread.sleep(50);//Simulate some delay
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        //Thread 2 to withdraw money in the account
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++){
                account.withdraw(100);
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        //start the threads
        t1.start();
        t2.start();
        //wait for threads to finish
        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //print final balance
        System.out.println("Final balance: " + account.getBalance()) ;

    }
}

