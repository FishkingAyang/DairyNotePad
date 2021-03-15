package �������±�;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.util.Date;
import java.util.Calendar;
import java.awt.Toolkit;
import javax.swing.DropMode;



public class Notepad {                //�������

	JFrame frmNotepad;
	private static JTextField textField;
	private String username="Default";
    public static int year,month,day;
    public static Calendar a=Calendar.getInstance();
    public static JTextArea jta=new JTextArea(8,20);

	/**
	 * Launch the application.
	 */
	public void setYear(int year){
		this.year = year;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setDay(int day){
		this.day = day;
	}
	
	public static void main(String[] args) {
	    year = a.get(Calendar.YEAR);
	    month = a.get(Calendar.MONTH)+1;
	    day = a.get(Calendar.DATE);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad window = new Notepad();
					window.frmNotepad.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} 
	

	/**
	 * Create the application.
	 */
	public Notepad() {		
		initialize();
		this.frmNotepad.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNotepad = new JFrame();
		frmNotepad.setResizable(false);
		frmNotepad.setTitle("NOTEPAD");
		frmNotepad.setAlwaysOnTop(true);
		frmNotepad.setType(Type.UTILITY);
		frmNotepad.setBounds(100, 100, 361, 459);
		frmNotepad.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(0, 0, 355, 52);
		frmNotepad.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNotePad = new JLabel("���±�",JLabel.CENTER);//д�ż��±��ı�ǩ
		lblNotePad.setFont(new java.awt.Font("���Ŀ���", 0, 25));
		lblNotePad.setBounds(109, 7, 127, 37);
		panel.add(lblNotePad);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(211, 211, 211));
		panel_2.setBounds(0, 341, 355, 92);
		frmNotepad.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton button = new JButton("����");
		button.setFocusPainted(false);
		button.setFont(new java.awt.Font("���Ŀ���", 0, 15));
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.setBorderPainted(false);	
		button.setBorder(new EmptyBorder(0,0,0,0)); 
		button.setBounds(47, 26, 106, 23);
		panel_2.add(button);
		
		JButton button_3 = new JButton("ɾ����¼");
		button_3.setFont(new Font("���Ŀ���", Font.PLAIN, 15));
		button_3.setFocusPainted(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(new EmptyBorder(0,0,0,0));
		button_3.setBackground(SystemColor.inactiveCaptionBorder);
		button_3.setBounds(200, 26, 106, 23);
		panel_2.add(button_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(9, 61, 336, 21);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 52, 355, 290);
		frmNotepad.getContentPane().add(panel_1);
		  panel_1.setLayout(null);
		  jta.setLineWrap(true);
		
		  
		  jta.setBackground(new Color(245, 245, 245));
		  jta.setFont(new java.awt.Font("���Ŀ���", 0, 20));
		  JScrollPane jsp=new JScrollPane(jta);
		  jsp.setBounds(0, 0, 356, 290);
		  panel_1.add(jsp);//ע�⣺��������������ӵ��齨�У�����������ı�����
		  
		  button.addActionListener(new ActionListener() {//���水ť
	            public void actionPerformed(ActionEvent e) {
	            	WriteRecord();
	            }
	        });	  
		  button_3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	DeleteFile();
	            	
	            }
	        });
		
	}
	//�����潨ִ�е��¼�
	public void WriteRecord()  {   //д����Ӧ�ļ��±�����
		String content;   
		content=jta.getText();   
		int n=content.length();   
		char[] contentarr=new char[n];  
		try  {  int i=0;   for(i=0;i<n;i++)  {   
			contentarr[i]=content.charAt(i);  } 
		if(contentarr.length>0){
		File Diary = new File("Diary");  
		Diary.mkdir();  
		String Fname = Filename(year,month,day,getUsername());
		File myfile=new File("Diary\\"+Fname+".txt");  
		FileWriter Record=new FileWriter(myfile); 		
		for(i=0;i<contentarr.length;i++)  {   
			Record.write(contentarr[i] - 1);  }  //����-1�����ݼ���
		Record.close();
		Toolkit.getDefaultToolkit().beep(); 
		textField.setText("����ɹ�!"); 
		}
		else{
		Toolkit.getDefaultToolkit().beep(); 
		textField.setText("����ʧ�ܣ��������ַ���");
		}}  
		catch(IOException ex) { }  } 
	//��ȡ��¼
	public  void ReadRecord()  {  
		try  {   
			String content="";  
			String Fname = Filename(year,month,day,getUsername());
			File myfile=new File("Diary\\"+ Fname +".txt"); 
			FileReader Record=new FileReader(myfile);     
			long b=myfile.length();     
				while((b=Record.read())!=-1)     
					content=content+(char)(b+1); //����+1�����ݽ���    
				jta.setText(content);        
			Record.close(); 
			textField.setText("");} 
		    catch(IOException ex) { 
		    	jta.setText(""); 
		    	textField.setText("����û�м�¼");
		    	}  }   
	//����ɾ�������¼�
	public void DeleteFile()  { //ɾ����¼
		Toolkit.getDefaultToolkit().beep();
		String Fname = Filename(year,month,day,getUsername());
		String filepath="Diary\\" + Fname + ".txt";  
		File f = new File(filepath); // ����Ҫɾ�����ļ�λ��
		int n=JOptionPane.showConfirmDialog(null,"ȷ��ɾ��������¼��","ȷ��",JOptionPane.YES_NO_CANCEL_OPTION);  
		if(n==JOptionPane.YES_OPTION) {   
			if(f.exists()){
				f.delete();
				Toolkit.getDefaultToolkit().beep(); 
				textField.setText("ɾ���ɹ�!");  
				Toolkit.getDefaultToolkit().beep();
				jta.setText("");}
			else{
				textField.setText("�ļ������ڣ�ɾ��ʧ�ܣ�");
				Toolkit.getDefaultToolkit().beep(); }
			} 
			   }   
	public String Filename(int year,int month,int day,String username){
		if(month < 10&&day < 10)
		    return username + year + "0" + month + "0" + day;
		if(month > 10&&day < 10)
			return username + year + month + "0" + day;
		if(month < 10&&day > 10)
			return username + year + "0" + month + day;
		else
			return username + year + month + day;
	}
	
	public boolean isNote(int year,int month,int day){//�ж�Ŀ�������Ƿ����

		String Fname = Filename(year,month,day,getUsername());
		File myfile=new File("Diary\\"+ Fname +".txt"); 
		if(myfile.exists())
		return true;
		else
        return false; 
}

	public String getUsername(){//����û���
		return username;
	}
	public void setUsername(String username){//�����û���
		this.username=username;
	}
	
}
