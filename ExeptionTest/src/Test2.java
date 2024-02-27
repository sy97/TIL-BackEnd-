
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("여기는 try블럭 내부임");
			//일부러 런타임 오류를 만들어서 던지기.
	
			throw new RuntimeException("이것은 테스트용이다.");
		}
		
		catch(RuntimeException e) {
			System.out.println("잘 처리됨..."+ e.getMessage());
			
			
		
		}
	}

}
