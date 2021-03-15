package Hethod;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Clock2 extends JFrame implements Runnable{
	static Clock2 frm = new Clock2();
	public static JPanel panel= new JPanel(new FlowLayout());
	public static ImageIcon[] icon = new ImageIcon[11];
	Thread clock;
	//196*67
	public static void main(String args[]) {
		int xHour,yHour,xMinute,yMinute,xSecond,ySecond;
		Calendar now=new GregorianCalendar(); 
		now.setTime(new Date());
		int hour = now.get(Calendar.HOUR_OF_DAY); //得到小时数
		int minute = now.get(Calendar.MINUTE);   //得到分数
		int second = now.get(Calendar.SECOND);  //得到秒数		
		xHour = hour / 10;
		yHour = hour % 10;
		xMinute = minute / 10;
	    yMinute = minute % 10;
	    xSecond = second / 10;
	    ySecond = second % 10;
		Container pane;
		
		JLabel L1, L2, L3,L4,L5,L6,Q1,Q2;
		frm.setSize(196, 67);
		pane = frm.getContentPane();
		//panel = new JPanel(new FlowLayout());
		
		frm.setImage();
		Q1 = new JLabel("",SwingConstants.CENTER);
		Q1.setIcon(icon[10]);
		Q2 = new JLabel("",SwingConstants.CENTER);
		Q2.setIcon(icon[10]);
		L1 = new JLabel("",SwingConstants.CENTER);
		L1.setIcon(icon[xHour]);
		L2 = new JLabel("",SwingConstants.CENTER);
		L2.setIcon(icon[yHour]);
		L3 = new JLabel("",SwingConstants.CENTER);
		L3.setIcon(icon[xMinute]);
		L4 = new JLabel("",SwingConstants.CENTER);
		L4.setIcon(icon[yMinute]);
		L5 = new JLabel("",SwingConstants.CENTER);
		L5.setIcon(icon[xSecond]);
		L6 = new JLabel("",SwingConstants.CENTER);
		L6.setIcon(icon[ySecond]);
		
		pane.setBackground(new Color(255, 255, 200));
		panel.setBackground(new Color(255, 255, 214));
		pane.add(panel, BorderLayout.CENTER);
		panel.add(L1);
		panel.add(L2);
		panel.add(Q1);
		panel.add(L3);
		panel.add(L4);
		panel.add(Q2);
		panel.add(L5);
		panel.add(L6);
		frm.setVisible(true);
	}
	public void setImage(){
        icon[0] = new ImageIcon("0.gif","");
        icon[1] = new ImageIcon("1.gif","");
		icon[2] = new ImageIcon("2.gif","");
		icon[3] = new ImageIcon("3.gif","");
		icon[4] = new ImageIcon("4.gif","");
		icon[5] = new ImageIcon("5.gif","");
		icon[6] = new ImageIcon("6.gif","");
		icon[7] = new ImageIcon("7.gif","");
		icon[8] = new ImageIcon("8.gif","");
		icon[9] = new ImageIcon("9.gif","");
		icon[10] = new ImageIcon("00.gif","");

}
	public void start()
	 { //开始进程
	   if(clock==null)//如果进程为空值
	   {
	      clock=new Thread(this); //实例化进程
	      clock.start(); //开始进程
	   }
	 }
	public void run()//运行进程
	{ 
	   while (clock!=null)
	   {
	      repaint(); //调用paint方法重绘界面
	      try
	      {
	        Thread.sleep(1000);  //线程暂停一秒(1000毫秒)
	      }
	      catch (InterruptedException ex){
	      ex.printStackTrace();  //输出出错信息
	   }
	  }
	 }
	public void stop()//停止进程
	{ 
	   clock=null;
	}
}


