public class SlidingWindowServer {

    private int expectedFrame = 0; // Tracks the next expected frame number

    public boolean receiveFrame(int frame) {
        if (frame == expectedFrame) {
            System.out.println("Server: Frame " + frame + " received and acknowledged.");
            expectedFrame++;
            return true; // Acknowledgment successful
        } else {
            // If the frame is not the expected one, notify the client
            System.out.println("Server: Frame " + frame + " is out of order. Expecting frame " + expectedFrame + ".");
            return false; // Acknowledgment failed
        }
    }
}
