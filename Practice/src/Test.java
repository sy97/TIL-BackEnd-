abstract class ToDShape {
	private String name;
	private double width;
	private double height;
	
	//변수를 받아서 저장해줄 생성자 만들기
	public ToDShape(String name, double width, double height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	/*
	변수를 private으로 해주면, 다른 클래스에서 접근이 불가능 하기 때문에 변수를 값에 담아주거나 하기 위해서는
	통로를 열어줘야하는데 그게 바로 게터 세터.
	하지만 우리는 생성자를 통해서 변수를 저장할 것이기 때문에 게터만 만들어주면됨.
	*/
	
	public String getName() {
		return name;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
	/*
	area는 자식들에게 물려줬고, 자식들이 각각 오버라이딩을 했기 때문에
	내용이 없어도 타격이 없음.
	즉, 추상 메서드의 조건을 만족함.
	*/
	abstract double area();
	
}

class Triangle extends ToDShape {
	
	//부모로부터 상속받았고, 부모 객체를 생성해줘야 이 객체가 생기기 때문에 부모의 생성자부터 호출해줘야함.
	//부모의 생성자가 기본생성자가 아닌 매개변수를 받는 생성자이므로 여기도 매개변수를 똑같이 넘겨줄 생성자를 만들어야함.
	Triangle(double width, double height) {
		super("triangle",width, height);
	}
	
	//여기에는 부모클래스에 있는 메서드도 모두 보이지 않지만 들어와 있는것.
	//그 중, area를 오버라이딩
	double area() {
		return super.getHeight() * super.getHeight() / 2 ;
	}
}

class Rectangle extends ToDShape {
	
	//부모로부터 상속받았고, 부모 객체를 생성해줘야 이 객체가 생기기 때문에 부모의 생성자부터 호출해줘야함.
	//부모의 생성자가 기본생성자가 아닌 매개변수를 받는 생성자이므로 여기도 매개변수를 똑같이 넘겨줄 생성자를 만들어야함.
	Rectangle(double width, double height) {
		super("rectangle",width, height);
	}
	
	//여기에는 부모클래스에 있는 메서드도 모두 보이지 않지만 들어와 있는것.
	
	double area() {
		return super.getHeight() * super.getHeight();
	}
}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//호출을 해볼건데, 자식이 여러명이니까 하나의 변수로 관리해주는 것이 효율적임.
		ToDShape td[] = new ToDShape[3];
		td[0] = new Triangle(4.0, 4.0);
		td[1] = new Triangle(8.0, 4.0);
		td[2] = new Rectangle(15.0, 4.0);
		
		for(int i = 0; i < td.length; i++) {
			System.out.println("이름 : " + td[i].getName());
			System.out.println("면적 : " + td[i].area()); //오버라이딩 했기 때문에 여기서 불러오는 area()는 자식클래스 안의 메서드
		}
	}

}
