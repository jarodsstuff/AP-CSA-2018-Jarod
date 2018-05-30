package mcadventurecity.app;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class HomeGUI extends JFrame {
	public HomeGUI() {
		super("MCAdventureCity Official App");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        super.add(new JLabel("Hello, world!"));
        super.pack();
        super.setVisible(true);
        super.setSize(854, 480);
	}
}
