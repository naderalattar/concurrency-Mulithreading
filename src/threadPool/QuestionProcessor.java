package threadPool;

public class QuestionProcessor implements Runnable {

    private int questionNo;

    public QuestionProcessor(int questionNo){
        this.questionNo=questionNo;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName()+"recieveing question "+questionNo);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"responding question is done "+questionNo);

    }
}
