package LoginWindow;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Creates a window or Frame
 * @author dell
 *
 */

public class MyFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor to create a Frame of desire size and title
	 * @param title sets title of the frame.
	 * @param width sets width of frame.
	 * @param height sets height of frame.
	 */
	public MyFrame() {
		super("User Login");
		
		JPanel pnl = new JPanel();
		pnl.setLayout(new GridBagLayout());
		pnl.setBackground(Color.ORANGE);
		
		Font font_h = new Font("Calibri",Font.BOLD, 50);
		Font f_txt = new Font("Calibri", Font.PLAIN, 30);
		Font font_btn = new Font("Calibri",Font.BOLD, 30);
		
		JLabel head = new JLabel("User Login");
		head.setFont(font_h);
		head.setForeground(Color.RED);
				
		JLabel l_id = new JLabel("User ID");
		l_id.setFont(f_txt);
		JTextField id = new JTextField(10);
		id.setFont(f_txt);
		JLabel l_pw = new JLabel("Password");
		l_pw.setFont(f_txt);
		JPasswordField pw = new JPasswordField(10);
		pw.setFont(f_txt);
		JButton signIn = new JButton("Login");
		signIn.setFont(font_btn);
			
		pnl.add(head, new GBC(0, 0, 2, 1).setInsets(10,0,0,0).setIpad(5, 5));
		pnl.add(l_id, new GBC(0, 1).setInsets(10,10,0,0).setIpad(5, 5));
		pnl.add(id, new GBC(1, 1).setInsets(10,0,0,10).setIpad(5, 5));
		pnl.add(l_pw, new GBC(0, 2).setInsets(10,10,0,0).setIpad(5, 5));
		pnl.add(pw, new GBC(1, 2).setInsets(10,0,0,10).setIpad(5, 5));
		pnl.add(signIn, new GBC(0, 3, 2, 1).setInsets(10,0,10,0));
		
		add(pnl);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}