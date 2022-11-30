package Japangi;

import java.util.ArrayList;
import java.util.Scanner;

import bulletinboard.Board;

public class Kind {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Beverage> list = new ArrayList<>();
	public static void main(String[] args) {
		

		boolean run = true;
		while(run) {
			System.out.println("========================================================");
			System.out.println("1.음료수등록 2.음료수삭제 3.저장된 음료수와 가격 출력 4.거스름돈 5.종료");
			System.out.println("========================================================");
			int select = Integer.parseInt(sc.next());
		switch(select) {
			case 1 : createBeverage();
				break;
			case 2 : deleteBeverage();
				break;
			case 3 : serachBeverage();
				break;
			case 4 : changeMoney();
				break;
			default : 
				run = false;
				System.out.println("자판기 종료!!!!!!!");
				break;
				
		}
	}
}


	private static void createBeverage() {

		System.out.println("음료수 등록하기 (가격 숫자로만 입력하세요)");
		System.out.print("음료수 이름:");
		String name = sc.next();
		System.out.print("음료수 가격:");
		String price = sc.next();
		Beverage br = new Beverage();
		br.setName(name);
		br.setPrice(Integer.parseInt(price));
		list.add(br);
		System.out.println("저장되었습니다");
		
		
		
	}
	private static void deleteBeverage() {
		System.out.printf("삭제할 음료수 종류를 입력하세요:");
		String name = sc.next();
		for(Beverage b : list) {
			if(b.getName().equals(name)) {
				list.remove(b);
				System.out.println("음료수가 삭제되었습니다.");
				break;
			}else {
				System.out.println("그런음료수는 없습니다...");
				
			}
		}
		
	}

	private static void serachBeverage() {
		System.out.println("저장된 음료수+가격출력");
		for(Beverage b : list) {
			System.out.println("음료수:  "+b.getName()+"   가격:  "+b.getPrice());
		}
		
	}
		
	
	private static void changeMoney() {
		System.out.println("현재 가지고 있는 돈을 입력하시오");
		String price = sc.next();
		System.out.println("음료수를 선택하시오");
		String kind = sc.next();
		System.out.println("산 음료수의 개수는?");
		int count = sc.nextInt();
		for(Beverage b : list) {
			if(b.getName().contains(kind)) {
				int total =b.getPrice() * count;
				int changemoney = Integer.parseInt(price)-(b.getPrice() * count);
				System.out.println("남은돈은"+changemoney+"원");
				if(Integer.parseInt(price)<total) {
					System.out.println("돈이부족합니다.");
				}
				break;
			}else {
				System.out.println("없는음료수입니다");
			}
		}
			
		
		}
		
		
	}

