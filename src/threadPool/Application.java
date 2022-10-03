package threadPool;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    public static void main(String[] args) {
//        ExecutorService executor= Executors.newFixedThreadPool(3);
//
//        executor.execute(new QuestionProcessor(22));
//        executor.execute(new QuestionProcessor(33));
//        executor.execute(new QuestionProcessor(44));
//
//        executor.shutdown();
//
//        String s="dsc";
//        HashMap<String,String> map=new HashMap<>();
//        LinkedHashMap<String,String> map1=new LinkedHashMap<>();
//
//        while (!executor.isTerminated()){
//
//        }
//
//        System.out.println("finished ------------------ ");

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(66);
        hashSet.add(12);
        hashSet.add(6);
        hashSet.add(77);
        hashSet.add(1);

        System.out.println(hashSet);
        System.out.println();
        LinkedList<Integer> dd=new LinkedList<>(hashSet);
        Collections.sort(dd);

        System.out.println(dd);



    }

}
class Emloyee implements Comparable {
     int id;
     String name;
     public Emloyee(int id,String name){
         this.id=id;
         this.name=name;

     }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
