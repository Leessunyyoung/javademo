package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint {
	String color;
		public MyColorPoint(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
		public MyColorPoint(int x,int y,String color) {
			super(x,y);
			this.color =color;
		}
		
		@Override
		protected void reverse() {
			int tmp=x;
			x = y;
			y = tmp;
		}
		protected void show() {
			
			System.out.println(x + "," + y+ "," +color);
		}
		@Override
		protected void move(int x, int y) {
			this.x = x;
			this.y = y;
		}

}
