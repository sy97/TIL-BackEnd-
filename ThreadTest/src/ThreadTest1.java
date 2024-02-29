class ThreadDemo extends Thread{
	//private String name;
	
	public ThreadDemo(String name) {
		//this.name = name;
		super(name);
		//thread에게 상속받은거니 부모에 저장.
		//thread클래스에 name이라는 변수가 있음. 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i =0; i<5; i++) {
			try {
				sleep(50);
				//잠깐 쉬게해주는 메서드
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//여기서 throws를 해주면안됨. 오버라이드했기 때문에 똑같이 써줘야함. 
			
			
			sum += i;
			System.out.println(getName() + " : " + sum);
			//그럼 여기에 name이 아니라 thread클래스의 메서드인 getNmae()을 써주면됨. 
		}
	}
	
}
public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO 스레드 생성방법
		// 이미 메인이 있기 때문에 스레드 있는것.
		// 메인은 부모스레드.
		ThreadDemo demo1 = new ThreadDemo("first");
		ThreadDemo demo2 = new ThreadDemo("second");
		//메인부터 이 demo1,2를 동시에 실행시켜주면 멀티스레드가됨.
		
		
		demo1.start();
		demo2.start();
		//스레드를 만들고 실행하려면 start해야함.
		//start를 해야 새로운 스레드를 생성하고, 해당스레드의 run이을 호출하여 스레드를 시작함.
		//run을 하면 그냥 메서드가 실행되는거고 스레드를 생성하는것은 아님.
		
		//저렇게 하면 두개의 자식스레드가 똑같은 일을 수행하게되는것임.
		//수행할때마다 출력값이 달라짐.
		//지금 이게 동시에 실행되고있는것이 아님. 꼼수를 줘서 동시에 실행되는것처럼 보이게할수있음.->sleep메서드써서.
		//이렇게하면 거의 한번씩 번갈아가면서 실행되는것처럼 출력됨.
	}

}
