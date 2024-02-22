
public class Parent {
	public String nation;
	
	//기본생성자
	public Parent() {
		this("대한민국");
		System.out.println("parent() 호출");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("parent(string nation) 호출 ");
	}
}
