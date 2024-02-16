
public class OverloadTest {
	/*
	void display() {
		System.out.println("출력 내용이 없음.");
	}

	void iShow(int i) {
		System.out.println(i);
	}
	
	void idShow(int i, double d) {
		System.out.println(i+ ", " + d);
	}
	
	void diShow(double d,int i) {
		System.out.println(d+ ", " + i);
	}
	
	
	 *  이렇게 계속 만들다보면, 작명 고민도 해야하고 이름과 사용법을 외워야하는 번거로움이 있음
	 *  객체지향 언어가 아니라면 이렇게 해야함
	 *  객체지향 언어이므로 이름을 똑같이 해주면됨
	 *  
	 */
	
	//이게 바로 다형성 중 오버로딩. 하나의 메서드 이름으로 여러기능을 수행할 수 있게 해줌.
	void display() {
		System.out.println("출력 내용이 없음.");
	}

	void display(int i) {
		System.out.println(i);
	}
	
	void display(int i, double d) {
		System.out.println(i+ ", " + d);
	}
	
	void display(double d,int i) {
		System.out.println(d+ ", " + i);
	}
	
	
	public static void main(String[] args) {
		// TODO 메서드의 오버로드
		
		OverloadTest ot = new OverloadTest();
		ot.display();
		ot.display(10);
		ot.display(3.14, 100);
		ot.display(100, 2.5);
	
		/*
		 * 이름이 같다고 해서 똑같은 함수는 아님.
		 * 완전히 다른 함수들임. 그래서 반드시 구별을 해줘야함. 
		 * 반드시 매개변수가 달라야함. 위치가 다르거나 순서가 다르거나 해야함.
		 */
		
		//println도 다형성된것임. 오버로딩이 되어있어서 가능. 안그러면 출력할때마다 이름 다르게 써줘야함.
	}

}
