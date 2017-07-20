import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class MirrorBot extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		new MirrorBot().setVisible(true);
	}
	
	//GUI layout
	private MirrorBot(){		
		super("Mirror-Bot"); //JFrame constructor
		setSize(300, 100); //(width, height)
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		setLayout(new BorderLayout() );
		
		JButton startBtn = new JButton("Start");
		startBtn.setActionCommand("start");
		startBtn.addActionListener(this);
		add(startBtn, BorderLayout.WEST );
		
		JLabel msg = new JLabel("repeation times");
		add(msg, BorderLayout.CENTER);
		
		JTextField textField = new JTextField(2);
		add(textField, BorderLayout.EAST);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu runFile = new JMenu("Run");
		JMenuItem openText = new JMenuItem("Open Text File");
		runFile.add(openText);
		
		menu.add(runFile);
		setJMenuBar(menu);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		String eventName = e.getActionCommand();
		
		if(eventName.equals("start")) System.out.println("btn");
		
		
	}
	
	

}
