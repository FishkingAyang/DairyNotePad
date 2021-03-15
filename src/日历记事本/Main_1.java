package 日历记事本;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import Hethod.*;
import sql.*;
import java.awt.Window.Type;
import javax.swing.*;
import java.util.*;

public class Main_1 {
	//声明用到的变量
	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JLabel lblNewLabel;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	public JTextField textField_43;
	public JTextField textField_44;
	public JTextField textField_47;
	private JButton [] button = new JButton[42];
	public JButton button_35;
	private JButton button_36;
	private JButton button_37;
	private JButton button_40;
	private JButton button_41;
	private JButton button_49;
	private JComboBox comboBox;
	private JComboBox comboBox2;
	private int m;
	public String ss;
	private CLOCKDEMO CLOCK_a = new CLOCKDEMO();
	public String aa;
	public String cc;
	public int bb;
	public static boolean isPlay = false;//判断音乐播放状况
	public static int wmusic = 1;   //判断在放那首歌
	MP3Player m1 = new MP3Player("music/川井憲次 - 骑士王の夸り.mp3");
    MP3Player m2 = new MP3Player("music/Two Steps From Hell - Victory.mp3");
    MP3Player m3 = new MP3Player("music/群星 - 貂蝉.mp3");
	Logout logout_1=new Logout();
	Calendar tmpCale = Calendar.getInstance();
	
	public Clock2 clock=new Clock2();  //时钟的JPanel类
	public Showdays days_1 = new Showdays();//写公历日期的类
	public int [] days_a = new int [42];  //存储按钮对应日期的数组
	public int [] months_a = new int [42];//存储按钮对应月份的数组
	public int [] years_a = new int [42];//存储按钮对应年份的数组
	public InsertImg icon_a=new InsertImg();//相应按钮的图片
	public InsertImg_2 icon_b=new InsertImg_2();
	public InsertImg_3 icon_c=new InsertImg_3();
	public InsertImg_4 icon_d=new InsertImg_4();
	public InsertImg_5 icon_e=new InsertImg_5();
	public InsertImg_6 icon_f=new InsertImg_6();
	public ImageIcon icon_1 = new ImageIcon();
	public String stra,strb,strc;
	public Notepad Notepad_a=new Notepad();
	public Login Login_a =new Login();
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
/*	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;*/
	public Judgement judgement=new Judgement();
	public JLabel lblNewLabel_2;
	private JTextField textField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_1 window = new Main_1();
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
	public Main_1() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("日历记事本2.0");
		Image f  =  icon_a.getImage(0).getImage();//设置应用的图标
		frame.setIconImage(f);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 792, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Calendar calendar_1=Calendar.getInstance();//获得当前时间
		int now_year = calendar_1.get(Calendar.YEAR);
		int now_month = calendar_1.get(Calendar.MONTH)+1;
		int now_day = calendar_1.get(Calendar.DATE);
	    days_1.DAY_in_MONTH(now_year,now_month);
	    days_a=days_1.getdays();
		months_a=days_1.getMonths();
		years_a=days_1.getYears();
		
