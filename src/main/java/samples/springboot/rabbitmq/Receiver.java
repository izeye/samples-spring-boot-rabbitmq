package samples.springboot.rabbitmq;

import java.util.concurrent.CountDownLatch;

/**
 * Created by izeye on 2014. 11. 18..
 */
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
