class SingletonDemo{
	private int i;
	
	
	private static SingletonDemo instance = new SingletonDemo();
	//인스턴스는 1개만 만들어야하므로.
	
	private SingletonDemo() {}
	//인스턴스 외부에서 생성할 수 없게
	
	public static SingletonDemo getInstance() {
		return instance;
	} //값을 직접 넣어주는게 아니라 이렇게 불러주는게 모범적. 
	//instance가 SingletonDemo 클래스의 인스턴스 이므로 이 메서드의 반환값은 SingletonDemo
}

public class SingletonTest {

	public static void main(String[] args) {
		// TODO 싱글톤 테스트
		
		
		//SingletonDemo demo1 = new SingletonDemo();
		//SingletonDemo demo2 = new SingletonDemo();
		//싱글톤 하려면, 인스턴스를 만들 수 없게 해야한다. -> 생성자를 private하게
		
		SingletonDemo demo1 = SingletonDemo.getInstance();
		//이미 만들어진 인스턴스의 주소 받아온것. 이렇게하면 여러개 만들어도 하나의 인스턴스만 쓰는것.
		SingletonDemo demo2 = SingletonDemo.getInstance();
		
		
		System.out.println(demo1 == demo2);
		//true
		
		
		//new를 사용해서 객체 생성하지않아도 알아서 생성된 경우를 보게될텐데, 그건 바로 싱글톤 패턴이기때문.
	}

}
