package Hethod;   //ʵ�ֶ��ޱ߿򴰿ڵ���ק


import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;

public class P {

	private JFrame frame;
	// ȫ�ֵ�λ�ñ��������ڱ�ʾ����ڴ����ϵ�λ��
	static Point origin = new Point();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P window = new P();
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
	public P() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 290);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setUndecorated(true);

		frame.addMouseListener(new MouseAdapter() {
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
	}

}  //ʵ�ֶ��ޱ߿򴰿ڵ���ק
