//Cms 상속
public class CmsExt extends Cms{
	//상속을 받아서 우리 눈에는 안보이지만 코드가 모두 복사되어 왔음.
	private String address;
	
	public CmsExt(int no, String name, char level, String address) {
		//값을 넘겨 받는데 생성자를 왜만들어야하지?....=> 초기화 하기 위해서.
		//생성자를 만들면 상속받을 부모의 생성자부터 생성됨. 
		
		/*
		this.no = no;
		this.name = name;
		this.level = level;
		이렇게 하면 Cms에서 private으로 되어있기 때문에 오류남.
		*/
		
		super(no, name, level);
		//부모의 생성자 호출
		//super는 단 한번만 호출이 가능함.
		
		this.address = address;
		
		/*
		이 안에는 부모로부터 물려받은 display라는 메서드 있음
		 
		void display() {
			System.out.println("고객 번호 : " + no);
			System.out.println("고객 이름 : " + name);
			System.out.println("고객 등급 : " + level);
		}
		*/
	
	}
	
	//오버라이딩. 부모가 물려준 모양 그대로 가져다가 써야함. 매개변수를 넣어버리면 그건 오버로딩되는거.
	void display() {
		//display(); 이건 내가 물려받은 display를 호출하는것. 이렇게하면 재귀호출 되어버림.
		//this는 생략 가능.
		//부모의 display를 호출해야함.
		super.display(); // 그래야 재귀호출이 되지않음.
		System.out.println("고객 주소 : " + address);
	}
	
}
