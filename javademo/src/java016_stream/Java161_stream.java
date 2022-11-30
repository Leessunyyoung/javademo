package java016_stream;
/*입력 스트림 : InputStream, Reader
출력 스트림 : OutputStream, Writer*/

import java.io.IOException;
import java.io.InputStream;

public class Java161_stream {

	public static void main(String[] args) {
		System.out.println("데이터 입력:");
		InputStream is = System.in;
		
		//한 바이트를 읽어와 유니코드로 리턴한다.
		try {
		int line = is.read();
		System.out.println(line);//3byte밖에 처리가안된다
		System.out.println((char)line);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
