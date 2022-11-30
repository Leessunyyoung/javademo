package java006_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		int pizza = 10;
		int donut = 2;
		
		float mun;
		float mun1;
		
		mun = (float)((pizza*pizza)*3.14);
		mun1 =(float)((donut*donut)*3.14);
		System.out.printf("자바피자의 면적은 %.1f \n자바도넛의 면적은 %.2f",mun,mun1);
	}//end main()

}//end class
