
public class StaticTest2 {
	StaticTest2() {
		System.out.println("생성자가 호출됨.");
	}
	
	static double d1, d2;
	
	static {
		System.out.println("static이 생성됨");
		d1 = Math.sqrt(4.0);
		d2 = Math.sqrt(8.0);
		//sqrt도, 객체 생성하지않고 바로 사용가능한 것이니까 static메서드인것.
	}
	public static void main(String[] args) {
		// TODO static block과 생성자와의 생성순서 비교
	StaticTest2 st = new StaticTest2();
	//생성자 호출됨.
	
	//스태틱이 먼저 만들어지고 생성자가 만들어지는지. 아니면 그 반대인지 확인.
	//스태틱이 먼저 만들어짐. 
	
	 System.out.println(d1 + "," + d2);

	}

}
