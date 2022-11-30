package java016_stream.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;



/*
 * [문제]score.txt 파일의 점수 정보를 읽어 들여서 각 학생의 점수 총합을 
 *       콘솔창에 출력하는 입출력 프로그램을 main() 메서드에 구현하시오.
 * 
 * [프로그램 실행결과]
 * kim의 점수 통합 :146
 * hong의 점수 통합 :243
 * park의 점수 통합 :240
 */
public class Prob001_stream {
	
	public static void main(String[] args) {
	     //각 학생의 총점을 출력하는 프로그램을 구현하시오.
		File file=new File("./src/java016_stream/prob/score.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNext()) {           
				String str = scanner.next();           
//				System.out.println(str); 
				String[] data = str.split("[:/]");
				int number = Integer.parseInt(data[1]);
				int number1 = Integer.parseInt(data[2]);
				int number2 = Integer.parseInt(data[3]);
				System.out.println(data[0]+"의 점수 통합 :"+(number+number1+number2));
				}     
			
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}         
		
		
	}//end main()

}//end class











