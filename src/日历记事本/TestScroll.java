package 日历记事本;
import javax.swing.*;

public class TestScroll {
 public TestScroll(){
  JFrame jf=new JFrame("test");
  JPanel jp=new JPanel();
  JTextArea jta=new JTextArea(8,20);
  JScrollPane jsp=new JScrollPane(jta);//新建一个滚动条界面，将文本框传入
  jp.add(jsp);//注意：将滚动条界面添加到组建中，而不是添加文本框了
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
