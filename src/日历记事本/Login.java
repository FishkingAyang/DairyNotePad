package 日历记事本;

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
	public JTextField textField; //输入账号
	public JPasswordField textField_1; //输入密码
	static Point origin = new Point();
	private JTextField textField_2; //显示登陆错误返回的信息
	public String str_a="0000000",str_b="0000000"; //默认账号
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
		this.frmLogin.setUndecorated(true); //无边框
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
		
		JButton btnNewButton = new JButton("退出"); //点击退出按钮 关闭窗口
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if("退出".equals(e.getActionCommand())) {
						frmLogin.setVisible(false);
						textField_2.setText("");
						textField.setText("");
						textField_1.setText("");
					}
			}
		});
		btnNewButton.setBounds(246, 206, 93, 29);
		panel.add(btnNewButton);
		
		 button = new JButton("登录");  //点击登陆 则将账号信息发送给是数据库进行比对 成功则关闭窗口
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if("登录".equals(e.getActionCommand())) {
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
						textField_2.setText("账号或密码不能为空");	
						Toolkit.getDefaultToolkit().beep();
						
					}
					else{
						textField_1.setText("");
						textField_2.setText("账号或密码错误");
						Toolkit.getDefaultToolkit().beep();
				}}
			});
			button.setBounds(111, 206, 93, 29);
			panel.add(button);

		
			JButton button_1 = new JButton("注册"); //点击注册 跳转到注册窗口
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
		
		JLabel lblNewLabel = new JLabel("帐号");
		lblNewLabel.setBounds(52, 95, 54, 15);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("密码");
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
		
		ImageIcon icon=new ImageIcon("C:/Users/LENOVO/workspace/日历记事本/bin/Img/title.jpg");
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBackground(SystemColor.control);
		textField_2.setColumns(10);
		textField_2.setBounds(111, 269, 228, 21);
		panel.add(textField_2);
		//---------------------------------------------------------------------------------------------------
		frmLogin.addMouseListener(new MouseAdapter() {    //实现无边框窗口移动
			// 按下（mousePressed 不是点击，而是鼠标被按下没有抬起）
			public void mousePressed(MouseEvent e) {
				// 当鼠标按下的时候获得窗口当前的位置
				origin.x = e.getX();
				origin.y = e.getY();
			}
		});
		frmLogin.addMouseMotionListener(new MouseMotionAdapter() {
			// 拖动（mouseDragged 指的不是鼠标在窗口中移动，而是用鼠标拖动）
			public void mouseDragged(MouseEvent e) {
				// 当鼠标拖动时获取窗口当前位置
				Point p = frmLogin.getLocation();
				// 设置窗口的位置
				// 窗口当前的位置 + 鼠标当前在窗口的位置 - 鼠标按下的时候在窗口的位置
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
