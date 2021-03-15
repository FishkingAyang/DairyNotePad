package Hethod;

import javax.swing.ImageIcon;


	public class InsertImg_6 {
		ImageIcon [] icon = new ImageIcon[32];
		public InsertImg_6() {
			icon[1] = new ImageIcon("Img/q1.gif","");
			icon[2] = new ImageIcon("Img/q2.gif","");
			icon[3] = new ImageIcon("Img/q3.gif","");
			icon[4] = new ImageIcon("Img/q4.gif","");
			icon[5] = new ImageIcon("Img/q5.gif","");
			icon[6] = new ImageIcon("Img/q6.gif","");
			icon[7] = new ImageIcon("Img/q7.gif","");
			icon[8] = new ImageIcon("Img/q8.gif","");
			icon[9] = new ImageIcon("Img/q9.gif","");
			icon[10] = new ImageIcon("Img/q10.gif","");
			icon[11] = new ImageIcon("Img/q11.gif","");
			icon[12] = new ImageIcon("Img/q12.gif","");
			icon[13] = new ImageIcon("Img/q13.gif","");
			icon[14] = new ImageIcon("Img/q14.gif","");
			icon[15] = new ImageIcon("Img/q15.gif","");
			icon[16] = new ImageIcon("Img/q16.gif","");
			icon[17] = new ImageIcon("Img/q17.gif","");
			icon[18] = new ImageIcon("Img/q18.gif","");
			icon[19] = new ImageIcon("Img/q19.gif","");
			icon[20] = new ImageIcon("Img/q20.gif","");
			icon[21] = new ImageIcon("Img/q21.gif","");
			icon[22] = new ImageIcon("Img/q22.gif","");
			icon[23] = new ImageIcon("Img/q23.gif","");
			icon[24] = new ImageIcon("Img/q24.gif","");
			icon[25] = new ImageIcon("Img/q25.gif","");
			icon[26] = new ImageIcon("Img/q26.gif","");
			icon[27] = new ImageIcon("Img/q27.gif","");
			icon[28] = new ImageIcon("Img/q28.gif","");
			icon[29] = new ImageIcon("Img/q29.gif","");
			icon[30] = new ImageIcon("Img/q30.gif","");
			icon[31] = new ImageIcon("Img/q31.gif","");

		}
		
		public ImageIcon getImage(int days) {
			int n=0;
			n=days;
			return icon[n];
		}
	}


