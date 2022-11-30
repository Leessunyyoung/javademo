package java020_thread.prob;

public class Producer extends Thread{
	private Producer p;
	private String who;
	public Producer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Producer(Producer p, String who) {
		this.p = p;
		this.who = who;
	}


	public Producer(VendingMachine vm) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void run() {
		try
        {
            for(int i = 0 ; i < 10 ; i++)
            {
                // 스레드 0.5초동안 대기
                Thread.sleep(500);
                System.out.println("음료수 No.%d 꺼내먹음" + i);
            }
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
	}
	}
}
