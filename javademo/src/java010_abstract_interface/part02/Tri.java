package java010_abstract_interface.part02;

public class Tri extends Shape{
	public Tri() {
		// TODO Auto-generated constructor stub
	}
	
	public Tri(int width,int height) {
		super(width,height);
	}
	@Override
	double getArea() {
		return getWidth()*getHeight()/2;
	}
}