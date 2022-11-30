package java013_api;

public class Java145_Wrapper {

	public static void main(String[] args) {
		char data = 'a';
		System.out.println(Character.toUpperCase(data)); //A
		System.out.println(Character.toLowerCase(data));//a
		System.out.println(Character.isUpperCase(data)); //false
		System.out.println(Character.isLowerCase(data));//true
		System.out.println(Character.isDigit(data));//false
		System.out.println(Character.isAlphabetic(data));//true
		System.out.println(Character.toString(data)); //a

	}

}
