package midterm;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circ extends JPanel {
	private int myXStart = 20;
	private int myYStart = 20;
	private int myWidth = 50;
	private int myHeight = 50;
	private String myBackColor = "Blue";
	private String myForeColor = "Green";
	private String myFillColor = "Yes";

	public Circ() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d= (Graphics2D)g;
		if (myBackColor.equalsIgnoreCase("blue:")) {
			this.setBackground(Color.BLUE);
		}
		if (myFillColor.equalsIgnoreCase("yes")) {
			g2d.drawOval(myXStart, myYStart, myWidth, myHeight);
		} else {
			g2d.fillOval(myXStart, myYStart, myWidth, myHeight);
		}
	}
	
	/*public void paintComponent(Graphics g) {
   super.paintComponent(g);
   Graphics2D g2d = (Graphics2D)g;
   // Assume x, y, and diameter are instance variables.
   Ellipse2D.Double circle = new Ellipse2D.Double(x, y, diameter, diameter);
   g2d.fill(circle);
   ...
}*/

	public int getMyXStart() {
		return myXStart;
	}

	public void setMyXStart(int myXStart) {
		this.myXStart = myXStart;
	}

	public int getMyYStart() {
		return myYStart;
	}

	public void setMyYStart(int myYStart) {
		this.myYStart = myYStart;
	}

	public int getMyWidth() {
		return myWidth;
	}

	public void setMyWidth(int myWidth) {
		this.myWidth = myWidth;
	}

	public int getMyHeight() {
		return myHeight;
	}

	public void setMyHeight(int myHeight) {
		this.myHeight = myHeight;
	}

	public String getMyBackClolor() {
		return myBackColor;
	}

	public void setMyBackClolor(String myBackClolor) {
		this.myBackColor = myBackClolor;
	}

	public String getMyForeColor() {
		return myForeColor;
	}

	public void setMyForeColor(String myForeColor) {
		this.myForeColor = myForeColor;
	}

	public String getMyFillColor() {
		return myFillColor;
	}

	public void setMyFillColor(String myFillColor) {
		this.myFillColor = myFillColor;
	}

}
