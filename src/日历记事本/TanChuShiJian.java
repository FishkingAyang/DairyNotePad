package 日历记事本;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TanChuShiJian extends JFrame implements ActionListener {

	public TanChuShiJian() {
		// TODO Auto-generated constructor stub
		Container c = getContentPane();
		c.setLayout(null);
		JButton b = new JButton("测试");
		b.addActionListener(this);  //为按钮添加事件
		b.setBounds(10, 10, 150, 30);
		c.add(b);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("测试".equals(e.getActionCommand())) {
			System.out.println("1111111111");
			new NewFrame();
		}
		
	}
	public static void main(String[] args) {
		new TanChuShiJian();
	}

}

class NewFrame extends JFrame {
	public NewFrame() {
		// TODO Auto-generated constructor stub
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.add(new JLabel("我是新窗口！"));
		
		c.add(p);
		setSize(200, 300);
		setVisible(true);
	}
}
