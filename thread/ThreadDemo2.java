package insight_global.thread;

public class ThreadDemo2 implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadDemo1 t2=new ThreadDemo1();
		Thread t=new Thread();
		t.start();
		System.out.println(Thread.activeCount());
	}
	

}
