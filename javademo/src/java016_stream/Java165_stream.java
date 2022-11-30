package java016_stream;
/*[순번 이름 평균] 입력
 * 
 * 순번 :10
 * 이름 : 홍길동
 * 평균 : 9.5
 * 
 * /
 */
import java.util.Scanner;

public class Java165_stream {

	public static void main(String[] args) {
		System.out.println("[순번 이름 평균]입력:");
		Scanner sc = new Scanner (System.in);
		int num ;//순번
		String name; //이름
		double avg; //평균
		num = sc.nextInt();
		name = sc.next();
		avg = sc.nextDouble();
		System.out.printf("순번:%d\n이름:%s\n평균:%.1f\n",num,name,avg);

	}

}
