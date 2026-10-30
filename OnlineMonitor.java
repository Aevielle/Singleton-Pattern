public class OnlineMonitor {
    public void display() {
        System.out.println("[Online Monitor] Current queue number: "
                + QueueManager.getInstance().getCurrentNumber());
    }
}