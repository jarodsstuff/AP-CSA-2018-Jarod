import javax.swing.*;

public class FirstGui extends JFrame {

	public FirstGui() {
		super("hello");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.add(new JLabel("Hello, world!"));
        super.pack();
        super.setVisible(true);
        super.setSize(400, 200);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstGui();
	}

}
