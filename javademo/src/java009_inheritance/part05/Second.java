package java009_inheritance.part05;
//import java.lang.Override;
import java.lang.String;
//import java.lang.System;

public class Second extends First{
	int b= 20;
	
	
	@Override//선언부와 똑같이 한다
	void display() {
		System.out.println("b="+b);
		
	}
	
	void superThisMethod() {
		super.display();
		this.display();
	}
	
}
