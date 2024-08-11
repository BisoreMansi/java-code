import java.util.Scanner;
class Account
{
    private int bal;
    public Account(int bal)
    {
        this.bal = bal;
    }
    boolean insufficientbalance(int w)
    {
        if (bal>w) {
            return (true);
        } else {
            return (false);
        }
    }
    void withdraw(int amt)
    {
        bal= bal-amt;
        System.out.println("Widraw Amount is ="+ amt);
        System.out.println("Your current balance is ="+ bal);
    }
   
    
}
class Customer implements Runnable
{

    private String name;
     Account account;
    public Customer(Account account, String n)
    {
        this.account = account;
        name = n;
    }
    public void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println(name+",enter a value you want to widraw");
        int amt = kb.nextInt();
        synchronized(account){
        if(account.insufficientbalance( amt))
        {
            System.out.println(name);
            account.withdraw(amt);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    }
}
class ThreadExample
{
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1,"user1"); 
        Customer c2 = new Customer(a1,"user2");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
        

        
    }

}