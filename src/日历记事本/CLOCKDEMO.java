package �������±�;

import java.awt.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.*;

//����ʱ��
public class CLOCKDEMO extends JPanel implements Runnable {
	Thread clock;
	public CLOCKDEMO() {		
		setLayout(new BorderLayout(5,10));
		start(); // ��ʼ����
		setSize(120, 70); // ���ô��ڳߴ�
		setVisible(true); // ���ڿ���
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �رմ���ʱ�˳�����
	}

	public void start() { // ��ʼ����
		if (clock == null)// �������Ϊ��ֵ
		{
			clock = new Thread(this); // ʵ��������
			clock.start(); // ��ʼ����
		}
	}

	public void run()// ���н���
	{
		while (clock != null) {
			repaint(); // ����paint�����ػ����
			try {
				Thread.sleep(1000); // �߳���ͣһ��(1000����)
			} catch (InterruptedException ex) {
				ex.printStackTrace(); // ���������Ϣ
			}
		}
	}

	public void stop()// ֹͣ����
	{
		clock = null;
	}

	public void paint(Graphics g)// ���������paint����
	{
		Graphics2D g2 = (Graphics2D) g; // �õ�Graphics2D����
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		Calendar now = new GregorianCalendar(); // ʵ������������
		now.setTime(new Date());// dateFormat.format(now.getTime())
		String timeInfo = ""; // �����Ϣ
		int hour = now.get(Calendar.HOUR_OF_DAY); // �õ�Сʱ��
		int minute = now.get(Calendar.MINUTE); // �õ�����
		int second = now.get(Calendar.SECOND); // �õ�����
		if (hour <= 9)
			timeInfo += "0" + hour + ":"; // ��ʽ�����
		else
			timeInfo += hour + ":";
		if (minute <= 9)
			timeInfo += "0" + minute + ":";
		else
			timeInfo += minute + ":";
		if (second <= 9)
			timeInfo += "0" + second;
		else
			timeInfo += second;
		g.setColor(new Color(255, 0, 51)); // ���õ�ǰ��ɫΪǳ��ɫ
		Dimension dim = getSize(); // �õ����ڳߴ�
		g.fillRect(0, 0, dim.width, dim.height); // ��䱳��ɫΪ��ɫ
		g.setFont(new Font("����", Font.BOLD, 40));
		g.setColor(Color.yellow); // ���õ�ǰ��ɫΪ��ɫ
		g.drawString(timeInfo, 5,40); // ��ʾʱ���ַ���

	}

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.add(new CLOCKDEMO());
		j.setFont(new Font("����", Font.BOLD, 20)); 
		j.setSize(120, 70); 
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}