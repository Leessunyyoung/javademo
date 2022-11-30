package java016_stream;

import java.io.File;
import java.io.RandomAccessFile;

public class Java171_stream {

	public static void main(String[] args) {
//		File file = new File("src/java016_stream/temp");
		File file = new File("src/java016_stream/a/b");
		System.out.println(file.isDirectory()); //false
		//현재 파일이 디렉터리인지 물어봄
		if(!file.isDirectory()) {
//			file.mkdir(); //mkdirs 만들 폴더가 여러개일때 쓴다
			file.mkdirs();
			System.out.println("폴더 생성");
		}else {
			System.out.println("폴더 존재");
		}

	}

}
