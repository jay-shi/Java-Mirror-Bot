import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MirrorBotGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MirrorBotGUI window = new MirrorBotGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MirrorBotGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Mirror Bot");
		frame.setSize(300,100);
		frame.setBounds(100, 100, 300, 80);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStart.setBounds(0, 0, 75, 29);
		frame.getContentPane().add(btnStart);
		
		JLabel lblRepeationNumber = new JLabel("Repeation Number");
		lblRepeationNumber.setBounds(87, 5, 123, 16);
		frame.getContentPane().add(lblRepeationNumber);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(222, 5, 30, 16);
		frame.getContentPane().add(textArea);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu runFile = new JMenu("Run");
		JMenuItem openText = new JMenuItem("Open Text File");
		runFile.add(openText);
		menuBar.add(runFile);
		
		frame.setJMenuBar(menuBar);
	}
}
