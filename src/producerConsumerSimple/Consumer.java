package producerConsumerSimple;

import java.util.List;

public class Consumer implements Runnable{
    List<Integer> questionList=null;


    public Consumer(List questionList) {
        this.questionList=questionList;
    }

    public void answerQuestion() throws InterruptedException {

        synchronized (questionList){

            if (questionList.isEmpty()){
                System.out.println("No question to answer .... wait for producer to get questions");
                questionList.wait();
            }
        }

        synchronized (questionList){

            Thread.sleep(5000);
            System.out.println("Answered question : "+questionList.remove(0));
            questionList.notify();
        }




    }




    @Override
    public void run() {
        while (true) {
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
