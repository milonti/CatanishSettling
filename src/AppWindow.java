import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;


public class AppWindow {

	private JFrame frmCatatonicSettlers;
	private MainGamePanel gamePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
					window.frmCatatonicSettlers.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCatatonicSettlers = new JFrame();
		frmCatatonicSettlers.setTitle("Catatonic Settlers");
		frmCatatonicSettlers.setBounds(100, 100, 900, 700);
		frmCatatonicSettlers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCatatonicSettlers.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		gamePanel = new MainGamePanel();
		frmCatatonicSettlers.add(gamePanel);
		
	}

}
