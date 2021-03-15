package 日历记事本;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Warm {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warm window = new Warm();
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
	public Warm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 284, 106);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 268, 70);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(9, 10, 47, 21);
		textField.setColumns(10);
		panel.add(textField);
		
		JLabel label = new JLabel("\u5E74", SwingConstants.CENTER);
		label.setBounds(65, 16, 20, 15);
		label.setFont(new Font("华文楷体", Font.PLAIN, 15));
		panel.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 10, 47, 21);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JComboBox comboBox = new JComboBox(new Object[]{});
		comboBox.setMaximumRowCount(6);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox.setBounds(94, 10, 47, 21);
		comboBox.setMaximumRowCount(6);
		panel.add(comboBox);
		
		JLabel label_1 = new JLabel("\u6708", SwingConstants.CENTER);
		label_1.setBounds(150, 16, 20, 15);
		label_1.setFont(new Font("华文楷体", Font.PLAIN, 15));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u65E5", SwingConstants.CENTER);
		label_2.setBounds(235, 16, 20, 15);
		label_2.setFont(new Font("华文楷体", Font.PLAIN, 15));
		panel.add(label_2);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.setFocusPainted(false);
		button.setBackground(SystemColor.controlHighlight);
		button.setBorderPainted(false);
		//btnNewButton.setContentAreaFilled(false);   
		button.setBorder(new EmptyBorder(0,0,0,0)); 
		button.setBounds(9, 37, 47, 23);
		panel.add(button);
	}
}
