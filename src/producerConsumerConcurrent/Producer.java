package producerConsumerConcurrent;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Producer  implements Runnable{

    BlockingQueue<Integer> questionQueue;
    int questionNo;

    public Producer(BlockingQueue queue){
        this.questionQueue=queue;
    }


    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                System.out.println("Asking question :" + questionNo);
                questionQueue.put(questionNo++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
