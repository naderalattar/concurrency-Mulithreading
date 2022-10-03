package fourWaysToRunAcode;

import java.nio.channels.AsynchronousByteChannel;

public class StoppableRunable implements Runnable{

    private boolean stopRequest=false;

    public synchronized void requestStop(){
        stopRequest=true;
    }

    public synchronized boolean isStopRequest(){
        return stopRequest;
    }

    @Override
    public void run() {

        while (!isStopRequest()){
            System.out.println("stoppable runable thread is runing");
        }

        System.out.println("stoppable runable thread is stoped");

    }
}
