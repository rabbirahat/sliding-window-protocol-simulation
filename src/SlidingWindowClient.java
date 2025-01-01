public class SlidingWindowClient {
    private final int windowSize; // Maximum number of frames that can be sent in one window
    private int currentFrame = 0; // Keeps track of the current frame being sent
    private final int totalFrames; // Total number of frames to be sent
    private final SlidingWindowServer server; // Reference to the server object

    // Constructor to initialize the client
    public SlidingWindowClient(int totalFrames, int windowSize, SlidingWindowServer server) {
        this.totalFrames = totalFrames;
        this.windowSize = windowSize;
        this.server = server;
    }

    // Method to send frames to the server
    public void sendFrames() {
        // Loop until all frames are sent
        while (currentFrame < totalFrames) {
            // Display the current range of frames being sent in the sliding window
            System.out.println("Client: Sending frames in the window [" + currentFrame + " - " + (currentFrame + windowSize - 1) + "]");

            // Send frames within the window size
            for (int i = 0; i < windowSize && currentFrame + i < totalFrames; i++) {
                int frame = currentFrame + i; // Calculate the frame number
                boolean ack = server.receiveFrame(frame); // Attempt to send the frame to the server

                // Check if the server acknowledged the frame
                if (!ack) {
                    // If acknowledgment fails, notify and stop sending further frames in this window
                    System.out.println("Client: No acknowledgment for frame " + frame + ". Resending...");
                    break; // Resend starting from this frame in the next iteration
                }
            }
            currentFrame++; // Move the sliding window forward
        }

        System.out.println("Client: All frames sent successfully!");
    }
}
