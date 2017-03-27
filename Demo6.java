package aaa;

public class Demo6 {
	public static void main(String[] args) {
		Thread g = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("子线程" + i);
				}
			}
		});
		g.start();
		for(int i=0;i<100;i++){
			System.out.println("主线程"+i);
		}
	}
}
