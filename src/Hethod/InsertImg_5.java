package Hethod;
import javax.swing.ImageIcon;

public class InsertImg_5 {
	ImageIcon [] icon = new ImageIcon[32];
	public InsertImg_5() {
		icon[1] = new ImageIcon("Img/x1.gif","");
		icon[2] = new ImageIcon("Img/x2.gif","");
		icon[3] = new ImageIcon("Img/x3.gif","");
		icon[4] = new ImageIcon("Img/x4.gif","");
		icon[5] = new ImageIcon("Img/x5.gif","");
		icon[6] = new ImageIcon("Img/x6.gif","");
		icon[7] = new ImageIcon("Img/x7.gif","");
		icon[8] = new ImageIcon("Img/x8.gif","");
		icon[9] = new ImageIcon("Img/x9.gif","");
		icon[10] = new ImageIcon("Img/x10.gif","");
		icon[11] = new ImageIcon("Img/x11.gif","");
		icon[12] = new ImageIcon("Img/x12.gif","");
		icon[13] = new ImageIcon("Img/x13.gif","");
		icon[14] = new ImageIcon("Img/x14.gif","");
		icon[15] = new ImageIcon("Img/x15.gif","");
		icon[16] = new ImageIcon("Img/x16.gif","");
		icon[17] = new ImageIcon("Img/x17.gif","");
		icon[18] = new ImageIcon("Img/x18.gif","");
		icon[19] = new ImageIcon("Img/x19.gif","");
		icon[20] = new ImageIcon("Img/x20.gif","");
		icon[21] = new ImageIcon("Img/x21.gif","");
		icon[22] = new ImageIcon("Img/x22.gif","");
		icon[23] = new ImageIcon("Img/x23.gif","");
		icon[24] = new ImageIcon("Img/x24.gif","");
		icon[25] = new ImageIcon("Img/x25.gif","");
		icon[26] = new ImageIcon("Img/x26.gif","");
		icon[27] = new ImageIcon("Img/x27.gif","");
		icon[28] = new ImageIcon("Img/x28.gif","");
		icon[29] = new ImageIcon("Img/x29.gif","");
		icon[30] = new ImageIcon("Img/x30.gif","");
		icon[31] = new ImageIcon("Img/x31.gif","");

	}
	
	public ImageIcon getImage(int days) {
		int n=0;
		n=days;
		return icon[n];
	}
}
