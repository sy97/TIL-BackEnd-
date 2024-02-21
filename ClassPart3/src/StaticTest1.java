class StaticDemo{
	int a;
	int b;
	static int c;//얘는 인스턴스를 생성해줄 필요가 없음. 어느 클래스에 있는지만 알려주면됨.
	
}
public class StaticTest1 {
	static int d;
	
	static void method1() {
		System.out.println("method1 호출됨");
	}
	
	public static void main(String[] args) {
		// TODO static이란?
	StaticDemo.c = 100;
	//c는 인스턴스를 만들지 않아도 자동으로 만들어지기 때문에 바로 값을 넣을 수 있다.
	System.out.println(StaticDemo.c);
	
	/*
	같은 설계도를 가지고 인스턴스를 만들 때 마다 메모리에 복사본이 계속 생김.
	만약 int c를 static으로 설정하면 a,b,c 연속된 인스턴스가 아니라 a,b만 생기고
	c는 별도로 하나만 만들어짐.
	c는 공동 사용 구역이됨.
	
	*/
	
	StaticDemo demo1 = new StaticDemo();
	//a와 b를 하나로 묶어서 인스턴스 생김. c는 빼고.
	StaticDemo demo2 = new StaticDemo();
	//하나 더 만들어도 똑같음.c는 안만들어짐.

	System.out.println(demo1.c);
	//모든 인스턴스가 사용할 수 있는 공동메모리여서 이렇게 해도 결과 나옴.
	
	demo1.c = 200;
	System.out.println(StaticDemo.c);
	System.out.println(demo2.c);
	//값 모두 똑같음.
	
	//StaticTest1.d = 300;
	//스태틱으로 만들면 따로 인스턴스 만들지 않아도 바로 값 넣기 가능.
	//근데 가튼 클래스에서 사용하는 경우 바로 아래처럼 쓸 수 있음
	d = 300;
	
	//StaticTest1.method();
	method1();
	
	
	}

}
