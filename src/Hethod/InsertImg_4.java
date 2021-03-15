package Hethod;
import javax.swing.ImageIcon;

public class InsertImg_4 {
	ImageIcon [] icon = new ImageIcon[32];
	public InsertImg_4() {
		icon[0] = new ImageIcon("jinyin.gif","");
		icon[1] = new ImageIcon("Img/d1.gif","");
		icon[2] = new ImageIcon("Img/d2.gif","");
		icon[3] = new ImageIcon("Img/d3.gif","");
		icon[4] = new ImageIcon("Img/d4.gif","");
		icon[5] = new ImageIcon("Img/d5.gif","");
		icon[6] = new ImageIcon("Img/d6.gif","");
		icon[7] = new ImageIcon("Img/d7.gif","");
		icon[8] = new ImageIcon("Img/d8.gif","");
		icon[9] = new ImageIcon("Img/d9.gif","");
		icon[10] = new ImageIcon("Img/d10.gif","");
		icon[11] = new ImageIcon("Img/d11.gif","");
		icon[12] = new ImageIcon("Img/d12.gif","");
		icon[13] = new ImageIcon("Img/d13.gif","");
		icon[14] = new ImageIcon("Img/d14.gif","");
		icon[15] = new ImageIcon("Img/d15.gif","");
		icon[16] = new ImageIcon("Img/d16.gif","");
		icon[17] = new ImageIcon("Img/d17.gif","");
		icon[18] = new ImageIcon("Img/d18.gif","");
		icon[19] = new ImageIcon("Img/d19.gif","");
		icon[20] = new ImageIcon("Img/d20.gif","");
		icon[21] = new ImageIcon("Img/d21.gif","");
		icon[22] = new ImageIcon("Img/d22.gif","");
		icon[23] = new ImageIcon("Img/d23.gif","");
		icon[24] = new ImageIcon("Img/d24.gif","");
		icon[25] = new ImageIcon("Img/d25.gif","");
		icon[26] = new ImageIcon("Img/d26.gif","");
		icon[27] = new ImageIcon("Img/d27.gif","");
		icon[28] = new ImageIcon("Img/d28.gif","");
		icon[29] = new ImageIcon("Img/d29.gif","");
		icon[30] = new ImageIcon("Img/d30.gif","");
		icon[31] = new ImageIcon("Img/d31.gif","");

	}
	
	public ImageIcon getImage(int days) {
		int n=0;
		n=days;
		return icon[n];
	}
}
