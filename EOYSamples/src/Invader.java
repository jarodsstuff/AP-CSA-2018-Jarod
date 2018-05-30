
public class Invader {
	private int xPosition;
	private int yPosition;
	private boolean tiltingLeft;
	
	private static int invaderSpeed = 6;
	private static int invaderStartHeight = 500;
	
	public static final int INVADERS_PER_ROW = 12;
	
	public Invader(int xPos, int yPos) {
		xPosition = xPos;
		yPosition = yPos;
		tiltingLeft = true;
	} // end constructor
	public int getXPos() {
		return xPosition;
	} // end getXPos
	public int getYPos() {
		return yPosition;
	} // end getYPos
	public static int getInvaderSpeed() {
		return invaderSpeed;
	}
	public void setXPos(int xPos) {
		xPosition = xPos;
	}
} // end Invader class
