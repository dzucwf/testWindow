package testWindow.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import testWindow.model.Student;

public class MyFrame3 extends JFrame {

	private JPanel contentPane;

	private JLabel label;
	
	private JPasswordField passwordfiled = new JPasswordField(40);
	
	private JTextArea area = new JTextArea("111", 5, 30);
	
	private JScrollPane jsPane = new JScrollPane(area);
	
	private Object[] obj = new Object[]{
			
			new Student("ƒ„∫√"),	new Student("À˚∫√")
	}
		
	;
	private JComboBox comboBox = new JComboBox(obj);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame3 frame = new MyFrame3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout());
		label = new JLabel(new ImageIcon(this.getClass().getResource("/testWindow/res/jz.png") ));
		label.setText("≤‚ ‘");
		contentPane.add(label);
		contentPane.add(passwordfiled);
		contentPane.add(jsPane);
	
		contentPane.add(comboBox);
		
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("≤‚ ‘1");
		JMenu menu1 = new JMenu("≤‚ ‘2");
		JMenu menu2 = new JMenu("≤‚ ‘3");
		
		JMenuItem menuItem1= new JMenuItem("item1");
		JMenuItem menuItem2 = new JMenuItem("item2");
		JMenuItem menuItem3 = new JMenuItem("item3");
		setContentPane(contentPane);
	}

}
