package bulletinboard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Kind {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Board> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		boolean run =true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.게시물 등록 2.게시물 삭제 3.게시물 조회 4.게시물수정 5.종료");
			System.out.println("-----------------------------------------------");
			int select = Integer.parseInt(sc.next());
			switch(select) {
				case 1 : createBoard();
					break;
				case 2 : deleteBoard();
					break;
				case 3 : serachBoard();
					break;
				case 4 : modifyBoard();
					break;
				default : 
					run = false;
					System.out.println("게시판 종료!!!!!!!");
					break;
					
				
			}
		}

	}
	private static void createBoard() {
		System.out.print("게시물 제목:  ");
		String title = sc.next();
		System.out.print("게시물 내용:  ");
		String content = sc.next();
		Board b = new Board();
		b.setTitle(title);
		b.setContent(content);	
		list.add(b);
		}

	private static void deleteBoard() {
			System.out.printf("삭제할 게시물 제목를 입력하세요:");
			String title = sc.next();
			for(Board s : list) {
				if(s.getTitle().equals(title)) {
					list.remove(s);
					System.out.println("게시물이 삭제되었습니다.");
					break;
				}else {
					System.out.println("그런게시물은 없습니다...");
					
				}
			}
		}
		
	private static void serachBoard() {
		System.out.print("조회할 게시물의 제목를 입력하세요:  ");
		String title = sc.next();
		Boolean check = false;
			for(Board s: list) {
				check = true;
				if(s.getTitle().equals(title)) {
				System.out.println("제목은"+s.getTitle()+"이고\n"+"내용은"+s.getContent());
				}
			}
			if(!check) {
				System.out.println("그런 제목은 없습니다");
			}
	
		 
	}

	
	private static void modifyBoard() {
		System.out.print("수정할 게시물의 제목를 입력하세요:  ");
		String title = sc.next();
		for(Board s: list) {
			if(s.getTitle().equals(title)) {
				list.remove(s);
				System.out.print("수정게시물 제목:  ");
				String title1 = sc.next();
				System.out.print("수정게시물 내용:  ");
				String content = sc.next();
				Board b = new Board();
				b.setTitle(title);
				b.setContent(content);	
				list.add(b);
			}
		
		}
	}

}
