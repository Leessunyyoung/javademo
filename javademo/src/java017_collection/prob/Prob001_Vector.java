package java017_collection.prob;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Stream;

/*
 * [문제] : booklist.txt 파일의 데이터를 이용하여 
 *      책 정보 하나당 하나의 Book 객체를 생성하고 생성된 Book 객체들을 
 *      Vector에 담아서 리턴하는 makeBookList() 메서드를 구현하시오.
 *      
 * [실행결과]
 * Java Programming 의 가격 : 25000
 * SQL Fundamentals 의 가격 : 47000
 * JDBC Programming 의 가격 : 30000
 * Servlet Programming 의 가격 : 20000
 * JSP Programming 의 가격 : 21000
 */
public class Prob001_Vector {

	public static void main(String[] args) throws Exception {
		Vector<Book> bookList = makeBookList();
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " 의 가격 : " + book.getPrice());
		}

	}// end main()

	private static Vector<Book> makeBookList() throws Exception {
		// booklist.txt 파일의 데이터를 Vector에 저장한 후 리턴하는 프로그램을 구현하시오.
		FileReader fr = null;
		BufferedReader br = null;
		
		File file = new File(".\\src\\java017_collection\\prob\\booklist.txt");
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		
			
		Stream<String> aa = br.lines();
		
		
			
		Vector<Book> bookList = new Vector<Book>();// 백터생성
		bookList.add((Book) aa);
		for(int i=0;i<bookList.size();i++) {
			Book data = bookList.get(i);
			System.out.println(data);
		}
		
		
		return bookList;

	}// end makeBookList()

}// end class















