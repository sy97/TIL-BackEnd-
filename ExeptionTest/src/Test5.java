
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("여기는 try블럭 내부임");
			
			//일부러 런타임 오류를 만들어서 던지기.
			//throw new RuntimeException("이것은 테스트용이다.");
			int i = 10/0;
		}
		
		catch(RuntimeException e) {
			System.out.println("잘 처리됨"+ e.getMessage());
			
			//에러가 나면 여기서 중단해라.
			return;
			//system.exti(0); 이건 완전히 프로그램 종료시킴. finally도 실행 안됨. 권장안함.
		}
		
		finally {
			//에러가 나든 안나든 여기 있는 코드는 무조건 실행.
			//반드시 실행해야 하는 코드는 여기에 넣음.
			//주로 마무리코드를 여기에 넣어줌.
			System.out.println("finally 영역은 반드시 실행됨.");
		}
		
		//에러가 안난다면 catch문은 빠져나오고 try문과 이 문장만 출력.
		System.out.println("try/catch가 끝나고 난 후");
		
		/*
		얘도 에러가 나든 안나든 어차피 실행되는데 굳이 finally가 있어야하나?
		왜냐면, catch문에는 return을 쓸 수 있음. 에러 찾고나면 그냥 그 다음은 실행시키지 말아라. 
		에러가 있고, return적어주고나면 finally는 실행하지만 마지막 문장은 실행안됨.
		*/
	}

}
