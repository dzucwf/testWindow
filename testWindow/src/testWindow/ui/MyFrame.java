package testWindow.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	
	private Box box1 = Box.createHorizontalBox();
	private Box box2 = Box.createVerticalBox();
	private Box box3 = Box.createHorizontalBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setTitle("test1");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 850, 700);
		contentPane = new JPanel();

		JButton btn = new JButton("≤‚ ‘1");
		//btn.setBounds(100,200, 200, 75);
		
		JButton btn2 = new JButton("≤‚ ‘2");
		//btn2.setBounds(100,200, 200, 75);
		
		JButton btn3 = new JButton("≤‚ ‘3");
		//btn3.setBounds(100,200, 200, 75);
		
		JButton btn4 = new JButton("≤‚ ‘4");
		//btn4.setBounds(100,200, 200, 75);
		box1.add(btn);
		box1.add(btn2);
		
		box2.add(btn3);
		
		box2.add(btn4);
		box3.add(box1);
		box3.add(box2);
		this.add(box3);
		//setContentPane(contentPane);
	
	}
}
