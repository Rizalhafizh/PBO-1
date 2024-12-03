import java.awt.*;  
import java.awt.event.*; 

public class WindowText extends Frame {
    
    public WindowText() {
        // Set the size and title of the window in the constructor
        setSize(500, 300);
        setTitle("Window Text");
        
        // Add a window listener to handle window closing events
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                dispose(); // Close the window
            }
        });
    }

    public void paint(Graphics g) {
        // Set the font for the graphics
        Font f = new Font("Monospaced", Font.BOLD, 16);
        g.setFont(f);
        
        // Draw strings on the window
        g.drawString("Hello ...", 10, 100);
        g.drawString("Salam kenal dari Frame ...", 30, 120);
    }

    public static void main(String[] args) {
        // Create an instance of WindowText
        WindowText coba = new WindowText();
        
        // Set the location of the window
        coba.setLocation(200, 100);
        
        // Make the window visible
        coba.setVisible(true);
    }
}