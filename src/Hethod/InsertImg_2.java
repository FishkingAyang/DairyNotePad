package Hethod;

import javax.swing.ImageIcon;

public class InsertImg_2 {
		ImageIcon [] icon = new ImageIcon[32];
		public InsertImg_2() {
		icon[0] = new ImageIcon("Img/jinyin.gif","");	
		icon[1] = new ImageIcon("Img/1'.gif","");
		icon[2] = new ImageIcon("Img/2'.gif","");
		icon[3] = new ImageIcon("Img/3'.gif","");
		icon[4] = new ImageIcon("Img/4'.gif","");
		icon[5] = new ImageIcon("Img/5'.gif","");
		icon[6] = new ImageIcon("Img/6'.gif","");
		icon[7] = new ImageIcon("Img/7'.gif","");
		icon[8] = new ImageIcon("Img/8'.gif","");
		icon[9] = new ImageIcon("Img/9'.gif","");
		icon[10] = new ImageIcon("Img/10'.gif","");
		icon[11] = new ImageIcon("Img/11'.gif","");
		icon[12] = new ImageIcon("Img/12'.gif","");
		icon[13] = new ImageIcon("Img/13'.gif","");
		icon[14] = new ImageIcon("Img/14'.gif","");
		icon[15] = new ImageIcon("Img/15'.gif","");
		icon[16] = new ImageIcon("Img/16'.gif","");
		icon[17] = new ImageIcon("Img/17'.gif","");
		icon[18] = new ImageIcon("Img/18'.gif","");
		icon[19] = new ImageIcon("Img/19'.gif","");
		icon[20] = new ImageIcon("Img/20'.gif","");
		icon[21] = new ImageIcon("Img/21'.gif","");
		icon[22] = new ImageIcon("Img/22'.gif","");
		icon[23] = new ImageIcon("Img/23'.gif","");
		icon[24] = new ImageIcon("Img/24'.gif","");
		icon[25] = new ImageIcon("Img/25'.gif","");
		icon[26] = new ImageIcon("Img/26'.gif","");
		icon[27] = new ImageIcon("Img/27'.gif","");
		icon[28] = new ImageIcon("Img/28'.gif","");
		icon[29] = new ImageIcon("Img/29'.gif","");
		icon[30] = new ImageIcon("Img/30'.gif","");
		icon[31] = new ImageIcon("Img/31'.gif","");
		}
		
		public ImageIcon getImage(int days) {
			int n=0;
			n=days;
			return icon[n];
		}
}
