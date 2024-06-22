package project1;

public class M6 {
    private static final Object lock = new Object();
    private static char currentChar = 'A';

    public static void main(String[] args) {
        // Create and start 26 threads, one for each letter from A to Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            char finalCh = ch; // need final or effectively final variable for lambda
            new Thread(() -> {
                synchronized (lock) {
                    while (currentChar != finalCh) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    // Print the character
                    System.out.print(finalCh + " ");
                    // Update the current character to the next one
                    currentChar++;
                    // Notify all waiting threads
                    lock.notifyAll();
                }
            }).start();
        }
    }
}
