
/*
* Escribe un programa PingPong que lance dos hilos:
 -- El primer hilo saca por pantalla el mensaje “Ping” 10 veces
 -- El segundo hilo saca por pantalla el mensaje “Pong” 10 veces
  Ambos hilos deben sincronizarse de manera que se alternen los ping y pong.
  No se deben utilizar sleeps.*/

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        Thread pingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        semaphore.acquire();
                        System.out.println("Ping");
                        semaphore.release();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });

        Thread pongThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    try {
                        semaphore.acquire();
                        System.out.println("Pong");
                        semaphore.release();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });


    }



}
