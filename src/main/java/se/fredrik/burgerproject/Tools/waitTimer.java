package se.fredrik.burgerproject.Tools;

public class waitTimer {
    public static void waitTimer(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt(); // Preserve the interrupt status
        }
    }
}
