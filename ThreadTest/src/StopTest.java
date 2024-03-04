/* stop() 메서드 사용
class StopDemo implements Runnable {
//계속 실행되는 스레드 준비 
	
	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("Thread is alive ... ");
			
				Thread.sleep(500); //0.5초 간격으로 나오게끔
			}
		}
		catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		finally {
			System.out.println("Thread is dead");
		}
		
	}
	
}

public class StopTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 강제 종료, stop 메서드
	StopDemo demo = new StopDemo();
	//인터페이스 물려받은거니까 직접적인 스레드객체가 아님.
	Thread t = new Thread(demo);
	//그래서 이렇게 따로 스레드 생성해야함
	
	t.start();
	//이렇게 하면 무한반복됨.
	
	Thread.sleep(3000);
	//예외처리는 throws로
	
	t.stop();
	//권장되지 않는 방식이다보니 곧 없애겠다는 뜻으로 빗금감. 
	
	}

}
*/

/* interrupt()
class StopDemo implements Runnable {
//계속 실행되는 스레드 준비 
	
	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("Thread is alive ... ");
			
				Thread.sleep(500); //0.5초 간격으로 나오게끔
			}
		}
		catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		finally {
			System.out.println("Thread is dead");
		}
		
	}
	
}

public class StopTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 강제 종료 / interrupt 메서드
	StopDemo demo = new StopDemo();
	//인터페이스 물려받은거니까 직접적인 스레드객체가 아님.
	Thread t = new Thread(demo);
	//그래서 이렇게 따로 스레드 생성해야함
	
	t.start();
	//이렇게 하면 무한반복됨.
	
	Thread.sleep(3000);
	//예외처리는 throws로
	
	t.interrupt();
	//intterupt()메서드 사용.
	//예외 발생시키면서 종료. 
	}

}
*/

class StopDemo implements Runnable {
//계속 실행되는 스레드 준비 
	private boolean stopped = false;
	//flag 변수
	
	void off() {
		stopped = true;
	}
	
	@Override
	public void run() {
		try {
		while(!stopped) {
			//stopped가 false니까 not 연산자로해서 true로.
			
			System.out.println("Thread is alive ... ");
			
				Thread.sleep(500); //0.5초 간격으로 나오게끔
			}
		}
		catch (InterruptedException e) {
				e.printStackTrace();
		}
		
		finally {
			System.out.println("Thread is dead");
		}
		
	}
	
}

public class StopTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 강제 종료 / interrupt 메서드
	StopDemo demo = new StopDemo();
	//인터페이스 물려받은거니까 직접적인 스레드객체가 아님.
	Thread t = new Thread(demo);
	//그래서 이렇게 따로 스레드 생성해야함
	
	t.start(); 
	//이렇게 하면 무한반복됨.
	
	Thread.sleep(3000);
	//예외처리는 throws로
	
	demo.off();
	}

}

//1부터 10까지 찍히면서 동시에 별찍히는 예제. 