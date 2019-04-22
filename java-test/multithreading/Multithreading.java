class Multithreading{
    public static void main(String... args){
        ByExtendingThread m1 = new ByExtendingThread();
        
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        Thread t3 = new Thread(m1);
        
        t1.setName("First");
        t2.setName("Second");
        t3.setName("Third");
        
        t1.start();
        t2.start();
        t3.start();
        
        //From Runnable
        ByImplementingRunnable m2 = new ByImplementingRunnable();
        
        Thread t4 = new Thread(m2);
        Thread t5 = new Thread(m2);
        Thread t6 = new Thread(m2);
        
        t4.setName("TR1");
        t5.setName("TR2");
        t6.setName("TR3");
        
        t4.start();
        t5.start();
        t6.start();
        
    }
}