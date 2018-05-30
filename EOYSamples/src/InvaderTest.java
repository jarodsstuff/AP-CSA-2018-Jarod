
public class InvaderTest {

	public static void main(String[] args) {
		Invader invader1 = new Invader(100, 200);
		Invader invader2 = new Invader(300, 400);
		
		int xPos = invader1.getXPos();
		System.out.println("Invader 1 x position = " + xPos);
		
		invader1.setXPos(333);
		xPos = invader1.getXPos();
		System.out.println("Invader 1 x position = " + xPos);
		
		int yPos = invader2.getYPos();
		System.out.println("Invader 2 y position = " + yPos);
		
		System.out.println("demo = " + Invader.getInvaderSpeed());
	} // end main

} // end InvaderTest class
