package java005_method;


public class Java056_method {

	public static void main(String[] args) {
		int a = 10, b =20;
		int c = a, d =b; //c=10 d=20 ->값에 의한 복사(call by value)
		
		// c,d변수의 값을 교환 
		//temp->두변수의 값을 교환시켜준다
		
		int temp = c;
		c =d;
		d = temp; //c=20 d=10
		
		System.out.printf("a=%d, b=%d\n" ,a,b);
		System.out.printf("c=%d, d=%d\n" ,c,d);
		
		System.out.println("===========================");
		int[] num = new int[] {10,20};
		int[] arr = num; //주소에 의한 복사 (call by reference)
		
		//arr[0],arr[1]을 값을 교환
		int imsi = arr[0];
		arr[0] = arr[1]; 
		arr[1] = imsi;
		
		System.out.printf("num[0]=%d, num[1]=%d\n",num[0],num[1]);
		System.out.printf("arr[0] =%d ,arr[1]=%d",arr[0],arr[1]); //20
		
		

	}//end main()

}//end class