	    panel = new JPanel();
		panel.setBounds(0, 541, 617, 53);
		frame.getContentPane().add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(0, 0, 617, 542);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 142, 617, 402);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(0, 67, 617, 75);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(72, 209, 204));
		panel_4.setBounds(617, 67, 172, 527);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 0, 51));
		panel_5.setBounds(0, 0, 425, 67);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 0, 51));
		panel_6.setBounds(423, 0, 196, 67);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		CLOCK_a.setBounds(0, 0, 196, 67);
		panel_6.add(CLOCK_a);
		
		panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_7.setBounds(12, 10, 595, 390);
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(255, 0, 51));
		panel_8.setBounds(617, 0, 172, 67);
		frame.getContentPane().add(panel_8);
		
		button_35 = new JButton("");
		button_35.setFocusPainted(false);
		button_35.setBorderPainted(false);
		button_35.setBorder(new EmptyBorder(0,0,0,0));
		button_35.setBackground(new Color(204, 204, 51));
		button_35.setBounds(33, 102, 105, 105);
		panel_4.add(button_35);
		
		button_36 = new JButton("");
		button_36.setFocusPainted(false);
		button_36.setFont(new java.awt.Font("华文楷体", 0, 15));
		button_36.setBorderPainted(false);
		button_36.setBorder(new EmptyBorder(0,0,0,0));
		button_36.setBackground(SystemColor.textHighlight);
		button_36.setBounds(11, 275, 69, 38);
		panel_4.add(button_36);
		
		button_37 = new JButton();
		button_37.setFocusPainted(false);
		button_37.setFont(new java.awt.Font("华文楷体", 0, 15));
		button_37.setBorderPainted(false);
		button_37.setBorder(new EmptyBorder(0,0,0,0));
		button_37.setBackground(SystemColor.textHighlight);
		button_37.setBounds(91, 275, 69, 38);
		panel_4.add(button_37);
		
		button_40 = new JButton();
		button_40.setFocusPainted(false);
		button_40.setFont(new java.awt.Font("华文楷体", 0, 15));
		button_40.setBorderPainted(false);
		button_40.setBorder(new EmptyBorder(0,0,0,0));
		button_40.setBackground(SystemColor.textHighlight);
		button_40.setBounds(42, 225, 87, 38);
		panel_4.add(button_40);
		
		menuBar = new JMenuBar();//登录，注销选框
		menuBar.setBackground(new Color(255, 0, 51));
		menuBar.setBorderPainted(false);
		menuBar.setToolTipText("");
		menuBar.setBounds(52, 0, 20, 21);
		panel_8.add(menuBar);
		
		lblNewLabel_2 = new JLabel("未登录");//显示账户登录状态
		lblNewLabel_2.setFont(new Font("华文楷体", 0, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(71, 0, 101, 21);
		panel_8.add(lblNewLabel_2);
		
		
		
		Login_a.button.addActionListener(new ActionListener() {//登录按钮监听
			public void actionPerformed(ActionEvent e) {
				aa=Login_a.textField.getText();
				cc=Login_a.textField_1.getText();
				judgement.Judgement_b(aa,cc);
				try {
					judgement.Judgement_a();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				bb=judgement.Judgement_c();
				if(bb==1)
				lblNewLabel_2.setText(aa);
			}
		});
		
		
		mnNewMenu = new JMenu();
		mnNewMenu.setIcon(new ImageIcon("Img/a_1.gif",""));
		mnNewMenu.setBackground(new Color(255, 0, 51));
		mnNewMenu.setFont(new Font("华文楷体", 0, 15));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("登录");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!Login_a.frmLogin.isVisible()) {
					if("登录".equals(e.getActionCommand())) {
						Login_a.frmLogin.setVisible(true);
					}
				}
				else 
					Login_a.frmLogin.setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("注销");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					logout_1.Logout_b();
					lblNewLabel_2.setText("未登录");
					Login_a.setLaunging(0);
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		String music[] ={"骑士王の夸り","Victory","貂蝉",};
		JComboBox comboBox_1 = new JComboBox(music);//歌曲选框
		comboBox_1.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e)
		 {
		       if(e.getStateChange() == ItemEvent.SELECTED)
		             {
		                 String s=(String)comboBox_1.getSelectedItem();
		                 if(isPlay){
		                	switch(wmusic){
		                	case 1:m1.stop();break;	
		                	case 2:m2.stop();break;	
		                	case 3:m3.stop();break;
		                	}
		                	switch(s){
							case "骑士王の夸り":m1.start();wmusic = 1;break;
							case "Victory" :m2.start();wmusic = 2;break;
							case "貂蝉": m3.start();wmusic = 3;break;
							}
		                 }
		             }
		}  });
		comboBox_1.setBounds(52, 31, 110, 26);
		panel_8.add(comboBox_1);
		
		JTextField textField_43 = new JTextField();
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setBackground(SystemColor.control);
		textField_43.setBounds(28, 10, 66, 21);
		textField_43.setDocument(new NumberLenghtLimitedDmt(4));
		textField_43.setText(""+now_year);
		panel_5.add(textField_43);
		textField_43.setColumns(10);
		
		textField_44 = new JTextField();
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setBackground(SystemColor.control);
		textField_44.setBounds(283, 10, 66, 21);
		textField_44.setDocument(new NumberLenghtLimitedDmt(2));
		textField_44.setText(""+now_day);
		panel_5.add(textField_44);
		textField_44.setColumns(10);
		
		String months[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
		comboBox = new JComboBox(months);
		comboBox.setBackground(SystemColor.control);
		comboBox.setMaximumRowCount(6);
		comboBox.setBounds(164, 10, 47, 21);
		panel_5.add(comboBox);
		
		textField_47 = new JTextField();
		//textField_47.setOpaque(false);
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		//textField_47.setForeground(Color.WHITE);
		textField_47.setFont(new Font("华文楷体", 0, 20));
		textField_47.setEditable(false);
		textField_47.setBackground(SystemColor.control);
		textField_47.setBounds(110, 10, 394, 30);
		panel_3.add(textField_47);
		textField_47.setColumns(10);
		
		stra=textField_43.getText();
		strb=(String)comboBox.getSelectedItem();
		strc=textField_44.getText();
		
		Createbutton();
		AddActionListener();
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 0, 51));
		textField.setEditable(false);
		textField.setBounds(90, 42, 121, 21);
		panel_5.add(textField);
		textField.setColumns(10);

		JButton voice = new JButton("");//播放、静音按钮
		voice.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==voice){
					String wm = (String)comboBox_1.getSelectedItem();
					switch(wm){
					case "骑士王の夸り":Play(voice, m1);wmusic = 1;break;
					case "Victory" :Play(voice,m2);wmusic = 2;break;
					case "貂蝉": Play(voice,m3);wmusic = 3;break;
					}
				}
			}
		});
		voice.setBounds(10, 31, 26, 26);	
		panel_8.add(voice);		
		
		button_49 = new JButton("确定");  //确定按钮 ，输入日期后实现跳转
		button_49.setBackground(SystemColor.control);
		button_49.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
            	 Toolkit.getDefaultToolkit().beep();
            	if(e.getSource()==button_49) {            		
        	    	String str1 = textField_43.getText();
        			String str2 = (String)comboBox.getSelectedItem();   			
        			int year=Integer.parseInt(str1);
        			int month=Integer.parseInt(str2); 
        			
        			stra=textField_43.getText();
        			strb=(String)comboBox.getSelectedItem();
        			strc=textField_44.getText();
        			
        			if (year>2049 || year<1901)
        				textField.setText("年份：1901~2049");
        			else {
	        			days_1.DAY_in_MONTH(year,month);
	        			days_a=days_1.getdays();
	        			months_a=days_1.getMonths();
	        			years_a=days_1.getYears();
	        			if (Integer.parseInt(strc)<1 || Integer.parseInt(strc)> days_1.GetNumOfDaysInMonth(year,month)) 
	        				textField.setText("请输入正确的日");
	        			else {
		        			for(m=0;m<42;m++)
		        				if(Integer.parseInt(strc)==days_a[m] &&  month==months_a[m]) {
		        					change_button(m);
		        					break;}
		        			textField.setText("跳转成功！");
	        			}
        			}
        			
            	}
            }
        });
		button_49.setBounds(322, 41, 93, 23);
		panel_5.add(button_49);
		//第一次运行change_button
		for(m=0;m<42;m++)
			if(Integer.parseInt(strc)==days_a[m]) {
				change_button(m);
				Play(voice,m1);
				break;
			}

		lblNewLabel = new JLabel("星期日",JLabel.CENTER);
		lblNewLabel.setFont(new java.awt.Font("华文楷体", 0, 15));
		lblNewLabel.setBounds(30, 50, 54, 15);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("星期一",JLabel.CENTER);
		lblNewLabel_1.setFont(new java.awt.Font("华文楷体", 0, 15));
		lblNewLabel_1.setBounds(114, 50, 54, 15);
		panel_3.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("星期二",JLabel.CENTER);
		label_1.setFont(new java.awt.Font("华文楷体", 0, 15));
		label_1.setBounds(198, 50, 54, 15);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("星期三",JLabel.CENTER);
		label_2.setFont(new java.awt.Font("华文楷体", 0, 15));
		label_2.setBounds(282, 50, 54, 15);
		panel_3.add(label_2);
		
		JLabel label_3 = new JLabel("星期四",JLabel.CENTER);
		label_3.setFont(new java.awt.Font("华文楷体", 0, 15));
		label_3.setBounds(366, 50, 54, 15);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("星期五",JLabel.CENTER);
		label_4.setFont(new java.awt.Font("华文楷体", 0, 15));
		label_4.setBounds(450, 50, 54, 15);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("星期六",JLabel.CENTER);
		label_5.setFont(new java.awt.Font("华文楷体", 0, 15));
		label_5.setBounds(534, 50, 54, 15);
		panel_3.add(label_5);
		
		label_6 = new JLabel("年",JLabel.CENTER);
		label_6.setFont(new java.awt.Font("华文楷体", 0, 15));
		label_6.setBounds(118, 13, 20, 15);
		panel_5.add(label_6);
		
		label_7 = new JLabel("月",JLabel.CENTER);
		label_7.setFont(new java.awt.Font("华文楷体", 0, 15));
		label_7.setBounds(237, 13, 20, 15);
		panel_5.add(label_7);
		
		label_8 = new JLabel("日",JLabel.CENTER);
		label_8.setFont(new java.awt.Font("华文楷体", 0, 15));
		label_8.setBounds(375, 13, 20, 15);
		panel_5.add(label_8);
		
		button_41 = new JButton("记事本");
		button_41.setFont(new Font("华文楷体", Font.PLAIN, 15));
		button_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!Notepad_a.frmNotepad.isVisible()) {
				if("记事本".equals(e.getActionCommand())) {
				Notepad_a.ReadRecord();	
				Notepad_a.frmNotepad.setVisible(true);
				}
			}
			else 
				Notepad_a.frmNotepad.setVisible(false);
			}
		});
		
		button_41.setContentAreaFilled(false);
		button_41.setBorderPainted(false);
		button_41.setBorder(new EmptyBorder(0,0,0,0));
		button_41.setBackground(Color.WHITE);
		button_41.setBounds(10, 41, 71, 28);
		panel_5.add(button_41);
		
		JButton button_1 = new JButton("返回今天");
		button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Toolkit.getDefaultToolkit().beep();
            	if(e.getSource()==button_1) {
            		Calendar calendar_1=Calendar.getInstance();
            		int year = calendar_1.get(Calendar.YEAR);
            		int month = calendar_1.get(Calendar.MONTH)+1;
            		int day = calendar_1.get(Calendar.DATE); 			
        			days_1.DAY_in_MONTH(year,month);
        			for(m=0;m<42;m++)
        				if(days_1.Days[m] == day) {
        					change_button(m);
        					textField.setText("跳转成功！");
        					break;
        				}
            	}
            }
        });

		button_1.setBackground(SystemColor.control);
		button_1.setBounds(219, 41, 93, 23);
		panel_5.add(button_1);
		textField_47.setText(now_year+"年"+now_month+"月"+now_day+"日");
	}
	
	private InsertImg getToolkit() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void Createbutton() { //初始化显示日期所用的按钮
		for(m=0;m<42;m++) {
			button[m] = new JButton();
			button[m].setFocusPainted(false);
			button[m].setBorderPainted(false);
			button[m].setBackground(SystemColor.controlHighlight);
			button[m].setBorder(new EmptyBorder(0,0,0,0));
		}
	}
	
	public void AddActionListener() {			
		button[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[0]) {
            		if(days_1.Years[0] == 1900 && days_1.Months[0] == 12 )
            			textField.setText("无法读取该日期！");
                    else{
            		change_button(0);
            		textField.setText("");
                    }
            		}
            }
        });
		button[0].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,0);         
            }
        });
		button[0].setBounds(0, 0, 85, 65);
		panel_7.add(button[0]);
		
		button[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[1]) { 
                		if(days_1.Years[1] == 1900 && days_1.Months[1] == 12 )
                			textField.setText("无法读取该日期！");
                        else{
                		change_button(1);
                		textField.setText("");
                        }
            		}
            }
        });
		button[1].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,1);
            }
        });
		button[1].setBounds(85, 0, 85, 65);
		panel_7.add(button[1]);
		
		button[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[2]) { 
            		change_button(2);
            		textField.setText("");
            	}
            }
        });
		button[2].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,2);
            }
        });
		button[2].setBounds(170, 0, 85, 65);
		panel_7.add(button[2]);


		button[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[3]) { 
            		change_button(3);
            		textField.setText("");
            	}
            }
        });
		button[3].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,3);
            }
        });
		button[3].setBounds(255, 0, 85, 65);
		panel_7.add(button[3]);

		button[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[4]) { 
            		change_button(4);
            		textField.setText("");
            	}
            }
        });
		button[4].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,4);
            }
        });
		button[4].setBounds(340, 0, 85, 65);
		panel_7.add(button[4]);

		button[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[5]) { 
            		change_button(5);
            		textField.setText("");
            	}
            }
        });
		button[5].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,5);
            }
        });
		button[5].setBounds(425, 0, 85, 65);
		panel_7.add(button[5]);

		button[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[6]) { 
            		change_button(6);
            		textField.setText("");
            	}
            }
        });
		button[6].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,6);
            }
        });
		button[6].setBounds(510, 0, 85, 65);
		panel_7.add(button[6]);

		button[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[7]) { 
            		change_button(7);
            		textField.setText("");
            	}
            }
        });
		button[7].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,7);
            }
        });
		button[7].setBounds(0, 65, 85, 65);
		panel_7.add(button[7]);

		button[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[8]) { 
            		change_button(8);
            		textField.setText("");
            	}
            }
        });
		button[8].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,8);
            }
        });
		button[8].setBounds(85, 65, 85, 65);
		panel_7.add(button[8]);

		button[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[9]) { 
            		change_button(9);
            		textField.setText("");
            	}
            }
        });		
		button[9].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,9);
            }
        });
		button[9].setBounds(170, 65, 85, 65);
		panel_7.add(button[9]);

		button[10].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[10]) { 
            		change_button(10);
            		textField.setText("");
            	}
            }
        });
		button[10].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,10);
            }
        });
		button[10].setBounds(255, 65, 85, 65);
		panel_7.add(button[10]);

		button[11].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[11]) { 
            		change_button(11);
            		textField.setText("");
            	}
            }
        });
		button[11].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,11);
            }
        });
		button[11].setBounds(340, 65, 85, 65);
		panel_7.add(button[11]);

		button[12].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[12]) { 
            		change_button(12);
            		textField.setText("");
            	}
            }
        });
		button[12].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,12);
            }
        });
		button[12].setBounds(425, 65, 85, 65);
		panel_7.add(button[12]);

		button[13].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[13]) { 
            		change_button(13);
            		textField.setText("");
            	}
            }
        });
		button[13].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,13);
            }
        });
		button[13].setBounds(510, 65, 85, 65);
		panel_7.add(button[13]);

		button[14].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[14]) { 
            		change_button(14);
            		textField.setText("");
            	}
            }
        });
		button[14].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,14);
            }
        });
		button[14].setBounds(0, 130, 85, 65);
		panel_7.add(button[14]);

		button[15].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[15]) { 
            		change_button(15);
            		textField.setText("");
            	}
            }
        });
		button[15].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,15);
            }
        });
		button[15].setBounds(85, 130, 85, 65);
		panel_7.add(button[15]);

		button[16].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[16]) { 
            		change_button(16);
            		textField.setText("");
            	}
            }
        });
		button[16].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,16);
            }
        });
		button[16].setBounds(170, 130, 85, 65);
		panel_7.add(button[16]);

		button[17].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[17]) { 
            		change_button(17);
            		textField.setText("");
            	}
            }
        });
		button[17].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,17);
            }
        });
		button[17].setBounds(255, 130, 85, 65);
		panel_7.add(button[17]);

		button[18].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[18]) { 
            		change_button(18);
            		textField.setText("");
            	}
            }
        });
		button[18].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,18);
            }
        });
		button[18].setBounds(340, 130, 85, 65);
		panel_7.add(button[18]);

		button[19].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[19]) { 
            		change_button(19);
            		textField.setText("");
            	}
            }
        });
		button[19].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,19);
            }
        });
		button[19].setBounds(425, 130, 85, 65);
		panel_7.add(button[19]);

		button[20].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[20]) { 
            		change_button(20);
            		textField.setText("");
            	}
            }
        });
		button[20].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,20);
            }
        });
		button[20].setBounds(510, 130, 85, 65);
		panel_7.add(button[20]);

		button[21].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[21]) { 
            		change_button(21);
            		textField.setText("");
            	}
            }
        });
		button[21].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,21);
            }
        });
		button[21].setBounds(0, 195, 85, 65);
		panel_7.add(button[21]);

		button[22].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[22]) { 
            		change_button(22);
            		textField.setText("");
            	}
            }
        });
		button[22].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,22);
            }
        });
		button[22].setBounds(85, 195, 85, 65);
		panel_7.add(button[22]);

		button[23].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[23]) { 
            		change_button(23);
            		textField.setText("");
            	}
            }
        });
		button[23].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,23);
            }
        });
		button[23].setBounds(170, 195, 85, 65);
		panel_7.add(button[23]);
	
		button[24].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[24]) { 
            		change_button(24);
            		textField.setText("");
            	}
            }
        });
		button[24].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,24);
            }
        });
		button[24].setBounds(255, 195, 85, 65);
		panel_7.add(button[24]);

		button[25].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[25]) { 
            		change_button(25);
            		textField.setText("");
            	}
            }
        });
		button[25].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,25);
            }
        });
		button[25].setBounds(340, 195, 85, 65);
		panel_7.add(button[25]);

		button[26].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[26]) { 
            		change_button(26);
            		textField.setText("");
            	}
            }
        });
		button[26].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,26);
            }
        });
		button[26].setBounds(425, 195, 85, 65);
		panel_7.add(button[26]);

		button[27].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[27]) { 
            		change_button(27);
            		textField.setText("");
            	}
            }
        });
		button[27].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,27);
            }
        });
		button[27].setBounds(510, 195, 85, 65);
		panel_7.add(button[27]);

		button[28].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[28]) { 
            		change_button(28);
            		textField.setText("");
            	}
            }
        });
		button[28].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,28);
            }
        });
		button[28].setBounds(0, 260, 85, 65);
		panel_7.add(button[28]);

		button[29].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[29]) { 
            		change_button(29);
            		textField.setText("");
            	}
            }
        });
		button[29].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,29);
            }
        });
		button[29].setBounds(85, 260, 85, 65);
		panel_7.add(button[29]);

		button[30].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[30]) { 
            		change_button(30);
            		textField.setText("");
            	}
            }
        });
		button[30].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,30);
            }
        });
		button[30].setBounds(170, 260, 85, 65);
		panel_7.add(button[30]);

		button[31].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[31]) { 
            		change_button(31);
            		textField.setText("");
            	}
            }
        });
		button[31].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,31);
            }
        });
		button[31].setBounds(255, 260, 85, 65);
		panel_7.add(button[31]);

		button[32].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[32]) { 
            		change_button(32);
            		textField.setText("");
            	}
            }
        });
		button[32].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,32);
            }
        });
		button[32].setBounds(340, 260, 85, 65);
		panel_7.add(button[32]);

		button[33].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[33]) { 
            		change_button(33);
            		textField.setText("");
            	}
            }
        });
		button[33].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,33);
            }
        });
		button[33].setBounds(425, 260, 85, 65);
		panel_7.add(button[33]);

		button[34].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[34]) { 
                		if(days_1.Years[41] == 2050 && days_1.Months[41] == 1 )
                			textField.setText("无法读取该日期！");
                        else{
                		change_button(34);
                		textField.setText("");
                        }
            	}
            }
        });
		button[34].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,34);
            }
        });
		button[34].setBounds(510, 260, 85, 65);
		panel_7.add(button[34]);

		button[35].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[35]) { 
                		if(days_1.Years[41] == 2050 && days_1.Months[41] == 1 )
                			textField.setText("无法读取该日期！");
                        else{
                		change_button(35);
                		textField.setText("");
                        }
            	}
            }
        });
		button[35].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,35);
            }
        });
		button[35].setBounds(0, 325, 85, 65);
		panel_7.add(button[35]);

		button[36].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[36]) { 
                		if(days_1.Years[41] == 2050 && days_1.Months[41] == 1 )
                			textField.setText("无法读取该日期！");
                        else{
                		change_button(36);
                		textField.setText("");
                        }
            	}
            }
        });
		button[36].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,36);
            }
        });
		button[36].setBounds(85, 325, 85, 65);
		panel_7.add(button[36]);

		button[37].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[37]) { 
                		if(days_1.Years[41] == 2050 && days_1.Months[41] == 1 )
                			textField.setText("无法读取该日期！");
                        else{
                		change_button(37);
                		textField.setText("");
                        }
            	}
            }
        });
		button[37].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,37);
            }
        });
		button[37].setBounds(170, 325, 85, 65);
		panel_7.add(button[37]);

		button[38].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[38]) { 
                		if(days_1.Years[41] == 2050 && days_1.Months[41] == 1 )
                			textField.setText("无法读取该日期！");
                        else{
                		change_button(38);
                		textField.setText("");
                        }
            	}
            }
        });
		button[38].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,38);
            }
        });
		button[38].setBounds(255, 325, 85, 65);
		panel_7.add(button[38]);

		button[39].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[39]) { 
                		if(days_1.Years[41] == 2050 && days_1.Months[41] == 1 )
                			textField.setText("无法读取该日期！");
                        else{
                		change_button(39);
                		textField.setText("");
                        }
            	}
            }
        });
		button[39].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,39);
            }
        });
		button[39].setBounds(340, 325, 85, 65);
		panel_7.add(button[39]);

		button[40].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[40]) { 
                		if(days_1.Years[41] == 2050 && days_1.Months[41] == 1 )
                			textField.setText("无法读取该日期！");
                        else{
                		change_button(40);
                		textField.setText("");
                        }
            	}
            }
        });
		button[40].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,40);
            }
        });
		button[40].setBounds(425, 325, 85, 65);
		panel_7.add(button[40]);

		button[41].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==button[41]) { 
                		if(days_1.Years[41] == 2050 && days_1.Months[41] == 1 )
                			textField.setText("无法读取该日期！");
                        else{
                		change_button(41);
                		textField.setText("");
                        }
            	}
            }
        });
		button[41].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	Shuangji(e,41);
            }
        });
		button[41].setBounds(510, 325, 85, 65);
		panel_7.add(button[41]);
	}
	
	public void change_button(int a) {  //根据日期改变按钮所用的图片
		textField.setText("");  
		if(Login_a.launching_return()==3)//修改登录状态
			Notepad_a.setUsername(Login_a.get_name());
		else
			Notepad_a.setUsername("default");
		int ss_1,ss_2,ss_3;
		ss_1=days_a[a];
		ss_2=months_a[a];
		ss_3=years_a[a];
		Notepad_a.setYear(days_1.getYear(a));
		Notepad_a.setMonth(days_1.getMonth(a));
		Notepad_a.setDay(days_1.getDay(a));
		
		days_1.DAY_in_MONTH(ss_3,ss_2);//根据按钮的年月算目标月的显示
		days_a=days_1.getdays();
		months_a=days_1.getMonths();
		years_a=days_1.getYears();
		
		tmpCale.set(ss_3,ss_2-1,ss_1);
		LunarCalendar lunarCalendar=new LunarCalendar(tmpCale);
		button_36.setText(lunarCalendar.getnian()+"年");
		button_37.setText(lunarCalendar.getShengxiao()+"年");
		button_40.setText(lunarCalendar.getyue()+"月"+lunarCalendar.getri()+"日");
		for (int n=0;n<42;n++) {
			if (n!=a) {  //如果是点击的那个按钮，则变色，不是的不变色
				if(n < days_1.GetStartDay(days_1.getYear(15),days_1.getMonth(15)) 
|| n >= days_1.GetStartDay(days_1.getYear(15),days_1.getMonth(15)) + days_1.GetNumOfDaysInMonth(days_1.getYear(15),days_1.getMonth(15))) 
					button[n].setIcon(icon_c.getImage(days_a[n]));
				else {
                     if(Notepad_a.isNote(years_a[n],months_a[n],days_a[n])){
					button[n].setIcon(icon_a.getImage(days_a[n]));}
				else
					button[n].setIcon(icon_d.getImage(days_a[n]));
                     }}
			else {
				textField_47.setText(ss_3 + "年" + ss_2 + "月" + ss_1 +"日");
				    button_35.setIcon(icon_e.getImage(ss_1));
				if(Notepad_a.frmNotepad.isVisible()) {
				Notepad_a.ReadRecord();
				}
			}
		}
		
		for (int n=0;n<42;n++) {
			if (days_a[n]!=ss_1) {
//-----------------------------------------------------------------------------------------------------------------------------
				if(n < days_1.GetStartDay(days_1.getYear(15),days_1.getMonth(15)) || n >= days_1.GetStartDay(days_1.getYear(15),days_1.getMonth(15)) + days_1.GetNumOfDaysInMonth(days_1.getYear(15),days_1.getMonth(15))) 
					button[n].setIcon(icon_c.getImage(days_a[n]));
				else
					if(!Notepad_a.isNote(years_a[n],months_a[n],days_a[n])){
						button[n].setIcon(icon_a.getImage(days_a[n]));}
		   else
						button[n].setIcon(icon_d.getImage(days_a[n]));
//-----------------------------------------------------------------------------------------------------------------------------
			}
			if (days_a[n]==ss_1 && months_a[n]==ss_2) {	
				if(Notepad_a.isNote(ss_3, ss_2, ss_1))
				button[n].setIcon(icon_f.getImage(ss_1));
				else
					button[n].setIcon(icon_b.getImage(days_a[n]));
			}
		      
		}
	}

	
	public void Shuangji(MouseEvent e,int a){//双击触发的事件
		if (e.getClickCount() == 2 && days_1.Months[a] == days_1.Months[15]) {
	    	Notepad_a.setYear(days_1.Years[a]);
			Notepad_a.setMonth(days_1.Months[a]);
			Notepad_a.setDay(days_1.Days[a]);
			Notepad_a.ReadRecord();
	    	Notepad_a.frmNotepad.setVisible(true);}	 
		textField.setText("");
		}


   public void Play(JButton x,MP3Player m){//播放音乐的函数
	   if(!isPlay){
			x.setIcon(icon_c.getImage(0));	
			m.start();
			isPlay = true;
		}
		else{
			x.setIcon(icon_b.getImage(0));	
			m.stop();
			isPlay = false;
		}
   }
}