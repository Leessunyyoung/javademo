package java010_abstract_interface.part06;

public class UserTest extends User implements Score,Print {
	int s;
	public UserTest() {
		// TODO Auto-generated constructor stub
	}
	
	public UserTest(String name,int s) {
		super(name);
		this.s = s;
	}


	@Override
	public String toPaint() {
		return String.format("이름:%s\n 점수:%d\n",toString(),getScore());
	}
	
	@Override
	public int getScore() {
		return sol * s;
	}

}
