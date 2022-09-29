package com.example.pingpong;

import java.util.concurrent.Semaphore;

public class PingTask implements Runnable{

    private Semaphore pingSemaphore;

    private Semaphore pongSemaphore;

    public PingTask(Semaphore pingSemaphore, Semaphore pongSemaphore) {
        this.pingSemaphore = pingSemaphore;
        this.pongSemaphore = pongSemaphore;
    }

    @Override
    public void run() {



    }
}
