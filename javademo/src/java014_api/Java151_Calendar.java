package java014_api;

import java.util.Calendar;

/*
 * 수능일 : 2022-11-17
 * 오늘 : 2022-10-20
 * 남은일 : 15
 */
public class Java151_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2022;
		int examDay_month = 11;
		int examday_date = 17;
		
		examDay.set(examDay_year, examDay_month-1,examday_date);
		System.out.printf("수능일 : %d-%d-%d\n",examDay_year, examDay_month,examday_date);
		
		Calendar today = Calendar.getInstance();
//		System.out.println(today);

		long eventDay = examDay.getTimeInMillis();
		long nowDay = today.getTimeInMillis();
		System.out.println("eventDay :"+eventDay);
		System.out.println("nowDay :" + nowDay);
		
		long endDay = (eventDay-nowDay)/(60*60*24*1000);
		System.out.println("남은일 :" + endDay);
		
//		System.out.println(60*60*24*1000);
	}

}
