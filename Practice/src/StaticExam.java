class ShopService {
	/*
	 2. 인스턴스 변수를 만들어서 값을 초기화해준다. 단, 외부에서 값을 변경하지 못하도록 private으로,
	 그리고 단 하나의 인스턴스만 생성해야하므로 static. 객체 생성을 해주긴 해줘야함.
	 */
	private static ShopService instance = new ShopService();
	
	//1. 생성자에 접근해서 여러 객체를 만들지 않도록 생성자를 막아줘야함.
	private ShopService() {
	
	}
	
	//3. instance를 불러올 수 있는 메서드. 
	public static ShopService getInstance() {
		return instance;
	}
	
}

public class StaticExam {

	public static void main(String[] args) {
		// TODO 06-5 확인문제
		
		ShopService demo1 = ShopService.getInstance();
		ShopService demo2 = ShopService.getInstance();
		
		System.out.println(demo1 == demo2);
	}

}
