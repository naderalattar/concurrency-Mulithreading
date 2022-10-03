package fourWaysToRunAcode;

import java.util.concurrent.ThreadFactory;

public class main {
    public static void main(String[] args) throws InterruptedException {



        StoppableRunable thStoppableRunable=new StoppableRunable();
        Thread thread=new Thread(thStoppableRunable,"my thread");
        thread.start();


        Thread.sleep(2000);

        thStoppableRunable.requestStop();
        System.out.println("main thread");




    }
}
