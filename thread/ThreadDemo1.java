package insight_global.thread;

public class ThreadDemo1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		public static void main(String args[]) {
			System.out.println(Thread.currentThread().getName());
			ThreadDemo1 t1=new ThreadDemo1();
			t1.start();
			t1.setName("Java");
			ThreadDemo1 t2=new ThreadDemo1();
			t2.start();
			t2.setName("Java2");
			System.out.println(Thread.activeCount());
			
		
		}

}
