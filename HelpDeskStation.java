public class HelpDeskStation {
    private final int stationId;

    public HelpDeskStation(int stationId) {
        this.stationId = stationId;
    }

    public int issueNumber() {
        int n = QueueManager.getInstance().getNextNumber();
        System.out.println("Station " + stationId + " issued queue number: " + n);
        return n;
    }

    public void resetQueue(int newNumber) {
        QueueManager.getInstance().resetQueue(newNumber);
        System.out.println("Station " + stationId + " reset the queue to: " + newNumber);
    }
}