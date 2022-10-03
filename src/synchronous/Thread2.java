package synchronous;

public class Thread2 extends Thread {

    Printer printer;

    Printer printer2;

    public Thread2(Printer printer,Printer printer2){
        this.printer=printer;
        this.printer2=printer2;
    }

    @Override
    public void run() {
        synchronized (printer) {
            synchronized (printer2) {
                for (int i = 0; i < 586228918; i++) {
                    printer.print("thread 2222222222");

                }
            }
        }

    }
}
