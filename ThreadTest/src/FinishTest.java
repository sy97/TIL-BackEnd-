class FinishDemo2 implements Runnable {
	private String name;
	FinishDemo2(String name){
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

public class FinishTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드의 종료 시점 지정하기
		System.out.println("메인 스레드 시작");
		
		FinishDemo2 child1 = new FinishDemo2("first");
		FinishDemo2 child2 = new FinishDemo2("second");
		Thread t1 = new Thread(child1);
		Thread t2 = new Thread(child2);
	
		
		t1.start();
		t2.start();
		//first가 마지막에 끝날 때도 있고, second가, 또는 메인메서드가 마지막에 끝날 때도 있음.
		//메인스레드가 항상 마지막에 끝나게 하고싶다면?
		
		int cnt = 0;
		do {
			Thread.sleep(500);
			//이걸해줘야 둘이 일을 동시에함.
			
			cnt++;
			System.out.print(".");
		}while(cnt < 10);
		//while(t1.isAlive() || t2.isAlive());
		//첫번째 혹은 두번째가 아직 실행중이라면? 계속 실행. t1이 끝날 때까지는 반복이 계속 돔.
		t1.join(); //t1이 끝날때까지 무조건 기다리겠다.
		t2.join(); //t2도 긑날때까지 무조건 기다리겠다. 
		
		
		System.out.println("메인 스레드 끝");
		
	}

}
