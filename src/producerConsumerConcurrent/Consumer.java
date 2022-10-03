package producerConsumerConcurrent;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Consumer  implements Runnable{

    BlockingQueue<Integer> questionQueue;


    public Consumer(BlockingQueue queue){
        this.questionQueue=queue;
    }


    @Override
    public void run() {

        while (true) {
            

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("answering question : " + questionQueue.remove());
        }

    }
}
