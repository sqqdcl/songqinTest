package thread;

public class ThreadDemo3 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(00);
				}
			}
		};
		t1.start();
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(11111);
				}
			}
		};
		Thread t2 = new Thread(r);
		t2.start();
	}
}
