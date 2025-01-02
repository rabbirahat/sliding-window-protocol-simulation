# Sliding Window Protocol Simulation

This Java project simulates the Sliding Window Protocol, a fundamental concept in reliable data transmission systems like TCP. It includes a client-server communication setup where frames (data packets) are sent from a client to a server. The server acknowledges each frame sequentially, ensuring data integrity.

---
### Key Sections:
- **Features**: Highlights the core aspects of the project.
- **How It Works**: Describes the flow of the program.
- **Getting Started**: Helps users quickly run the project.
- **Usage**: Shows example inputs and outputs for better understanding.
- **Code Overview**: Explains the main components.
- **Contribution**: Encourages collaboration.
---

## Features

**1. Sliding Window Implementation**:
- The client sends frames in batches determined by the window size.
- The server acknowledges frames if they are received in the correct order.
- If a frame is not acknowledged, the client resends it.

**2. Configurable Parameters**:
- Total number of frames to send.
- Window size (maximum number of frames sent at once).

**3. Robust Error Handling**:
- Handles out-of-order frames.
- Resends unacknowledged frames.

---

## How It Works

1. **Client**:
    - Sends frames in a window-based batch.
    - Waits for acknowledgement from the server.
    - Retransmits frames if an acknowledgement is not received.

2. **Server**:
    - Receives frames and checks if they are in the correct sequence.
    - Acknowledges frames in the correct order.
    - Rejects out-of-sequence frames, prompting the client to resend.

---

## Getting Started

### *Prerequisites*

- Java Development Kit (JDK) 8 or higher.
- Any IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code).

[//]: # (### *Setup*)

[//]: # ()
[//]: # (1. Clone the repository:)

[//]: # (   ```bash)

[//]: # (   git clone https://github.com/rabbirahat/sliding-window-protocol-simulation.git)

[//]: # ()
[//]: # (2. Navigate to the project directory:)

[//]: # (   ```bash)

[//]: # (   cd sliding-window-protocol-simulation)

[//]: # (   cd src)
   
[//]: # (3. Open the project in your IDE.)

### Usage
1. Run the SlidingWindowMain class.
2. Provide the inputs when prompted:
   - Total number of frames: Total frames to send.
   - Window size: Number of frames sent in one batch.
3. Observe the frame transmission process in the console.

### *Example Input*
Enter total number of frames: 5\
Enter window size: 2
### *Example Output*
Client: Sending frames in the window [0 - 1]\
Server: Frame 0 received and acknowledged.\
Server: Frame 1 received and acknowledged.\
Client: Sending frames in the window [1 - 2]\
Server: Frame 1 is out of order. Expecting frame 2.\
Client: No acknowledgement for frame 1. Resending...\
Client: Sending frames in the window [2 - 3]\
Server: Frame 2 received and acknowledged.\
Server: Frame 3 received and acknowledged.\
Client: Sending frames in the window [3 - 4]\
Server: Frame 3 is out of order. Expecting frame 4.\
Client: No acknowledgement for frame 3. Resending...\
Client: Sending frames in the window [4 - 5]\
Server: Frame 4 received and acknowledged.\
Client: All frames sent successfully!

## Code Overview
#### *Classes*
**1. SlidingWindowMain:**
- Entry point for the application.
- Handles user input and initializes the client and server.

**2. SlidingWindowServer:**
- Simulates the server's functionality.
- Tracks the next expected frame and provides acknowledgement.

**3. SlidingWindowClient:**
- Simulates the client's functionality.
- Manages the sliding window and retransmits unacknowledged frames.

## Contribution
Contributions are welcome! Feel free to submit a pull request or open an issue for any bug reports, suggestions, or feature requests.



