import java.io.IOException;

public class Exam2 {

	public static void main(String[] args) throws IOException{
		// TODO 예제2
		/*
		 * 도움말 시스템
		 * 1. 반복문을 이용해서 계속 사용할 수 있게 수정
		 * 2. 끝나는 조건: 메뉴에서 q를 입력하면 종료. 
		 */
		
        for(; ;) {

            char choice;

            System.out.println("Help on: ");
            System.out.println("  1. if");
            System.out.println("  2. switch");
            System.out.print("Choose one(if you enter 'q', program will be ended: ");
            choice = (char) System.in.read();

            System.out.println("\n");
            System.in.skip(2);
            
            if(choice == 'q') {
                System.out.println(" 프로그램 종료");
                break;
            }
            
            Exam2_class.Switch(choice); 


        }
	
	}
	
}
