package java012_api;

public class StringTest extends Object{
	private char[] arr;
	
	public StringTest() {
		
	}
	public StringTest(char[] arr) {
		this.arr = arr;
	}
	
	public int length() {
		return arr.length;
	}
	//대문자 
	public boolean isUpperCase(int index) {
		if(arr[index]>='A' && arr[index]<='Z') 
			return true;
		else
			return false;
		}
	//소문자	
	public boolean isLoserCase(int index) {
			if(arr[index]>='a' && arr[index]<='z') 
				return true;
			else
				return false;
			}
			
	public char charAt(int index) {
		return arr[index];
	}
	@Override
	public String toString() {
		String sn = "";
		for(char cn : arr) 
			sn += cn;
		return sn;
//		return arr;  arr이 배열이므로 안된다 String으로 바꿔야된다 
	}
	
}
