import javax.swing.*;
class FramePertamaku extends JFrame {
    public FramePertamaku() {
        // Set the title of the frame
        setTitle("Frame Pertama"); 
        setSize(300, 200); 
    }
}
public class Frameku {
    public static void main(String[] args) {
        FramePertamaku coba = new FramePertamaku();
        coba.setVisible(true); // Use setVisible instead of show
    }
}