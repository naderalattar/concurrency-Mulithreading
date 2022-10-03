package producerConsumerSimple;

import java.util.List;

public class Producer implements Runnable{

    List<Integer> questionList=null;
    final int LIMIT=5;
    private int questionNo;

    public Producer(List questionList) {
         this.questionList=questionList;
    }

    public void readQuestion(int questionNo) throws InterruptedException {

        synchronized (questionList){

            if (questionList.size()==LIMIT){
                System.out.println("question have piled up .... wait for answers");
                questionList.wait();
            }
        }

        synchronized (questionList){

            System.out.println("new Question : "+questionNo);
            questionList.add(questionNo);
            Thread.sleep(200);
            questionList.notify();
        }




    }




    @Override
    public void run() {
        while (true) {
            try {
                readQuestion(++questionNo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
