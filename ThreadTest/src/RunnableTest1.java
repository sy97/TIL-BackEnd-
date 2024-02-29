class ThreadDemo3 implements Runnable{
	//인터페이스는 완전 추상클래스이기 때문에 객체를 생성할수없음. 즉 생성자가 없음.
	private String name;
	
	public ThreadDemo3(String name) {
	this.name = name;
	//인터페이스는 생성자가 없어서 부모가 저장할 수 없으니까 변수를 내가 선언해줘야함.
	
	}

	@Override
	public void run() {
		int sum = 0;
		for(int i =0; i<5; i++) {
			try {
				Thread.sleep(50);
				//thread가 static클래스라 이렇게사용가능.
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//여기서 throws를 해주면안됨. 오버라이드했기 때문에 똑같이 써줘야함. 
			
			
			sum += i;
			System.out.println(name + " : " + sum);
			//러너블에는 메서드도 run()밖에없으니까 name으로해줘야함.
		}
	}
	
}
public class RunnableTest1 {

	public static void main(String[] args) {
		// TODO runnable 인터페이스 상속
		
		//얘네는 아직 스레드가 아님. 그냥 객체임. 러너블을 상속받았기 때문에
		//스레드 클래스를 상속받아야 스레드임.
		ThreadDemo3 demo1 = new ThreadDemo3("first");
		ThreadDemo3 demo2 = new ThreadDemo3("second");
		
		Thread t1 = new Thread(demo1);
		Thread t2 = new Thread(demo2);
		//이렇게해줘야 스레드가되는것.
		
		t1.start();
		t2.start();
	
	}

}
