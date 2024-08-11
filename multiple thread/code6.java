// class NumberPrinter implements Runnable {
//     private int start;
//     private int end;

//     public NumberPrinter(int start, int end) {
//         this.start = start;
//         this.end = end;
//     }

//     public void run() {
//         for (int i = start; i <= end; i++) {
//             System.out.println(Thread.currentThread().getName() + ": " + i);
//         }
//     }
// }

//  class PrintNumbersMultiThreaded {
//     public static void main(String[] args) {
//         NumberPrinter printer1 = new NumberPrinter(1, 5);
//         NumberPrinter printer2 = new NumberPrinter(6, 10);

//         Thread thread1 = new Thread(printer1, "Thread 1");
//         Thread thread2 = new Thread(printer2, "Thread 2");

//         thread1.start();
//         thread2.start();
//     }
// }



// —----------------------------------------------------------------------------------------------------------
// class BankAccount {
//     private int balance = 1000;

//     public synchronized void withdraw(int amount) {
//         if (balance >= amount) {
//             balance -= amount;
//             System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ". Remaining balance: " + balance);
//         } else {
//             System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + ". Insufficient balance.");
//         }
//     }
// }

// class Transaction implements Runnable {
//     private BankAccount account;

//     public Transaction(BankAccount account) {
//         this.account = account;
//     }

//     public void run() {
//         for (int i = 0; i < 3; i++) {
//             account.withdraw(300);
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

//  class BankTransactionExample {
//     public static void main(String[] args) {
//         BankAccount account = new BankAccount();

//         Transaction transaction1 = new Transaction(account);
//         Transaction transaction2 = new Transaction(account);

//         Thread thread1 = new Thread(transaction1, "Customer 1");
//         Thread thread2 = new Thread(transaction2, "Customer 2");

//         thread1.start();
//         thread2.start();
//     }
// }

