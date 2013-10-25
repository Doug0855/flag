import java.awt.*;

public class AmericanFlag {
	private Rrectangle[] r = new Rrectangle[13];
	private static int x, y;
	private static double scale;
	private static int length = (int)900;
	private static int height = (int)(length/1.9); 
	private Point origin = new Point(0,0);
	private Point[] ps = new Point[13];
	private Rrectangle whiteRect = new Rrectangle(origin, length, height, Color.white);
	private Rrectangle union = new Rrectangle(origin, (int)(height*.76), (int)(height*7/13), Color.blue);

	public AmericanFlag(int x, int y, double scale) {
		this.x = x;
		this.y = y;
		this.scale = scale; 
		for (int i=0; i<r.length; i++) {
			ps[i] = new Point(0, i*height/13);
			r[i] = new Rrectangle(ps[i], length, height/13, Color.red);
			
		}
	}

	public void init() {

	}

	public void draw(Graphics g) {
		whiteRect.draw(g);
		for (int i=0; i<r.length; i++) {
			if (i%2==0) {
				r[i].draw(g);
			}
		}
		union.draw(g);
	}
}
