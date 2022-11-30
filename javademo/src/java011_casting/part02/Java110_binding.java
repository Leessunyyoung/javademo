package java011_casting.part02;
/*
 * 다형성(polymorphism)
 * 1. 사전적 의미는 "여러자기 형태를 가질 수 있는 능력"을 의미한다.
 * 2. 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조하는 기술이다.
 * 	  예를 들면, 하나의 타입으로 상속관게에 있는 객체를 다루는 기술이다.
 * 
 * 바인딩(binding) : 메소드 호출을 실제 메소드의 몸체와 연결하는 기술이다.
 * 	1. 정적바인딩(static binding) : 컴파일단게에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술
 * 	2. 동적바인딩(dynamic binding) : 실행단계에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술
 */
 
public class Java110_binding {

	public static void main(String[] args) {
		Employee emp = new Employee("Yerin","code001");
		process(emp);
		
		Manager mg = new Manager("백예린","professor","first");
		process(mg);
		
		

	} //정적바인딩
//	public static void process(Employee emp) {
//		System.out.println(emp.toString());
//	}
//	public static void process(Manager mg) {
//		System.out.println(mg.toString());
//	}
	
	
	//업캐스팅
	public static void process(Object obj) {
		System.out.println(obj.toString());
		if(obj instanceof Employee) {
			//Employee em = (Employee)obj;
			//System.out.println(em.pay());
		System.out.println(((Employee) obj).pay());
		
		}else if(obj instanceof Manager) {
			Manager mg = (Manager)obj;
		System.out.println(mg.display());
//		System.out.println(((Manager) obj).display());
		}
	}
}
