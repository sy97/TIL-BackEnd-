import java.util.Scanner;

public class Exam1_3 {

	public static void main(String[] args) {
		/*
		 * 3.전자계산기(사칙연산)를 반복문을 이용하여 작성하시오.
		 * 조건: x를 입력하면 종료(if op == 'x') { break;}
		 */
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        String op;

        for( ; ; ){
            System.out.print("첫 번째 숫자를 입력하세요.:");
            num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요.:");
            num2 = sc.nextInt();

            sc.nextLine();
            System.out.print("사칙연산 중 하나를 입력하세요.(x를입력하면 종료):");
            op = sc.nextLine();

            if(op.equals("x")){
                System.out.println("프로그램 종료.");
                break;
            }
            else if(op.equals("+")){
                System.out.println(num1 + op + num2 + " = " + (num1+num2));
            }
            else if(op.equals("*")){
                System.out.println(num1 + op + num2 + " = " + (num1*num2));
            }
            else if(op.equals("-")){
                System.out.println(num1 + op + num2 + " = " + (num1-num2));
            }
            else if(op.equals("/")){
                System.out.println(num1 + op + num2 + " = " + (num1/num2));
            }



        }
		
	}

}
