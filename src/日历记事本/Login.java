package �������±�;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.Window.Type;
import javax.swing.border.EmptyBorder;
import sql.*;

public class Login extends JFrame{

	public  JFrame frmLogin;
	public JTextField textField; //�����˺�
	public JPasswordField textField_1; //��������
	static Point origin = new Point();
	private JTextField textField_2; //��ʾ��½���󷵻ص���Ϣ
	public String str_a="0000000",str_b="0000000"; //Ĭ���˺�
	public Insert sql_1=new Insert();
	public Launching sql_2=new Launching();
	public Register sql_3=new Register();
	public String str_d="";
	public JButton button;
	public Login_2 log_2=new Login_2();
	private boolean IsLogin = false;


	public int return_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setUndecorated(true);
					window.frmLogin.setVisible(true);
				    //window.frame.setTitle("Login");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		this.frmLogin.setUndecorated(true); //�ޱ߿�
		this.frmLogin.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(Color.RED);
		frmLogin.setType(Type.UTILITY);
		frmLogin.setAlwaysOnTop(true);
		frmLogin.setResizable(false);
		frmLogin.setTitle("Login");
		frmLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 300);

		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("�˳�"); //����˳���ť �رմ���
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if("�˳�".equals(e.getActionCommand())) {
						frmLogin.setVisible(false);
						textField_2.setText("");
						textField.setText("");
						textField_1.setText("");
					}
			}
		});
		btnNewButton.setBounds(246, 206, 93, 29);
		panel.add(btnNewButton);
		
		 button = new JButton("��¼");  //�����½ ���˺���Ϣ���͸������ݿ���бȶ� �ɹ���رմ���
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if("��¼".equals(e.getActionCommand())) {
							str_a=textField.getText();
							str_b=textField_1.getText();
							sql_2.Launching_a(str_a,str_b);
							try {
							sql_2.Launching_b();
							}catch(Exception d){
							}
							return_1=sql_2.update_return();
						}
					if (return_1==3) {
						frmLogin.setVisible(false);
						 str_d=str_a;
						 textField_2.setText("");
							textField.setText("");
							textField_1.setText("");
							setLogin(true);
							Toolkit.getDefaultToolkit().beep();
					}
					else if(return_1==2){
						textField_2.setText("�˺Ż����벻��Ϊ��");	
						Toolkit.getDefaultToolkit().beep();
						
					}
					else{
						textField_1.setText("");
						textField_2.setText("�˺Ż��������");
						Toolkit.getDefaultToolkit().beep();
				}}
			});
			button.setBounds(111, 206, 93, 29);
			panel.add(button);

		
			JButton button_1 = new JButton("ע��"); //���ע�� ��ת��ע�ᴰ��
			button_1.setFocusPainted(false);
			button_1.setBackground(SystemColor.control);
			button_1.setBorderPainted(false);  
			button_1.setBorder(new EmptyBorder(0,0,0,0));   
			button_1.setBounds(347, 88, 35, 29);
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
							log_2.frame.setVisible(true);
							log_2.textField.setText("");
							log_2.textField_1.setText("");
							log_2.textField_2.setText("");
							log_2.textField_3.setText("");
				}
			});
			panel.add(button_1);

		
		textField = new JTextField();
		textField.setBounds(111, 92, 228, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("�ʺ�");
		lblNewLabel.setBounds(52, 95, 54, 15);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("����");
		label.setBounds(52, 140, 54, 15);
		panel.add(label);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(111, 137, 228, 21);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 450, 82);
		panel_1.setBackground(Color.YELLOW);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("Img/a_3.jpg",""));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(0, 0, 450, 82);
		panel_1.add(lblNewLabel_1);
		frmLogin.setBounds(100, 100, 450, 300);
		
		ImageIcon icon=new ImageIcon("C:/Users/LENOVO/workspace/�������±�/bin/Img/title.jpg");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBackground(SystemColor.control);
		textField_2.setColumns(10);
		textField_2.setBounds(111, 269, 228, 21);
		panel.add(textField_2);
		//---------------------------------------------------------------------------------------------------
		frmLogin.addMouseListener(new MouseAdapter() {    //ʵ���ޱ߿򴰿��ƶ�
			// ���£�mousePressed ���ǵ����������걻����û��̧��
			public void mousePressed(MouseEvent e) {
				// ����갴�µ�ʱ���ô��ڵ�ǰ��λ��
				origin.x = e.getX();
				origin.y = e.getY();
			}
		});
		frmLogin.addMouseMotionListener(new MouseMotionAdapter() {
			// �϶���mouseDragged ָ�Ĳ�������ڴ������ƶ�������������϶���
			public void mouseDragged(MouseEvent e) {
				// ������϶�ʱ��ȡ���ڵ�ǰλ��
				Point p = frmLogin.getLocation();
				// ���ô��ڵ�λ��
				// ���ڵ�ǰ��λ�� + ��굱ǰ�ڴ��ڵ�λ�� - ��갴�µ�ʱ���ڴ��ڵ�λ��
				frmLogin.setLocation(p.x + e.getX() - origin.x, p.y + e.getY()- origin.y);
			}
		});
		//------------------------------------------------------------------------------------------------------
	}
	public String get_name() {
		return str_d;
	}
	public int launching_return(){
		return sql_2.update_return();
	}
	public void setLogin(boolean IsLogin){
		this.IsLogin = IsLogin;
	}
	public boolean getIsLogin(){
		return IsLogin;
	}
	public void setLaunging(int a){
		sql_2.setreturn_a(a);
	}
}
