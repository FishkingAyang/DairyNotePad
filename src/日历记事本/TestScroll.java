package �������±�;
import javax.swing.*;

public class TestScroll {
 public TestScroll(){
  JFrame jf=new JFrame("test");
  JPanel jp=new JPanel();
  JTextArea jta=new JTextArea(8,20);
  JScrollPane jsp=new JScrollPane(jta);//�½�һ�����������棬���ı�����
  jp.add(jsp);//ע�⣺��������������ӵ��齨�У�����������ı�����
  jf.add(jp);
  
  jf.pack();
  jf.setLocation(300,300);
  jf.setVisible(true);
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public static void main(String[] args) {
  new TestScroll();
 }
}
