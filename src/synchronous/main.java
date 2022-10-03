package synchronous;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Printer printer=new Printer();
        Printer printe2=new Printer();

        Thread thread1=new Thread1(printer,printe2);
        Thread thread2=new Thread2(printer,printe2);

        thread1.start();

        thread2.start();
    }
}
