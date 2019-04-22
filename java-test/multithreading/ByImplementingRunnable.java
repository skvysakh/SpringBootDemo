class ByImplementingRunnable implements Runnable{
    @Override
public void run() {
	 for (int i = 0; i <= 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " started at " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception during thread Execution");
            }
        }
}
}