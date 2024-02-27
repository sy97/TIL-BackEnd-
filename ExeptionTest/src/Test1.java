
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 예외처리 안했을 때
		int[] arr = new int[3];
		
		System.out.println("첫번째 예외처리 테스트");
		
		에러는 안나지만, 실행이안됨.
		배열 범위를 넘어서 값을 넣었으니까.
		근데 왜 코드짤 때는 에러가 안났나? 
		배열은 실행하기 전까지는 공간을 만들지 않음. 실행하고나서 만들기때문에 짤 때는 에러가안남.
		이런걸 예외라고 함.
		이때 콘솔에 나오는 에러메세지는 JVM이 보여주는거임. 제어권이 JVM에게 있는것.
		그래서 제어권을 뺏기지말고 내가 가지고있어야함.
		
		arr[7] = 10;
		System.out.println("이 메시지가 보이는가?");
		*/
		
		//예외처리 할 때
		try { //정확한 에러위치가 아닌 곳에서 묶어줘도됨.
		int[] arr = new int[3];
		
		System.out.println("첫번째 예외처리 테스트");
		
		
		//arr[7] = 10;
		arr[0] = 10/0 ; //어떤 특정 숫자를 0으로 나누면 무한대값이 나오기때문에 에러임.이것도 컴파일할땐 오류안남.
		
		//오류가 여러개라면?
		//catch여러개 쓰기.
		}
		catch(ArrayIndexOutOfBoundsException e) { //어떤 오류가발생할지 클래스로 넣어줘야함. 
			//하지만 그 수많은 클래스중에 어떤 오류가날지 어떻게 알고 찾아쓰지?
			//일부러 처음에 오류내기. 그 메세지에서 어떤 클래스 쓰는지 알려줌.
		System.out.println("배열의 인덱스를 벗어났습니다. :"+ e );
		//왜 에러가났는지 원인까지 발생하게.
		}
		catch(ArithmeticException e) {
			System.out.println("산술 연산을 잘못했습니다. : "+e);
		}
		
		//모든 오류를 잡으려면 상위 클래스인, 즉 부모를 설정해주면됨.
		catch(RuntimeException e) {
			System.out.println("런타임 오류 발생");
		}
		//밑으로 내려갈수록 부모를 설정해주는게좋음.
		catch(Exception e) {
			System.out.println("오류발생");
		}
		
		//프로그램이 중간에 끝나지않고 마지막까지 진행됨.
		System.out.println("이 메시지가 보이는가?");
	}

}
