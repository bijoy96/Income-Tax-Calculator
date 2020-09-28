import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Display extends JFrame{
	private String Tax;
	
	private JPanel mainPanel; 

	public Display() {
		mainPanel = new JPanel();
        init();
	}

	private void init() {

		setSize(new Dimension(1366,768));
		setTitle("TAX CALCULATOR");
		setResizable(false);
		setVisible(false);
		setLocationRelativeTo(null);
		getContentPane().add(mainPanel);
		mainPanel.add(new MainDisplay(mainPanel));
		
	}
	
}
