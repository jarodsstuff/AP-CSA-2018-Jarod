package learningutils.client;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Splash extends JFrame {
	public Splash() {
		super("LearningUtils Splash Screen");
		super.setLayout(new GridLayout());
		JLabel appName = new JLabel("LearningUtils");
		JLabel loading = new JLabel("Loading...");
		appName.setFont(new Font("Segoe UI", Font.PLAIN, 36));
		loading.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
		super.add(appName);
		super.add(loading);
        super.setVisible(true);
        super.setSize(600, 300);
	}
}
