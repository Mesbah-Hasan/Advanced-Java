class AC implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("First runnable:");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class CDD implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Second runnable:");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class  CDE implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Third runnable: Runningggggggggggggggggggggggggggg");
           try {
               Thread.sleep(7);
           }
           catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
    }
}

class CDF implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread running in class CDF");
                Thread.sleep(11);
            }

        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiThreadingRunnable {
    public static void main(String[] args) {
        AC ac = new AC();
        CDD cdd = new CDD();
        Thread t1 = new Thread(ac);
        Thread t2 = new Thread(cdd);
        t1.start();
        t2.start();
        Thread t3 = new Thread(new CDE());
        t3.start();
        Thread t4 = new Thread(new CDF());
        t4.start();
    }
}
