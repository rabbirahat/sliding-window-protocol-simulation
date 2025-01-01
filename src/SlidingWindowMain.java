import java.util.Scanner;

public class SlidingWindowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of frames: ");
        int totalFrames = scanner.nextInt();

        // maximum number of frames sent at a time
        System.out.print("Enter window size: ");
        int windowSize = scanner.nextInt();

        SlidingWindowServer server = new SlidingWindowServer();
        SlidingWindowClient client = new SlidingWindowClient(totalFrames, windowSize, server);

        // Start sending frames using the client
        client.sendFrames();
    }
}
