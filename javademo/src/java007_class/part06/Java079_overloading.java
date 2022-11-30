package java007_class.part06;

public class Java079_overloading {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addValue(4, 8);
		//int,int
//		  12
		cal.addValue(2,7,5);
		//int,int,int
		//14
		cal.addValue(1.0, 2.0);
//		double,double
//		3.0

	}

}
