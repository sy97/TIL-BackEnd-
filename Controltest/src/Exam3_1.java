import java.util.Scanner;

public class Exam3_1 {

	public static void main(String[] args) {
		// TODO 예제3-1
		/*
		 * 1.'.'이 입력될 때까지 키보드 입력을 읽어오는 프로그램 
		 * 입력된 공백 문자의 수를 세고, 그 총합을 프로그램 마지막에 출력할 수 있도록 작성
		 * ??...
		 * 계속 입력하다가 .을치고 엔터를치면 종료되고 그동안 입력됐던것을 출력, 공백을 센다..
		 * 공백을 센다.
		 * 이것도 아스키코드로,, ?.. 근데어떻게?..
		 * 
		 * 
		 */
        int space = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력하세요:");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i ++) {
            char ch = str.charAt(i);
            System.out.println(ch);
            if(ch == 32){
                space++;
                }

            }
        System.out.println("space :" + space);

	}

}
