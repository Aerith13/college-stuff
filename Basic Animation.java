import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class BasicAnimation extends JFrame implements Runnable {
	
	private static final long serialVersionUID = 276554887902992792L;
	
	private Rectangle box;
	
	private long rstart;
	private long rend;
	
	private Thread t;
	
	private int screenWidth;
	private int screenheight;
	
	private Color baseColor;
	
	public BasicAnimation(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(width, height);
		box = new Rectangle(100, 100, 200, 200);
		screenWidth = width;
		screenheight = height;
		baseColor = getBackground();
		
		t = new Thread(this);
		
	}
	public void run() {
		while(true) {
			try {	
			    box.x = box.x + 16;
			    if(box.x > screenWidth) box.x = 0;
				rstart = System.currentTimeMillis();
				repaint();
				rend = System.currentTimeMillis();
				
				Thread.sleep(40-(rend-rstart));
			
			} catch (InterruptedException ex) {
				// TODO Auto-generated catch block
				System.out.println(ex.getMessage());
			}
		}
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(baseColor);
		g2d.fillRect(0,0,screenWidth,  screenheight);
		g2d.setColor(Color.RED);
		
		g2d.fillOval((int)box.getX(), (int)box.getY(),(int)box.getWidth(), (int)box.getHeight());
		
	}
	public void startAnimation() {
		t.start();
	}
	
	public static void main(String[] args) {
		BasicAnimation fr = 
        new BasicAnimation("Basic ANimation Demo", 500, 500);
		fr.setVisible(true);
		fr.startAnimation();
	}

}
