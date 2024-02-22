class TwoDShape {
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
	
	//면적 구하는 메서드
	//어떤 도형일지 모르니까 면적을 미리 구해놓을 수가 없음.
	double area() {
		
		System.out.println("면적 구하기");
		return 0.0;
		
	}

	
}


public class OverrideTest {

	public static void main(String[] args) {
		// TODO 부모-자식의 참조관계, 오버라이딩

	}

}
