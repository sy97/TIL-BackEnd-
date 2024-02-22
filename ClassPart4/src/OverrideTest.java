abstract class TwoDShape {
	//추상메서드 하나라도 가지고 있으면 추상클래스가됨.
	//인스턴스변수
	private double width;
	private double height;
	private String name;
	
	//생성자
	public TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;	
	}
	
	//메서드
	
	//프라이빗 만들면 게터, 세터 만드는거 무조건이라고 생각하기. 세터는 생략. 생성자가 값을 담아줄거니까.
	//자동생성 - source - getter and setter
	public double getWidth() {
		return width;
	}


	public double getHeight() {
		return height;
	}


	public String getName() {
		return name;
	}
	

	
	
	/*
	상속해줘서 오버라이딩 됐고, 자식이 고쳐쓸거니까 area()는 내용이 없어도 타격이없음.
	하지만 비어있으면 에러가나니까 그냥 넣어둠.
	얜 추상메서드의 자격이 있음.
		
	면적 구하는 메서드
	어떤 도형일지 모르니까 면적을 미리 구해놓을 수가 없음.
	double area() {
		
	System.out.println("면적 구하기");
	return 0.0;
	
	*/
	
	//추상메서드
	abstract double area(); 
	//내용 없어도 되니까 그냥 껍데기만 만들어놓자.
}

class Triangle extends TwoDShape {
	
	Triangle(double w, double h){
		//부모클래스에 기본 생성자가 없고 임의로 명시한 생성자가 있으므로, 부모 클래스를 호출해줄 수 있는 매개변수가 있어야함.
		super(w, h, "triangle");
		//부모의 변수가 private이니까 super로 부모에게 저장시켜주기
	}
	
	//이미 부모가 면적 구하라고 만들어놓은 메서드가 있으니까 오버라이딩
	double area() {
		return getWidth() * getHeight() / 2;
		//위에서 생성자로 넘겨줬으니 넓이랑 높이가 부모한테 있음.
		//게터메서드로 값 꺼내오기
		//추상 메서드는 반드시 오버라이딩을 해줘야함.
	}
	
}

class Rectangle extends TwoDShape {
	
	Rectangle(double w, double h){
		super(w, h, "rectangle");
		//부모의 변수가 private이니까 super로 부모에게 저장시켜주기
	}
	
	//이미 부모가 면적 구하라고 만들어놓은 메서드가 있으니까 오버라이딩
	double area() {
		return getWidth() * getHeight();
		//위에서 생성자로 넘겨줬으니 넓이랑 높이가 부모한테 있음.
		//게터메서드로 값 꺼내오기
		
	}
	
}


public class OverrideTest {

	public static void main(String[] args) {
		// TODO 부모-자식의 참조관계, 오버라이딩
		TwoDShape shapes[] = new TwoDShape[4];
		//객체 생성이 아니라 참조변수 5개 생성
		
		//생성자에 매개변수가 있으니까 매개변수 넣어줘야함.
		shapes[0] = new Triangle(8.0, 12.0);
		shapes[1] = new Rectangle(15.0, 12.0);
		shapes[2] = new Rectangle(13.0, 11.0);
		shapes[3] = new Triangle(7.0, 10.0);
		//shapes[4] = new TwoDShape(1.0, 1.0, "일반");
		//추상클래스는 인스턴스를 생성할 수 없기 때문에에러가남.
		
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println("이름 : " + shapes[i].getName());
			System.out.println("면적 : " + shapes[i].area());
			System.out.println("-----------------------------------");
		}

	}

}


































