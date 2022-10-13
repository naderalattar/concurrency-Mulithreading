package threadPool;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    public static void main(String[] args) {
       ExecutorService executor= Executors.newFixedThreadPool(3);

       executor.execute(new QuestionProcessor(22));
       executor.execute(new QuestionProcessor(33));
       executor.execute(new QuestionProcessor(44));

       executor.shutdown();

       String s="dsc";
       HashMap<String,String> map=new HashMap<>();
       LinkedHashMap<String,String> map1=new LinkedHashMap<>();

       while (!executor.isTerminated()){

       }

       System.out.println("finished ------------------ ");


    }

}

