package java018_collection;

public class Average<T extends Number> {
	private T[] list;
	
	public Average() {
		// TODO Auto-generated constructor stub
	}
	
	public Average(T[] list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	public double findAverage() {
		double sum = 0.0;
		for( T data : list);
		sum +=data.doubleValue();
		
		return sum/list.length;
	}
}
