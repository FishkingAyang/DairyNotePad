package Hethod;
import �������±�.*;

public class Showdays {
	public  int [] Days=new int[42];
	public  int [] Months=new int[42];
	public  int [] Years=new int[42];
	public  int FDay;
	public  int StartDay;
	
	public void DAY_in_MONTH(int year,int month){//д������		
		StartDay = (GetStartDay(year,month));
		int monthday = GetNumOfDaysInMonth(year,month);
		if(month == 1)
		   FDay = GetNumOfDaysInMonth(year - 1,12);
		else
		   FDay = GetNumOfDaysInMonth(year,month - 1);
		for(int i = StartDay - 1;i > -1;i --){
			Days[i] = FDay--;
			if(month == 1){
				Months[i] =  12;
			    Years[i] = year - 1;}
				else{
					Months[i] =  month - 1;
				    Years[i] = year ;
				}

		}
		int j = 1;
		for(int i = StartDay;i < StartDay + monthday; i++){
			Days[i] = j++ ;
			Months[i] =  month;
		    Years[i] = year ;
			}
		j = 1;
		for(int i = StartDay + monthday;i < 42;i++){
			Days[i] = j++ ;
			if(month == 12){
				Months[i] =  1;
			    Years[i] = year + 1;}
				else{
					Months[i] =  month + 1;
				    Years[i] = year ;
				}
		}
	}
	
	public int GetStartDay(int year,int month) {  //��ÿ�ʼ������
		int START_DAY_FOR_JAN_1_0001 = 1;  //��ԪԪ��һ��һ��Ϊ����һ
		long Totalnumofdays = GetTotalNumOfDays(year,month); 
		int n = (int)((Totalnumofdays + START_DAY_FOR_JAN_1_0001) % 7);
		if(n == 0)
		n = 7;
		return n; }  
	
	public  long GetTotalNumOfDays(int year,int month) {  //��ԪԪ��1��1�յ����ڵ�����
		long total = 0;  
		for(int i = 1;i < year;i++) {  
			if(IsLeapYear(i)) 
				total = total + 366; 
			else  total = total + 365; }   
		for(int i = 1;i < month;i++)  
			total = total + GetNumOfDaysInMonth(year,i);
		return total;  }
	
	public  int GetNumOfDaysInMonth(int year,int month) {//�����Ӧ�·ݵ�����
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2) return IsLeapYear(year) ? 29:28;
		    return 0;
	}
	
	public static boolean IsLeapYear(int year) {//����ƽ���ж�
		return year % 400 == 0 || (year % 4 == 0 && year  % 100 != 0);
	}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------	   
	public int[] getdays() {
		return Days;			
	}
	
	public int [] getYears(){
		return Years;
	}
	
	public int [] getMonths(){
		return Months;
	}
	   
	public int getLastN(int a){
		    return   Days[a] + GetStartDay(Years[a],Months[a]) ;
	}
	
	public int getNextN(int a){
		return   Days[a] + GetStartDay(Years[a],Months[a]);
	}
	
	public int getYear(int n){
		return Years[n];
	}
	
	public int getMonth(int n){
		return Months[n];
	}
	
	public int getDay(int n){
		return Days[n];
	}
	
	public void show(){
		for(int i=0;i<42;i++)
			System.out.println(Days[i]+" "+Months[i]+" "+Years[i]);
	}
}