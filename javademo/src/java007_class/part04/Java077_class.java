package java007_class.part04;
/*
 * [데이터]
 * a001  생명보험	자동차보험	30000
 * a002	 생명보험	운전자보험	20000
 * b001	 손해보험	화재보험	15000
 * b002	 손해보험	해삼보험	25000
 * 
 * [출력결과]
 * 손해보험 총납입액은 40000원 입니다
 * 
 * */
public class Java077_class {

	public static void main(String[] args) {
		Insurance[] is = new Insurance[4];
		is[0] = new Insurance("a001","생명보험","자동차보험",30000);
		is[1] = new Insurance("a002","생명보험","운전자보험",20000);
		is[2] = new Insurance("b001","손해보험","화재보험",15000);
		is[3] = new Insurance("b002","손해보험","해삼보험",25000);
		String search = "손해보험";
		process(is,search);
	}
		
	public static int process(Insurance[] is,String name) {
		int sum=0;
		for(int i=0;i<is.length;i++) {
			if(is[i].name == name) {
				sum += is[i].payment;
				
			}
			
		}
		totalPrice(sum,name);
		return sum;
	}
	
	
	public static void totalPrice(int sum,String name) {
		System.out.printf("%s 총납입액은 %d원 입니다",name,sum);
	}
}
