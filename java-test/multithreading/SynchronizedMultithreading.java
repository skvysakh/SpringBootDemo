class SynchronizedMultithreading implements Runnable {

    @Override
    public synchronized void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " started at " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception during thread Execution");
            }
        }
    }

    public static void main(String... args) {
        SynchronizedMultithreading sm1 = new SynchronizedMultithreading();

        Thread t1 = new Thread(sm1);
        Thread t2 = new Thread(sm1);
        Thread t3 = new Thread(sm1);
        
        //t2.setPriority(Thread.MAX_PRIORITY);
        
        t1.setName("ST1");
        t2.setName("ST2");
        t3.setName("ST3");

        t1.start();
        t2.start();
        t3.start();

    }
}