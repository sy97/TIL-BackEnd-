class ThreadDemo4 extends Thread {
	String name;
	
	ThreadDemo4(String name){
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<5; i++) {
			System.out.println(getName() + " : " + i);
		}
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		// TODO 문제
		ThreadDemo4 d1 = new ThreadDemo4("스레드1");
		ThreadDemo4 d2 = new ThreadDemo4("스레드2");
		ThreadDemo4 d3 = new ThreadDemo4("스레드3");

		//동작하게끔.
		//핸디캡이 있음. 메인메서드는 수정하지말고 다른걸 수정해서 run메서드 수행할수있게. 
		//메인에 start추가하지 않고 다른곳을 수정하기. 생성자에서 호출해주면되나?.. 
	}

}
