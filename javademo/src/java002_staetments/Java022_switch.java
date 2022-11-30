package java002_staetments;

public class Java022_switch {
	static int num;//멤버변수(객체에서)
	public static void main(String[] args) {
		//30 : 4, 6, 9,11
		//31 :1 ,3 ,5 ,7 ,8 ,10, 12
		//28 or 29 : 2
		int year = 2012; //년도 
		int month = 1;//월
		int lastDay = -1;//마지막일
		if(!(month>=1 && month<=12)) {
			System.out.println("1월 ~ 12월만 가능");
			return; //main() 메소드를 빠져나옴
		}
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:lastDay =30; break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: lastDay = 31; break;
		default:
			if(year %4 ==0 && year%100!=0) {
				lastDay = 29; //윤년이면 29
				
			}else {
				lastDay = 28; //평년이면 28
		
			}
		
		}
		
		System.out.printf("%d년도 %d월의 마지막일은 %d입니다.\n",year,month,lastDay);
		
	}

}
