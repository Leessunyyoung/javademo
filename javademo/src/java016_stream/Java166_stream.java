package java016_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java166_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.exists());//false
		System.out.println(file.isFile());//false
		System.out.println(file.length());//0
		
		FileWriter fw = null;
		
		try {
			//mode의 값이 true이면 append
			//mode의 값이 false 이면 update
			//mode의 값을 생략하면 false이다.
			fw = new FileWriter(file,false);
			fw.write("java\n");//buffer에 저장
			fw.flush();
			fw.write("jsp\n"); //buffer에 저장
			fw.flush();
			fw.write(new char[] {'s','p','r','i','n','g'});
			fw.write("\n");
			fw.flush();
			fw.write(97);
			fw.write("\n");
			fw.flush();
			fw.write(new char[] {'s','p','r','i','n','g'},0,3);
			fw.flush();
			fw.close();
//			fw.write("mybatis");
//			fw.flush();//에러발생 close를 했기때문에
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
