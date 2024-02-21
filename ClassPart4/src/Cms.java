
//여기에는 메인 메서드가 있으면 안됨.
//Inheritancetest에 메인메서드가 있음. 이 클래스들을 합쳐서 프로젝트를 만들것이기 때문에
//메인메서드는 한곳에만 !!! 

public class Cms {
	private int no;
	private String name;
	private char level;
	
	public Cms(int no, String name, char level) {
		this.no = no;
		this.name = name;
		this.level = level;
	}
	// 생성자 왜만들어주는거지..
	
	void display() {
		System.out.println("고객 번호 : " + no);
		System.out.println("고객 이름 : " + name);
		System.out.println("고객 등급 : " + level);
	}
	
}
