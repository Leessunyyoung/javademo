package java016_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java172_stream {

	public static void main(String[] args) throws IOException{
		//		File file = new File("src/java016_stream/temp");
//		File file = new File("src/java016_stream/a/b");
		File file = new File("src/java016_stream/sample.txt");
		
		//종료시 삭제하도록 설정
		file.deleteOnExit();
		
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close(); //close 했을때 파일이 삭제된다.
		
		//현재 파일이 디렉터리인지 물어봄
//		if(file.isDirectory()) {
//			file.mkdir(); //mkdirs 만들 폴더가 여러개일때 쓴다
//			file.delete();
//			file.deleteOnExit();
//			System.out.println("폴더 삭제");
//		}else {
//			System.out.println("폴더 없음");
//		}
	}//end main()	
}
