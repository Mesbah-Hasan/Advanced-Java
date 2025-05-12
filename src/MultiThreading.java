class AB extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hi");
        }
    }
}

class CD extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        AB ab = new AB();
        CD cd = new CD();
        ab.start();

        cd.start();
    }
}


