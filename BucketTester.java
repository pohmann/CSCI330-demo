import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class BucketTester extends GraphicsProgram {
    private GLabel averageLabel;
    private GLabel bucketCountLabel;

    public void init() {
        averageLabel = new GLabel("The average is: ?");
        bucketCountLabel = new GLabel("There are 0 numbers in the bucket");

        this.add(averageLabel, 100, 100);
        this.add(bucketCountLabel, 100, 200);
    }


    public void run() {
        NumberBucket myBucket = new NumberBucket();

        int userEntry;
        while (true) {
            userEntry = this.readInt("Enter an int (-1 to stop)");
            if (userEntry == -1)
                break;
            myBucket.addNumber(userEntry);
        }
        averageLabel.setLabel("The average is: " + myBucket.average());
        bucketCountLabel.setLabel("There are " + myBucket.getSize() +" numbers in the bucket");
    }
}
