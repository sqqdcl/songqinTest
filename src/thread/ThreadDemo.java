package thread;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/** 启动线程要执行start方法，而不是直接调用run方法 */
		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(" a");
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(".");
		}
	}
}
