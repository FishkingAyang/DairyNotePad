package �������±�;

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
		JButton b = new JButton("����");
		b.addActionListener(this);  //Ϊ��ť����¼�
		b.setBounds(10, 10, 150, 30);
		c.add(b);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("����".equals(e.getActionCommand())) {
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
		p.add(new JLabel("�����´��ڣ�"));
		
		c.add(p);
		setSize(200, 300);
		setVisible(true);
	}
}
