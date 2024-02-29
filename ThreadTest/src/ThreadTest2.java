/*
class ThreadDemo2 extends Thread {
	ThreadDemo2(String name){
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "자식 스레드 시작");
		
		int cnt = 0;
		do {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cnt++;
			System.out.print(cnt);
		}while(cnt < 10);
		
		System.out.println(getName() + "자식 스레드 끝");
	}
	
	
}
public class ThreadTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("메인 스레드 시작");
		ThreadDemo2 child1 = new ThreadDemo2("first");
		
		child1.start();
		
	
		int cnt = 0;
		do {
			Thread.sleep(500);
			//이걸해줘야 둘이 일을 동시에함.
			
			cnt++;
			System.out.print(".");
		}while(cnt < 10);
		
		System.out.println("메인 스레드 끝");
	}

}
*/

//runnable로 해주기.
class ThreadDemo2 implements Runnable {
	private String name;
	ThreadDemo2(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + "자식 스레드 시작");
		
		int cnt = 0;
		do {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cnt++;
			System.out.print(cnt);
		}while(cnt < 10);
		
		System.out.println(name + "자식 스레드 끝");
	}
	
	
}
public class ThreadTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("메인 스레드 시작");
		
		ThreadDemo2 child1 = new ThreadDemo2("first");
		Thread t1 = new Thread(child1);
		t1.start();
	
		int cnt = 0;
		do {
			Thread.sleep(500);
			//이걸해줘야 둘이 일을 동시에함.
			
			cnt++;
			System.out.print(".");
		}while(cnt < 10);
		
		System.out.println("메인 스레드 끝");
	}

}