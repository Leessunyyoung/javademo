package java002_staetments;
/*
 * if(조건식){
 * 	if(조건식){
 * 
 * }else{
 * 	if(조건식){
 * }
 * }
 * 
 * }
 * 
 * 
 * */
public class Java018_if {

	public static void main(String[] args) {
		boolean member = true; //회원(true) or 비회원(false)
		String grade = "일반"; //회원등급(VIP,일반)
		if(!member) {
		if(grade=="VIP") {
			
			System.out.printf("고객님은 %s이며 %d%%적립\n",grade,30);
		 
		}else {
		System.out.printf("고객님은 %s이며 %d%%적립\n",grade,10);
		}
		
		}else {
		 System.out.printf("고객님은 %s이며 %d%%적립\n",grade,0);	  
		}
		}
	
	}
	



