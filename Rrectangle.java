import java.awt.*;

public class Rrectangle {
	private int x, y, length, height;
	private Color color;
	private Point p;

	public Rrectangle(Point p, int length, int height, Color color) {
		this.p = p;
		this.length = length;
		this.height = height;
		this.color = color;
	}

	public void draw(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.p.getX(), this.p.getY(), this.length, this.height);
	}

	public void setPoint(Point point) {
		this.p=point;
	}
 
	public void setLength(int l) {
		this.length = l;
	}

	public void setHeight(int h) {
		this.height = h;
	}

	public void setColor(Color c) {
		this.color = c;
	}
} 