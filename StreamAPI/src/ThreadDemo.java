public class ThreadDemo {
    public static void main(String[] args) {
        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            }
        };

        Runnable thread2 = () -> {
            for (int i=10;i<20;i++){
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        };

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();

    }
}
