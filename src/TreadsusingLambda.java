public class TreadsusingLambda {
    public static void main(String[] args) {
        Object lock = new Object(); // Create a custom lock object

        Runnable thread1 = () -> {
            try {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                    }
                }
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(thread1);
        t1.setName("Thread1");
        t1.start();

        Runnable thread2 = () -> {
            try {
                synchronized (lock) {
                    for (int i = 100; i <= 110; i++) {
                        System.out.println(i * i);
                    }
                }
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Thread t2 = new Thread(thread2);
        t2.setName("Thread2");
        t2.start();
    }
}
