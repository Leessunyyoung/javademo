package java013_api;
/*
 * 1. 기본자로형을 클래스로 정의해놓은 것을 Wrapper라고한다.
 * 		char     -> Character
 * 		byte 	 -> Byte
 * 		short	 -> Short
 * 		int		 -> Integer
 * 		long	 -> Long
 * 		float	 -> Float
 * 		double	 -> Double
 * 		boolean	 ->Boolean
 * 
 * 2. 메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기 위해서
 * 	  Wrapper클래스를 제공한다.
 * 
 * 3. auto boxing과 auto unboxing은 jdk5.0에서 추가된 기능이다.
 * 	  auto boxing => 스택 ->힙영역에 복사
 * 	  auto unboxing => 힙 ->스택영역에 복사
 */
public class Java144_Wrapper {

	public static void main(String[] args) {
		String data ="123";
		
		//Integer <- String
		Integer it = new Integer(data);
		
		//int <- Integer
		int num = it.intValue();
		
		System.out.println(num); //123
		
		//Integer <- String
		Integer ig = Integer.valueOf(data); // 지정 값을 문자열로 변환
		//int <- Integer
		int num2 = ig; //auto unboxing
		
		//double <- Integer
		double pro = it.doubleValue();
		System.out.println(pro); //123.0
		
		double pro2 = it; //auto unboxing
		
		//long <-Integer
		long nn = it.longValue();
		System.out.println(nn);
		long nn2 = it;  //auto unboxing
		System.out.println(nn2);
		
		Double db = new Double(data);
		Double de = Double.valueOf(data);
		int x = de.intValue();
		System.out.println(x);
		//크기 차이로 auto unboxing이 안된다 double이 더 크기때문에
//		int x2 = (int) de;
//		System.out.println(x2);
		
		double y = de.doubleValue();
		System.out.println(y);
		double y2 = de; //auto unboxing
		System.out.println(y2); //123.0
		
		//int <- String
		int a = Integer.parseInt(data);
		System.out.println("a=" + a);// a=123
		
		//byte <- String
		byte b = Byte.parseByte(data);
		System.out.println("b="+b); //b=123
		
		//double <- String
		double c = Double.parseDouble(data);
		System.out.println("c="+c);//c=123.0
		
		boolean numBoolean = Boolean.parseBoolean(data);
		System.out.println("numBoolean:" + numBoolean); //numBoolean:false
		
		numBoolean = Boolean.parseBoolean("true");
		System.out.println("numBoolean:" + numBoolean); //numBoolean:true
		
		numBoolean = Boolean.parseBoolean("false");
		System.out.println("numBoolean:" + numBoolean); //numBoolean:false

		//string값을 valueof로 가능
		String ss = String.valueOf(1);
		System.out.println(ss); //1
		Double da = Double.valueOf("1");
		System.out.println(da); //1.0
		double dt = da;
		System.out.println(dt);//1.0
		
		int k = 10;
		Integer in = new Integer(k);
		Integer is = k;//auto boxing
		System.out.println(is); //10
		
		int m = is; //auto unboxing
		
		/////////////////////////////////////////////////////////////////
		
		double dm = 5.4;
		Double valDouble = dm; //auto boxing
		double dn = valDouble; //auto unboxing
		
		String ko = "90";
		Double dp = Double.valueOf(ko);//Double <- String
		String kt = dp.toString();//String <- Double
		double kd = Double.parseDouble(ko); //double <- String
		
	}//end main()

}//end class
