package producerConsumerSimple;

public class DeadLock {
    public static void main(String[] args) {

        String s1="mumber one 1111111";
        String s2="number two 2222222";
        Thread tt1=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s1){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(s1);
                    System.out.println("driver 1 is waiting passenger 2");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        s1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    synchronized (s2){
                        System.out.println(" passernger 2 is here"+s2);
                    }
                }
            }
        });

        Thread tt2=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(s2);

                    System.out.println("driver 2 is waiting passenger 1");
                    synchronized (s1){
                        System.out.println(" passernger 1 is here"+s1);
                        s1.notify();
                    }
                }
            }
        });

        tt1.start();
        tt2.start();



    }
}
