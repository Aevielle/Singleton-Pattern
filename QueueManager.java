public class QueueManager {

    private static volatile QueueManager instance;

    private int currentNumber = 0;

    private QueueManager() { }

    public static QueueManager getInstance() {
        if (instance == null) {
            synchronized (QueueManager.class) {
                if (instance == null) {
                    instance = new QueueManager();
                }
            }
        }
        return instance;
    }

    public synchronized int getNextNumber() {
        return ++currentNumber;
    }

    public synchronized int getCurrentNumber() {
        return currentNumber;
    }

    public synchronized void resetQueue(int newNumber) {
        if (newNumber < 0) {
            throw new IllegalArgumentException("Queue number cannot be negative.");
        }
        currentNumber = newNumber;
    }
}