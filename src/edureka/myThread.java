package edureka;

public class myThread extends Thread {



    @Override
    public void run() {
        System.out.println("task 1 from my thread 11111111");
    }
}

class myThread2 extends Thread{

    @Override
    public void run() {
        System.out.println("task 2 from my thread 2222222");
    }
}
