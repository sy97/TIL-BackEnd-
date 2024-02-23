/*인터페이스도 클래스라 원래는 따로 만들어야함.
추상클래스는 인스턴스를 생성할 수 없다.
객체를 생성할 수 없으니 int a를 어떻게 써야할까?
스태틱 처리가 되어있어서 인스턴스를 만들지 않고 사용할 수 있음.
하지만 스태틱이라고 적으면 안됨. 이미 스태틱이라고 처리가 되어있는것이기 때문에.
*/
interface Inter1{ //static final public 
	int a = 10;
	
	//완전 추상클래스이기 때문에 추상메서드로 만들어야함.
	//추상클래스이기 때문에 굳이 앞에 abstract 안붙여줘도됨.
	void inter1Method();
	//이렇게되면 반드시 오버라이딩 해야함. 안그러면 에러남. -> implements.  구현해라 ! 
}

interface Inter2{ //인터페이스들끼리 상속 가능
	int b = 20;
	
	
}

//이 안에는 inter1, 2 다 들어가있음.
interface Inter3 extends Inter1, Inter2{ //다중상속가능
	int c = 30;
}



public class InterfaceTest1 implements Inter3  { //다중상속가능. Inter3가 inter1,2 상속받았으니 이렇게만 해도됨. 
	public static void main(String[] args) {
		// TODO 인터페이스 기본문법
		
		//인스턴스를 만들지 않고 바로 사용할 수 있는것 = 스태틱.
		System.out.println(Inter1.a);
		
		//상속받으면 이렇게 작성가능
		System.out.println(a + "," + b + "," + c);
	
		
		//값을 넣어주는 건 에러가남.final이기 때문에.
		//Inter1.a = 100;
		
	
	}
	
	/*
	똑같이 만들려면 public붙여야함. 그래야 에러가안남. 왜냐면 인터페이스는 public인데,
	이 안의 메서드는 기본값인 default가 들어가있음. 
	*/
	
	public void inter1Method() {
		System.out.println("오버라이딩");

	}

}
