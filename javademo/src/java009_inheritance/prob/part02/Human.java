package java009_inheritance.prob.part02;

public class Human {
	String name;
	int age;
	int height;
	int weight;


	Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String toString() {
		String data = name + "\t" + age + "\t" + height + "\t" + weight;
		return data;
	}
}//end Human
