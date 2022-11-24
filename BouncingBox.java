package bounce;
import java.awt.*;
import javax.swing.*;
 
public class BouncingBox extends JPanel {
 

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private long rstart;
	private long rend;
  
  int width;
  int height;

  float radius = 40; 
  float diameter = radius * 2;
 

  float X = radius + 50;
  float Y = radius + 20;
 

  float dy = 10;
  float dx = 10;
 
  public BouncingBox() {
 
    Thread thread = new Thread() {
      public void run() {
        while (true) {
 
          width = getWidth();
          height = getHeight();
 
          X = X + dx;
          Y = Y + dy;
 
          if (X - radius < 0) {
            dx = -dx; 
            X = radius; 
          } else if (X + radius > width) {
            dx = -dx;
            X = width - radius;
          }
 
          if (Y - radius < 0) {
            dy = -dy;
            Y = radius;
          } else if (Y + radius > height) {
            dy = -dy;
            Y = height - radius;
          }
          repaint();
 
          try {
            Thread.sleep(7-(rend-rstart));
          } catch (InterruptedException ex) {
          }
 
        }
      }
    };
    thread.start();
  }
 
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.magenta);
    g.fillRect((int)(X-radius), (int)(Y-radius), (int)diameter, (int)diameter);
  }
 
  public static void main(String[] args) {
	  
    @SuppressWarnings("unused")
	BouncingBox fr = new BouncingBox();

    JFrame frame = new JFrame("Bouncing Box");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setContentPane(new BouncingBox());
    frame.setVisible(true);
  }
}
