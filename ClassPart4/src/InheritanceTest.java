
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO 기본 상속 개념
		Cms kim = new Cms(1, "김유신", 'C');
		kim.display();
		
		System.out.println("------------------------------------");

		CmsExt hong = new CmsExt(2, "홍길동", 'A', "서울시 강남구");
		hong.display();
		//오버라이딩한 display로 써야함.
		
		System.out.println("------------------------------------");
		
		//toString() 활용
		//hong은 cmsext 객체의 주소값인데, 그 주소값을 문자로 출력하게끔
		System.out.println(hong.toString());
		
		//CmsExt라는 설계도를 바탕으로 만든 객체의 참조변수니까, 오버라이딩은 CmsExt에서 해줘야함.
	}

}
