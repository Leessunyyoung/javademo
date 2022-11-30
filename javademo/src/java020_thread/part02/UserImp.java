package java020_thread.part02;

public class UserImp implements Runnable{
	
	public UserImp() {
		
	}
	@Override
	public void run() {//Runnable안에는 run하나밖에없어서 getName출력이안되서
						//Thread.currentThread().getName()써야된다
		
		for(int i=0;i<=5;i++) {
			System.out.printf("%s i=%d\n",Thread.currentThread().getName(),i);
//					Thread-0 i=0	
//					Thread-0 i=1
//					Thread-0 i=2
//					Thread-0 i=3
//					Thread-0 i=4
//					Thread-0 i=5
		}
		
	}
}
