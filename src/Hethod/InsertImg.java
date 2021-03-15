package Hethod;

import javax.swing.ImageIcon;

public class InsertImg {
		ImageIcon [] icon = new ImageIcon[32];
		public InsertImg() {
		icon[0] = new ImageIcon("Img/calendar.png");
		icon[1] = new ImageIcon("Img/day_1.gif","");
		icon[2] = new ImageIcon("Img/day_2.gif","");
		icon[3] = new ImageIcon("Img/day_3.gif","");
		icon[4] = new ImageIcon("Img/day_4.gif","");
		icon[5] = new ImageIcon("Img/day_5.gif","");
		icon[6] = new ImageIcon("Img/day_6.gif","");
		icon[7] = new ImageIcon("Img/day_7.gif","");
		icon[8] = new ImageIcon("Img/day_8.gif","");
		icon[9] = new ImageIcon("Img/day_9.gif","");
		icon[10] = new ImageIcon("Img/day_10.gif","");
		icon[11] = new ImageIcon("Img/day_11.gif","");
		icon[12] = new ImageIcon("Img/day_12.gif","");
		icon[13] = new ImageIcon("Img/day_13.gif","");
		icon[14] = new ImageIcon("Img/day_14.gif","");
		icon[15] = new ImageIcon("Img/day_15.gif","");
		icon[16] = new ImageIcon("Img/day_16.gif","");
		icon[17] = new ImageIcon("Img/day_17.gif","");
		icon[18] = new ImageIcon("Img/day_18.gif","");
		icon[19] = new ImageIcon("Img/day_19.gif","");
		icon[20] = new ImageIcon("Img/day_20.gif","");
		icon[21] = new ImageIcon("Img/day_21.gif","");
		icon[22] = new ImageIcon("Img/day_22.gif","");
		icon[23] = new ImageIcon("Img/day_23.gif","");
		icon[24] = new ImageIcon("Img/day_24.gif","");
		icon[25] = new ImageIcon("Img/day_25.gif","");
		icon[26] = new ImageIcon("Img/day_26.gif","");
		icon[27] = new ImageIcon("Img/day_27.gif","");
		icon[28] = new ImageIcon("Img/day_28.gif","");
		icon[29] = new ImageIcon("Img/day_29.gif","");
		icon[30] = new ImageIcon("Img/day_30.gif","");
		icon[31] = new ImageIcon("Img/day_31.gif","");
		}
		
		public ImageIcon getImage(int days) {
			int n=0;
			n=days;
			return icon[n];
		}
}
