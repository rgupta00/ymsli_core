package com.day8.session1;
class Test extends Thread {

   volatile  boolean keepRunning = true;

    public void run() {
        while (keepRunning) {
        }

        System.out.println("Thread terminated.");
    }

    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        t.start();
        Thread.sleep(1000);
        t.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}