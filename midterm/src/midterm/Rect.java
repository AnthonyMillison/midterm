package midterm;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Rect extends JPanel {
	private int myXStart = 20;
	private int myYStart = 20;
	private int myWidth = 50;
	private int myHeight = 50;
	private String myBackColor = "Blue";
	private String myForeColor = "Green";
	private String myFillColor = "Yes";

	public Rect() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (myBackColor.equalsIgnoreCase("blue:")) {
			this.setBackground(Color.BLUE);
		}
		if (myFillColor.equalsIgnoreCase("yes")) {
			g.drawRect(myXStart, myYStart, myWidth, myHeight);
		} else {
			g.fillRect(myXStart, myYStart, myWidth, myHeight);
		}
	}

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

