package java006_class.part07;
/*
 * this: 객체 자신을 의미
 *  //1.멤버변수 호출할때 사용  	 this.멤버변수
	  2.메소드 호출할때		 	 this.메소드()
	  3.생성자에서 생산자를 호출할때  this( ): 생성자
 * */
public class Product {
	String code;
	String pname;
	int cnt;
	
	public Product() {
		this("p002","식품",3000); //밑에 public Product(String code,String pname,int cnt)을 호출한다.
		
		
	}
	
	public Product(String code,String pname,int cnt) {
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}
	void display() {
		System.out.printf("%s %s %d\n",code,pname,cnt);
		
	}
	void prn() {
		this.display(); //display();라고 해도 this.display라고 읽는다
	}
	
	
}
