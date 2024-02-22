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
		
		
	}
	
	public void print() {
		display();
		//this는 생략 가능.

		System.out.println("고객 주소 : " + address);
	}
	
}
