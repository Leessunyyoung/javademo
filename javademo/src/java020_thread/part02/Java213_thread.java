package java020_thread.part02;

public class Java213_thread {

	public static void main(String[] args) {
		UserImp um = new UserImp();
		Thread th = new Thread(um);
		th.start();
		
		for(int j=0; j<=5; j++) {
			System.out.printf("%s j=%d\n",Thread.currentThread().getName(),j);
//					main j=0
//					main j=1
//					main j=2
//					main j=3
//					main j=4
//					main j=5
		}

	}

}
