package edureka;

public class main {
    public static void main(String[] args) {


        Runnable runnable=new MyRunable();
        Runnable runnable2=new MyRunable();

        Thread thread=new myThread();
        Thread thread2=new myThread2();

        thread.start();
        thread2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("task 3 from main thread 33333");

        }


    }
}
