
//여기에는 메인 메서드가 있으면 안됨.
//Inheritancetest에 메인메서드가 있음. 이 클래스들을 합쳐서 프로젝트를 만들것이기 때문에
//메인메서드는 한곳에만 !!! 

public class Cms {
	private int no;
	private String name;
	private char level;
	//private으로 만들거면 이걸 사용할 수 있게 길을 열어줘야함. 게터 메서드나 세터메서드. 
	
	public Cms() {
		//기본생성자는 필요 있든 없든 명시해주는게 좋은 습관이다. 
	}
	
	public Cms(int no, String name, char level) {
		this.no = no;
		this.name = name;
		this.level = level;
	}
	// 생성자 왜만들어주는거지.. 메서드로 받아주면 되는거 아닌가?
	
	void display() {
		System.out.println("고객 번호 : " + no);
		System.out.println("고객 이름 : " + name);
		System.out.println("고객 등급 : " + level);
	}
	//여기 있는 기능을 전부 CmsExt로 가져가야함.
}
