package �������±�;

import java.awt.EventQueue;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;

import sql.Register;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionEvent;

public class Login_2 { //ע�ᴰ��

	public JFrame frame;
	static Point origin = new Point();
	public JTextField textField;
	public JPasswordField textField_1;
	public JPasswordField textField_2;
	public JTextField textField_3;
	public Register sql_3=new Register();
	public String str_a="0000000",str_b="0000000",str_c="0000000";
	public int return_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_2 window = new Login_2();
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
	public Login_2() {
		initialize();
		this.frame.setUndecorated(true);
		this.frame.setVisible(false);
		this.frame.setAlwaysOnTop(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.addMouseListener(new MouseAdapter() {    //ʵ���ޱ߿򴰿��ƶ�
			// ���£�mousePressed ���ǵ����������걻����û��̧��
			public void mousePressed(MouseEvent e) {
				// ����갴�µ�ʱ���ô��ڵ�ǰ��λ��
				origin.x = e.getX();
				origin.y = e.getY();
			}
		});
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			// �϶���mouseDragged ָ�Ĳ�������ڴ������ƶ�������������϶���
			public void mouseDragged(MouseEvent e) {
				// ������϶�ʱ��ȡ���ڵ�ǰλ��
				Point p = frame.getLocation();
				// ���ô��ڵ�λ��
				// ���ڵ�ǰ��λ�� + ��굱ǰ�ڴ��ڵ�λ�� - ��갴�µ�ʱ���ڴ��ڵ�λ��
				frame.setLocation(p.x + e.getX() - origin.x, p.y + e.getY()- origin.y);
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 444, 272);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u7528\u6237\u540D");
		label.setBounds(73, 58, 54, 15);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(73, 96, 54, 15);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u786E\u8BA4\u5BC6\u7801");
		label_2.setBounds(73, 133, 54, 15);
		panel.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(137, 55, 195, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 93, 195, 21);
		panel.add(textField_1);
		
		textField_2 = new JPasswordField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 130, 195, 21);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBackground(SystemColor.control);
		textField_3.setColumns(10);
		textField_3.setBounds(137, 230, 195, 21);
		panel.add(textField_3);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if("ע��".equals(e.getActionCommand())) {
					str_a=textField.getText();
					str_b=textField_1.getText();
					str_c=textField_2.getText();
					sql_3.Register_a(str_a,str_b,str_c);
					try {
					sql_3.Register_b();
					}catch(Exception d){
					}
					return_1=sql_3.Register_return();
				}
			if (return_1==1)
				textField_3.setText("�˺��Ѵ���");
			else if(return_1==3)
				textField_3.setText("���벻һ��");
			else if(return_1==2)
				textField_3.setText("ע��ɹ�");
			Toolkit.getDefaultToolkit().beep();
			}
		});
		button.setBounds(136, 184, 93, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("�˳�");//�رձ�����
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		button_1.setBounds(239, 184, 93, 23);
		panel.add(button_1);
	}
}
