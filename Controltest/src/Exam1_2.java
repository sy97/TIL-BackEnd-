//import java.util.Scanner;

import java.io.IOException;

public class Exam1_2 {
	public static void main(String[] args) throws IOException {
	/*
	 * 2.키보드로부터 숫자를 입력받아 합게를 출력하는 예제
	 * 조건1: 0을 입력하면 종료
	 * 조건2: 총 합계와 함께 홀수의 합과 짝수의 합도 구하시오. (%2) 
	 */
        int sum = 0;
        int even = 0;
        int odd = 0;
        
        //Scanner sc = new Scanner(System.in);


System.out.print("숫자입력(0을 입력하면 종료)");
        for( ; ; ) {
            int input = System.in.read();
            if(input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += input;

            if(input % 2 == 0) {
                even += input;
            }
            else if(input % 2 != 0) {
                odd += input;
            }
        }
        System.out.println("총 합계: "+ sum);
        System.out.println("짝수 합계: "+even);
        System.out.println("홀수 합계: "+odd);
		
	}
}