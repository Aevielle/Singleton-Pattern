public class Main {
    public static void main(String[] args) {
        HelpDeskStation s1 = new HelpDeskStation(1);
        HelpDeskStation s2 = new HelpDeskStation(2);
        HelpDeskStation s3 = new HelpDeskStation(3);
        OnlineMonitor monitor = new OnlineMonitor();

        s1.issueNumber();
        s2.issueNumber();
        s3.issueNumber();
        monitor.display();

        s2.resetQueue(50);       
        s1.issueNumber();        
        monitor.display();

        System.out.println("Same instance? "
                + (QueueManager.getInstance() == QueueManager.getInstance()));
    }
}