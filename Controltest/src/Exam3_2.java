import java.util.Scanner;

public class Exam3_2 {
	public static void main(String[] args) {
		// TODO 예제3-2
		
		/*
		 * 2.키보드로 문자를 입력받아서 소문자는 대문자로, 대문자는 소문자로 변경시켜 출력하는 프로그램(toupper, tolower)
		 * '.'이 입력되면 종료, 마지막에 대/소문자의 수를 출력 
		 * +아스키 코드니까 32를 해주는 방법..??
		 */
        int upper = 0;
        int lower = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        String st = sc.nextLine();
        for(int i=0 ; i <st.length(); i++ ) {
            char temp = st.charAt(i);
            if(temp>='A' && temp<='Z'){
                 temp=(char)(temp+32);
                 upper++;
            }
            else if(temp>='a' && temp<='z'){
                temp=(char)(temp-32);
                lower++;

            }
            System.out.println(temp);

        }
        System.out.println("대문자의 수:" + upper);
        System.out.println("소문자의 수:" + lower);
	}
}
