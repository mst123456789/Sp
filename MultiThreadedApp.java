import java.util.Random;

class SharedResource {
    private int number;

    public synchronized void setNumber(int number) {
        this.number = number;
    }

    public synchronized int getNumber() {
        return number;
    }
}

class NumberGenerator extends Thread {
    private final SharedResource resource;

    public NumberGenerator(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(100);
            System.out.println("\nGenerated Number: " + num);
            resource.setNumber(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SquareCalculator extends Thread {
    private final SharedResource resource;

    public SquareCalculator(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            int num = resource.getNumber();
            if (num % 2 == 0) {
                System.out.println("Square of " + num + " = " + (num * num));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CubeCalculator extends Thread {
    private final SharedResource resource;

    public CubeCalculator(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        while (true) {
            int num = resource.getNumber();
            if (num % 2 != 0) {
                System.out.println("Cube of " + num + " = " + (num * num * num));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadedApp {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        new NumberGenerator(resource).start();
        new SquareCalculator(resource).start();
        new CubeCalculator(resource).start();
    }
}