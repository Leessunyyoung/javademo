package part02.dto;

public class MemDTO {
//DB가져올때 테이블 컬럼명이 같게 해야된다 DB 컬럼명 DTO 멤버변수 웹 NAME 다 같아야 MAPPING이된다
	private int num;//대문자로 쓰면안된다
	private String name;
	private int age;
	private String loc;
	
	public MemDTO() {
		
	}

	public MemDTO(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
