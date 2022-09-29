package com.example.pingpong;

import java.util.concurrent.Semaphore;

public class PongTask implements Runnable{

    private Semaphore pongSemaphore;
    private Semaphore pingSemaphore;

    public PongTask(Semaphore pongSemaphore, Semaphore pingSemaphore) {
        this.pongSemaphore = pongSemaphore;
        this.pingSemaphore = pingSemaphore;
    }

    @Override
    public void run() {


    }
}
