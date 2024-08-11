//
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread running :"+ Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Intruppted Exception :"+ e.getMessage());
        }
        System.out.println("Thread finnish:"+ Thread.currentThread().getName());

    }
}

class ThreadCreationExample
{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        System.out.println("Main Thread Finished");
    }
}