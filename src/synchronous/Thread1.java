package synchronous;

public class Thread1 extends Thread {

    Printer printer;
    Printer printer2;

    public Thread1(Printer printer,Printer printer2){
        this.printer=printer;
        this.printer2=printer2;
    }

    @Override
    public void run() {

        synchronized (printer) {

            synchronized (printer2) {
                for (int i = 0; i < 586228918; i++) {
                    printer.print("thread 1111111111");

                }
            }
        }
    }
}
